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
public class UpdateFileCommand extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5988627096775071408L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UpdateFileCommand\",\"namespace\":\"avro.commands\",\"fields\":[{\"name\":\"file\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"content\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UpdateFileCommand> ENCODER =
      new BinaryMessageEncoder<UpdateFileCommand>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UpdateFileCommand> DECODER =
      new BinaryMessageDecoder<UpdateFileCommand>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UpdateFileCommand> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UpdateFileCommand> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UpdateFileCommand>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UpdateFileCommand to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UpdateFileCommand from a ByteBuffer. */
  public static UpdateFileCommand fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String file;
  @Deprecated public java.lang.String content;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UpdateFileCommand() {}

  /**
   * All-args constructor.
   * @param file The new value for file
   * @param content The new value for content
   */
  public UpdateFileCommand(java.lang.String file, java.lang.String content) {
    this.file = file;
    this.content = content;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return file;
    case 1: return content;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: file = (java.lang.String)value$; break;
    case 1: content = (java.lang.String)value$; break;
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
   * Gets the value of the 'content' field.
   * @return The value of the 'content' field.
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.lang.String value) {
    this.content = value;
  }

  /**
   * Creates a new UpdateFileCommand RecordBuilder.
   * @return A new UpdateFileCommand RecordBuilder
   */
  public static avro.commands.UpdateFileCommand.Builder newBuilder() {
    return new avro.commands.UpdateFileCommand.Builder();
  }

  /**
   * Creates a new UpdateFileCommand RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UpdateFileCommand RecordBuilder
   */
  public static avro.commands.UpdateFileCommand.Builder newBuilder(avro.commands.UpdateFileCommand.Builder other) {
    return new avro.commands.UpdateFileCommand.Builder(other);
  }

  /**
   * Creates a new UpdateFileCommand RecordBuilder by copying an existing UpdateFileCommand instance.
   * @param other The existing instance to copy.
   * @return A new UpdateFileCommand RecordBuilder
   */
  public static avro.commands.UpdateFileCommand.Builder newBuilder(avro.commands.UpdateFileCommand other) {
    return new avro.commands.UpdateFileCommand.Builder(other);
  }

  /**
   * RecordBuilder for UpdateFileCommand instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UpdateFileCommand>
    implements org.apache.avro.data.RecordBuilder<UpdateFileCommand> {

    private java.lang.String file;
    private java.lang.String content;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.commands.UpdateFileCommand.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.file)) {
        this.file = data().deepCopy(fields()[0].schema(), other.file);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UpdateFileCommand instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.commands.UpdateFileCommand other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.file)) {
        this.file = data().deepCopy(fields()[0].schema(), other.file);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
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
    public avro.commands.UpdateFileCommand.Builder setFile(java.lang.String value) {
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
    public avro.commands.UpdateFileCommand.Builder clearFile() {
      file = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'content' field.
      * @return The value.
      */
    public java.lang.String getContent() {
      return content;
    }

    /**
      * Sets the value of the 'content' field.
      * @param value The value of 'content'.
      * @return This builder.
      */
    public avro.commands.UpdateFileCommand.Builder setContent(java.lang.String value) {
      validate(fields()[1], value);
      this.content = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'content' field has been set.
      * @return True if the 'content' field has been set, false otherwise.
      */
    public boolean hasContent() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'content' field.
      * @return This builder.
      */
    public avro.commands.UpdateFileCommand.Builder clearContent() {
      content = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UpdateFileCommand build() {
      try {
        UpdateFileCommand record = new UpdateFileCommand();
        record.file = fieldSetFlags()[0] ? this.file : (java.lang.String) defaultValue(fields()[0]);
        record.content = fieldSetFlags()[1] ? this.content : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UpdateFileCommand>
    WRITER$ = (org.apache.avro.io.DatumWriter<UpdateFileCommand>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UpdateFileCommand>
    READER$ = (org.apache.avro.io.DatumReader<UpdateFileCommand>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
