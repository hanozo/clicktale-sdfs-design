package processes;

import avro.commands.*;
import avro.namenode.DataNodeInfo;
import avro.namenode.NameNodeRPC;
import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.specific.SpecificRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

/**
 * Created by user on 02/10/2017.
 */
public class CommandExecutor {

    private static final Logger logger = LogManager.getLogger();
    private String namenodeHost = Optional.ofNullable(System.getenv("NAME_NODE")).orElse(InetAddress.getLocalHost().getHostName());

    public CommandExecutor() throws UnknownHostException {
    }


    /**
     * There is no native polymorphism avro support hence ruining the command design pattern
     *
     * @param cmd
     * @throws AvroRemoteException
     */
    public void execute(SpecificRecord cmd) throws IOException {

        List<DataNodeInfo> nodes;

        try (NettyTransceiver netty = new NettyTransceiver(new InetSocketAddress(namenodeHost, 65111))) {

            NameNodeRPC proxy = SpecificRequestor.getClient(NameNodeRPC.class, netty);

            nodes = proxy.askForNodes(getPath(cmd));

            logger.info("askForNodes replied with: " + nodes);
        }

        if (nodes != null) {

            for (DataNodeInfo node : nodes) {

                String host = node.getAddress().toString();

                try (NettyTransceiver netty = new NettyTransceiver(new InetSocketAddress(host, node.getPort()))) {

                    DataNodeRPC proxy = SpecificRequestor.getClient(DataNodeRPC.class, netty);

                    if (cmd instanceof MakeDirCommand) {
                        proxy.makeDir((MakeDirCommand) cmd);
                    } else if (cmd instanceof RemoveDirCommand) {
                        proxy.removeDir((RemoveDirCommand) cmd);
                    } else if (cmd instanceof RenameDirCommand) {
                        proxy.renameDir((RenameDirCommand) cmd);
                    } else if (cmd instanceof CreateFileCommand) {
                        proxy.createFile((CreateFileCommand) cmd);
                    } else if (cmd instanceof RemoveFileCommand) {
                        proxy.removeFile((RemoveFileCommand) cmd);
                    } else if (cmd instanceof UpdateFileCommand) {
                        proxy.updateFile((UpdateFileCommand) cmd);
                    }
                } catch (Exception e) {
                    logger.error(e);
                }
            }
        }
    }

    private String getPath(SpecificRecord cmd) {

        if (cmd instanceof MakeDirCommand) {
            return ((MakeDirCommand) cmd).getPath().toString();
        } else if (cmd instanceof RemoveDirCommand) {
            return ((RemoveDirCommand) cmd).getPath().toString();
        } else if (cmd instanceof RenameDirCommand) {
            return ((RenameDirCommand) cmd).getOldName().toString();
        } else if (cmd instanceof CreateFileCommand) {
            return ((CreateFileCommand) cmd).getFile().toString();
        } else if (cmd instanceof RemoveFileCommand) {
            return ((RemoveFileCommand) cmd).getFile().toString();
        } else {
            return ((UpdateFileCommand) cmd).getFile().toString();
        }
    }
}