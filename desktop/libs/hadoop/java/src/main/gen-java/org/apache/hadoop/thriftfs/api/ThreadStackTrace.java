/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.thriftfs.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Info about a thread with its corresponding stack trace
 */
public class ThreadStackTrace implements org.apache.thrift.TBase<ThreadStackTrace, ThreadStackTrace._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThreadStackTrace");

  private static final org.apache.thrift.protocol.TField THREAD_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("threadName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField THREAD_STRING_REPRESENTATION_FIELD_DESC = new org.apache.thrift.protocol.TField("threadStringRepresentation", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_DAEMON_FIELD_DESC = new org.apache.thrift.protocol.TField("isDaemon", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField STACK_TRACE_FIELD_DESC = new org.apache.thrift.protocol.TField("stackTrace", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThreadStackTraceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThreadStackTraceTupleSchemeFactory());
  }

  public String threadName; // required
  public String threadStringRepresentation; // required
  public boolean isDaemon; // required
  public List<StackTraceElement> stackTrace; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_NAME((short)1, "threadName"),
    THREAD_STRING_REPRESENTATION((short)2, "threadStringRepresentation"),
    IS_DAEMON((short)3, "isDaemon"),
    STACK_TRACE((short)4, "stackTrace");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // THREAD_NAME
          return THREAD_NAME;
        case 2: // THREAD_STRING_REPRESENTATION
          return THREAD_STRING_REPRESENTATION;
        case 3: // IS_DAEMON
          return IS_DAEMON;
        case 4: // STACK_TRACE
          return STACK_TRACE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISDAEMON_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THREAD_NAME, new org.apache.thrift.meta_data.FieldMetaData("threadName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.THREAD_STRING_REPRESENTATION, new org.apache.thrift.meta_data.FieldMetaData("threadStringRepresentation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_DAEMON, new org.apache.thrift.meta_data.FieldMetaData("isDaemon", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STACK_TRACE, new org.apache.thrift.meta_data.FieldMetaData("stackTrace", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StackTraceElement.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThreadStackTrace.class, metaDataMap);
  }

  public ThreadStackTrace() {
  }

  public ThreadStackTrace(
    String threadName,
    String threadStringRepresentation,
    boolean isDaemon,
    List<StackTraceElement> stackTrace)
  {
    this();
    this.threadName = threadName;
    this.threadStringRepresentation = threadStringRepresentation;
    this.isDaemon = isDaemon;
    setIsDaemonIsSet(true);
    this.stackTrace = stackTrace;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThreadStackTrace(ThreadStackTrace other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetThreadName()) {
      this.threadName = other.threadName;
    }
    if (other.isSetThreadStringRepresentation()) {
      this.threadStringRepresentation = other.threadStringRepresentation;
    }
    this.isDaemon = other.isDaemon;
    if (other.isSetStackTrace()) {
      List<StackTraceElement> __this__stackTrace = new ArrayList<StackTraceElement>();
      for (StackTraceElement other_element : other.stackTrace) {
        __this__stackTrace.add(new StackTraceElement(other_element));
      }
      this.stackTrace = __this__stackTrace;
    }
  }

  public ThreadStackTrace deepCopy() {
    return new ThreadStackTrace(this);
  }

  @Override
  public void clear() {
    this.threadName = null;
    this.threadStringRepresentation = null;
    setIsDaemonIsSet(false);
    this.isDaemon = false;
    this.stackTrace = null;
  }

  public String getThreadName() {
    return this.threadName;
  }

  public ThreadStackTrace setThreadName(String threadName) {
    this.threadName = threadName;
    return this;
  }

  public void unsetThreadName() {
    this.threadName = null;
  }

  /** Returns true if field threadName is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadName() {
    return this.threadName != null;
  }

  public void setThreadNameIsSet(boolean value) {
    if (!value) {
      this.threadName = null;
    }
  }

  public String getThreadStringRepresentation() {
    return this.threadStringRepresentation;
  }

  public ThreadStackTrace setThreadStringRepresentation(String threadStringRepresentation) {
    this.threadStringRepresentation = threadStringRepresentation;
    return this;
  }

  public void unsetThreadStringRepresentation() {
    this.threadStringRepresentation = null;
  }

  /** Returns true if field threadStringRepresentation is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadStringRepresentation() {
    return this.threadStringRepresentation != null;
  }

  public void setThreadStringRepresentationIsSet(boolean value) {
    if (!value) {
      this.threadStringRepresentation = null;
    }
  }

  public boolean isIsDaemon() {
    return this.isDaemon;
  }

  public ThreadStackTrace setIsDaemon(boolean isDaemon) {
    this.isDaemon = isDaemon;
    setIsDaemonIsSet(true);
    return this;
  }

  public void unsetIsDaemon() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISDAEMON_ISSET_ID);
  }

  /** Returns true if field isDaemon is set (has been assigned a value) and false otherwise */
  public boolean isSetIsDaemon() {
    return EncodingUtils.testBit(__isset_bitfield, __ISDAEMON_ISSET_ID);
  }

  public void setIsDaemonIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISDAEMON_ISSET_ID, value);
  }

  public int getStackTraceSize() {
    return (this.stackTrace == null) ? 0 : this.stackTrace.size();
  }

  public java.util.Iterator<StackTraceElement> getStackTraceIterator() {
    return (this.stackTrace == null) ? null : this.stackTrace.iterator();
  }

  public void addToStackTrace(StackTraceElement elem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<StackTraceElement>();
    }
    this.stackTrace.add(elem);
  }

  public List<StackTraceElement> getStackTrace() {
    return this.stackTrace;
  }

  public ThreadStackTrace setStackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public void unsetStackTrace() {
    this.stackTrace = null;
  }

  /** Returns true if field stackTrace is set (has been assigned a value) and false otherwise */
  public boolean isSetStackTrace() {
    return this.stackTrace != null;
  }

  public void setStackTraceIsSet(boolean value) {
    if (!value) {
      this.stackTrace = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case THREAD_NAME:
      if (value == null) {
        unsetThreadName();
      } else {
        setThreadName((String)value);
      }
      break;

    case THREAD_STRING_REPRESENTATION:
      if (value == null) {
        unsetThreadStringRepresentation();
      } else {
        setThreadStringRepresentation((String)value);
      }
      break;

    case IS_DAEMON:
      if (value == null) {
        unsetIsDaemon();
      } else {
        setIsDaemon((Boolean)value);
      }
      break;

    case STACK_TRACE:
      if (value == null) {
        unsetStackTrace();
      } else {
        setStackTrace((List<StackTraceElement>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case THREAD_NAME:
      return getThreadName();

    case THREAD_STRING_REPRESENTATION:
      return getThreadStringRepresentation();

    case IS_DAEMON:
      return Boolean.valueOf(isIsDaemon());

    case STACK_TRACE:
      return getStackTrace();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case THREAD_NAME:
      return isSetThreadName();
    case THREAD_STRING_REPRESENTATION:
      return isSetThreadStringRepresentation();
    case IS_DAEMON:
      return isSetIsDaemon();
    case STACK_TRACE:
      return isSetStackTrace();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThreadStackTrace)
      return this.equals((ThreadStackTrace)that);
    return false;
  }

  public boolean equals(ThreadStackTrace that) {
    if (that == null)
      return false;

    boolean this_present_threadName = true && this.isSetThreadName();
    boolean that_present_threadName = true && that.isSetThreadName();
    if (this_present_threadName || that_present_threadName) {
      if (!(this_present_threadName && that_present_threadName))
        return false;
      if (!this.threadName.equals(that.threadName))
        return false;
    }

    boolean this_present_threadStringRepresentation = true && this.isSetThreadStringRepresentation();
    boolean that_present_threadStringRepresentation = true && that.isSetThreadStringRepresentation();
    if (this_present_threadStringRepresentation || that_present_threadStringRepresentation) {
      if (!(this_present_threadStringRepresentation && that_present_threadStringRepresentation))
        return false;
      if (!this.threadStringRepresentation.equals(that.threadStringRepresentation))
        return false;
    }

    boolean this_present_isDaemon = true;
    boolean that_present_isDaemon = true;
    if (this_present_isDaemon || that_present_isDaemon) {
      if (!(this_present_isDaemon && that_present_isDaemon))
        return false;
      if (this.isDaemon != that.isDaemon)
        return false;
    }

    boolean this_present_stackTrace = true && this.isSetStackTrace();
    boolean that_present_stackTrace = true && that.isSetStackTrace();
    if (this_present_stackTrace || that_present_stackTrace) {
      if (!(this_present_stackTrace && that_present_stackTrace))
        return false;
      if (!this.stackTrace.equals(that.stackTrace))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ThreadStackTrace other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThreadStackTrace typedOther = (ThreadStackTrace)other;

    lastComparison = Boolean.valueOf(isSetThreadName()).compareTo(typedOther.isSetThreadName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadName, typedOther.threadName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThreadStringRepresentation()).compareTo(typedOther.isSetThreadStringRepresentation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadStringRepresentation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadStringRepresentation, typedOther.threadStringRepresentation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsDaemon()).compareTo(typedOther.isSetIsDaemon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDaemon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isDaemon, typedOther.isDaemon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStackTrace()).compareTo(typedOther.isSetStackTrace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStackTrace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stackTrace, typedOther.stackTrace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThreadStackTrace(");
    boolean first = true;

    sb.append("threadName:");
    if (this.threadName == null) {
      sb.append("null");
    } else {
      sb.append(this.threadName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("threadStringRepresentation:");
    if (this.threadStringRepresentation == null) {
      sb.append("null");
    } else {
      sb.append(this.threadStringRepresentation);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isDaemon:");
    sb.append(this.isDaemon);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stackTrace:");
    if (this.stackTrace == null) {
      sb.append("null");
    } else {
      sb.append(this.stackTrace);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThreadStackTraceStandardSchemeFactory implements SchemeFactory {
    public ThreadStackTraceStandardScheme getScheme() {
      return new ThreadStackTraceStandardScheme();
    }
  }

  private static class ThreadStackTraceStandardScheme extends StandardScheme<ThreadStackTrace> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThreadStackTrace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // THREAD_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.threadName = iprot.readString();
              struct.setThreadNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // THREAD_STRING_REPRESENTATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.threadStringRepresentation = iprot.readString();
              struct.setThreadStringRepresentationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_DAEMON
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isDaemon = iprot.readBool();
              struct.setIsDaemonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STACK_TRACE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.stackTrace = new ArrayList<StackTraceElement>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  StackTraceElement _elem2; // required
                  _elem2 = new StackTraceElement();
                  _elem2.read(iprot);
                  struct.stackTrace.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setStackTraceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThreadStackTrace struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.threadName != null) {
        oprot.writeFieldBegin(THREAD_NAME_FIELD_DESC);
        oprot.writeString(struct.threadName);
        oprot.writeFieldEnd();
      }
      if (struct.threadStringRepresentation != null) {
        oprot.writeFieldBegin(THREAD_STRING_REPRESENTATION_FIELD_DESC);
        oprot.writeString(struct.threadStringRepresentation);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_DAEMON_FIELD_DESC);
      oprot.writeBool(struct.isDaemon);
      oprot.writeFieldEnd();
      if (struct.stackTrace != null) {
        oprot.writeFieldBegin(STACK_TRACE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.stackTrace.size()));
          for (StackTraceElement _iter3 : struct.stackTrace)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThreadStackTraceTupleSchemeFactory implements SchemeFactory {
    public ThreadStackTraceTupleScheme getScheme() {
      return new ThreadStackTraceTupleScheme();
    }
  }

  private static class ThreadStackTraceTupleScheme extends TupleScheme<ThreadStackTrace> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThreadStackTrace struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetThreadName()) {
        optionals.set(0);
      }
      if (struct.isSetThreadStringRepresentation()) {
        optionals.set(1);
      }
      if (struct.isSetIsDaemon()) {
        optionals.set(2);
      }
      if (struct.isSetStackTrace()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetThreadName()) {
        oprot.writeString(struct.threadName);
      }
      if (struct.isSetThreadStringRepresentation()) {
        oprot.writeString(struct.threadStringRepresentation);
      }
      if (struct.isSetIsDaemon()) {
        oprot.writeBool(struct.isDaemon);
      }
      if (struct.isSetStackTrace()) {
        {
          oprot.writeI32(struct.stackTrace.size());
          for (StackTraceElement _iter4 : struct.stackTrace)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThreadStackTrace struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.threadName = iprot.readString();
        struct.setThreadNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.threadStringRepresentation = iprot.readString();
        struct.setThreadStringRepresentationIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isDaemon = iprot.readBool();
        struct.setIsDaemonIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.stackTrace = new ArrayList<StackTraceElement>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            StackTraceElement _elem7; // required
            _elem7 = new StackTraceElement();
            _elem7.read(iprot);
            struct.stackTrace.add(_elem7);
          }
        }
        struct.setStackTraceIsSet(true);
      }
    }
  }

}
