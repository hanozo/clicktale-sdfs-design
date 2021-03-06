/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.commands;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RemoveFileCommand extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5211288535649161220L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RemoveFileCommand\",\"namespace\":\"avro.commands\",\"fields\":[{\"name\":\"file\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RemoveFileCommand> ENCODER =
      new BinaryMessageEncoder<RemoveFileCommand>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RemoveFileCommand> DECODER =
      new BinaryMessageDecoder<RemoveFileCommand>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<RemoveFileCommand> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<RemoveFileCommand> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RemoveFileCommand>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this RemoveFileCommand to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a RemoveFileCommand from a ByteBuffer. */
  public static RemoveFileCommand fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String file;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RemoveFileCommand() {}

  /**
   * All-args constructor.
   * @param file The new value for file
   */
  public RemoveFileCommand(java.lang.String file) {
    this.file = file;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return file;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: file = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'file' field.
   * @return The value of the 'file' field.
   */
  public java.lang.String getFile() {
    return file;
  }

  /**
   * Sets the value of the 'file' field.
   * @param value the value to set.
   */
  public void setFile(java.lang.String value) {
    this.file = value;
  }

  /**
   * Creates a new RemoveFileCommand RecordBuilder.
   * @return A new RemoveFileCommand RecordBuilder
   */
  public static avro.commands.RemoveFileCommand.Builder newBuilder() {
    return new avro.commands.RemoveFileCommand.Builder();
  }

  /**
   * Creates a new RemoveFileCommand RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RemoveFileCommand RecordBuilder
   */
  public static avro.commands.RemoveFileCommand.Builder newBuilder(avro.commands.RemoveFileCommand.Builder other) {
    return new avro.commands.RemoveFileCommand.Builder(other);
  }

  /**
   * Creates a new RemoveFileCommand RecordBuilder by copying an existing RemoveFileCommand instance.
   * @param other The existing instance to copy.
   * @return A new RemoveFileCommand RecordBuilder
   */
  public static avro.commands.RemoveFileCommand.Builder newBuilder(avro.commands.RemoveFileCommand other) {
    return new avro.commands.RemoveFileCommand.Builder(other);
  }

  /**
   * RecordBuilder for RemoveFileCommand instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RemoveFileCommand>
    implements org.apache.avro.data.RecordBuilder<RemoveFileCommand> {

    private java.lang.String file;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.commands.RemoveFileCommand.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.file)) {
        this.file = data().deepCopy(fields()[0].schema(), other.file);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RemoveFileCommand instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.commands.RemoveFileCommand other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.file)) {
        this.file = data().deepCopy(fields()[0].schema(), other.file);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'file' field.
      * @return The value.
      */
    public java.lang.String getFile() {
      return file;
    }

    /**
      * Sets the value of the 'file' field.
      * @param value The value of 'file'.
      * @return This builder.
      */
    public avro.commands.RemoveFileCommand.Builder setFile(java.lang.String value) {
      validate(fields()[0], value);
      this.file = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'file' field has been set.
      * @return True if the 'file' field has been set, false otherwise.
      */
    public boolean hasFile() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'file' field.
      * @return This builder.
      */
    public avro.commands.RemoveFileCommand.Builder clearFile() {
      file = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RemoveFileCommand build() {
      try {
        RemoveFileCommand record = new RemoveFileCommand();
        record.file = fieldSetFlags()[0] ? this.file : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RemoveFileCommand>
    WRITER$ = (org.apache.avro.io.DatumWriter<RemoveFileCommand>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RemoveFileCommand>
    READER$ = (org.apache.avro.io.DatumReader<RemoveFileCommand>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
