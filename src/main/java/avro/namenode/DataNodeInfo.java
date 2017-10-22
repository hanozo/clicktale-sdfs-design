/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.namenode;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataNodeInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4819610795599398454L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataNodeInfo\",\"namespace\":\"avro.namenode\",\"fields\":[{\"name\":\"address\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"port\",\"type\":\"int\"},{\"name\":\"diskUsage\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DataNodeInfo> ENCODER =
      new BinaryMessageEncoder<DataNodeInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DataNodeInfo> DECODER =
      new BinaryMessageDecoder<DataNodeInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<DataNodeInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<DataNodeInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DataNodeInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this DataNodeInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a DataNodeInfo from a ByteBuffer. */
  public static DataNodeInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String address;
  @Deprecated public int port;
  @Deprecated public long diskUsage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataNodeInfo() {}

  /**
   * All-args constructor.
   * @param address The new value for address
   * @param port The new value for port
   * @param diskUsage The new value for diskUsage
   */
  public DataNodeInfo(java.lang.String address, java.lang.Integer port, java.lang.Long diskUsage) {
    this.address = address;
    this.port = port;
    this.diskUsage = diskUsage;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return address;
    case 1: return port;
    case 2: return diskUsage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: address = (java.lang.String)value$; break;
    case 1: port = (java.lang.Integer)value$; break;
    case 2: diskUsage = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.String value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'port' field.
   * @return The value of the 'port' field.
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Sets the value of the 'port' field.
   * @param value the value to set.
   */
  public void setPort(java.lang.Integer value) {
    this.port = value;
  }

  /**
   * Gets the value of the 'diskUsage' field.
   * @return The value of the 'diskUsage' field.
   */
  public java.lang.Long getDiskUsage() {
    return diskUsage;
  }

  /**
   * Sets the value of the 'diskUsage' field.
   * @param value the value to set.
   */
  public void setDiskUsage(java.lang.Long value) {
    this.diskUsage = value;
  }

  /**
   * Creates a new DataNodeInfo RecordBuilder.
   * @return A new DataNodeInfo RecordBuilder
   */
  public static avro.namenode.DataNodeInfo.Builder newBuilder() {
    return new avro.namenode.DataNodeInfo.Builder();
  }

  /**
   * Creates a new DataNodeInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataNodeInfo RecordBuilder
   */
  public static avro.namenode.DataNodeInfo.Builder newBuilder(avro.namenode.DataNodeInfo.Builder other) {
    return new avro.namenode.DataNodeInfo.Builder(other);
  }

  /**
   * Creates a new DataNodeInfo RecordBuilder by copying an existing DataNodeInfo instance.
   * @param other The existing instance to copy.
   * @return A new DataNodeInfo RecordBuilder
   */
  public static avro.namenode.DataNodeInfo.Builder newBuilder(avro.namenode.DataNodeInfo other) {
    return new avro.namenode.DataNodeInfo.Builder(other);
  }

  /**
   * RecordBuilder for DataNodeInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataNodeInfo>
    implements org.apache.avro.data.RecordBuilder<DataNodeInfo> {

    private java.lang.String address;
    private int port;
    private long diskUsage;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.namenode.DataNodeInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.diskUsage)) {
        this.diskUsage = data().deepCopy(fields()[2].schema(), other.diskUsage);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DataNodeInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.namenode.DataNodeInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.diskUsage)) {
        this.diskUsage = data().deepCopy(fields()[2].schema(), other.diskUsage);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.String getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public avro.namenode.DataNodeInfo.Builder setAddress(java.lang.String value) {
      validate(fields()[0], value);
      this.address = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public avro.namenode.DataNodeInfo.Builder clearAddress() {
      address = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'port' field.
      * @return The value.
      */
    public java.lang.Integer getPort() {
      return port;
    }

    /**
      * Sets the value of the 'port' field.
      * @param value The value of 'port'.
      * @return This builder.
      */
    public avro.namenode.DataNodeInfo.Builder setPort(int value) {
      validate(fields()[1], value);
      this.port = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'port' field has been set.
      * @return True if the 'port' field has been set, false otherwise.
      */
    public boolean hasPort() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'port' field.
      * @return This builder.
      */
    public avro.namenode.DataNodeInfo.Builder clearPort() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'diskUsage' field.
      * @return The value.
      */
    public java.lang.Long getDiskUsage() {
      return diskUsage;
    }

    /**
      * Sets the value of the 'diskUsage' field.
      * @param value The value of 'diskUsage'.
      * @return This builder.
      */
    public avro.namenode.DataNodeInfo.Builder setDiskUsage(long value) {
      validate(fields()[2], value);
      this.diskUsage = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'diskUsage' field has been set.
      * @return True if the 'diskUsage' field has been set, false otherwise.
      */
    public boolean hasDiskUsage() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'diskUsage' field.
      * @return This builder.
      */
    public avro.namenode.DataNodeInfo.Builder clearDiskUsage() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DataNodeInfo build() {
      try {
        DataNodeInfo record = new DataNodeInfo();
        record.address = fieldSetFlags()[0] ? this.address : (java.lang.String) defaultValue(fields()[0]);
        record.port = fieldSetFlags()[1] ? this.port : (java.lang.Integer) defaultValue(fields()[1]);
        record.diskUsage = fieldSetFlags()[2] ? this.diskUsage : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DataNodeInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<DataNodeInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DataNodeInfo>
    READER$ = (org.apache.avro.io.DatumReader<DataNodeInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
