/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.gatewayprofile;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Gateway Resource Profile
 * 
 * gatewayID:
 *  Unique identifier for the gateway assigned by Airavata. Corelate this to Airavata Admin API Gateway Registration.
 * 
 * credentialStoreToken:
 *  Gateway's defualt credential store token.
 * 
 * computeResourcePreferences:
 *  List of resource preferences for each of the registered compute resources.
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-22")
public class GatewayResourceProfile implements org.apache.thrift.TBase<GatewayResourceProfile, GatewayResourceProfile._Fields>, java.io.Serializable, Cloneable, Comparable<GatewayResourceProfile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GatewayResourceProfile");

  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREDENTIAL_STORE_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("credentialStoreToken", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COMPUTE_RESOURCE_PREFERENCES_FIELD_DESC = new org.apache.thrift.protocol.TField("computeResourcePreferences", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField STORAGE_PREFERENCES_FIELD_DESC = new org.apache.thrift.protocol.TField("storagePreferences", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GatewayResourceProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GatewayResourceProfileTupleSchemeFactory());
  }

  private String gatewayID; // required
  private String credentialStoreToken; // optional
  private List<ComputeResourcePreference> computeResourcePreferences; // optional
  private List<StoragePreference> storagePreferences; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GATEWAY_ID((short)1, "gatewayID"),
    CREDENTIAL_STORE_TOKEN((short)2, "credentialStoreToken"),
    COMPUTE_RESOURCE_PREFERENCES((short)3, "computeResourcePreferences"),
    STORAGE_PREFERENCES((short)4, "storagePreferences");

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
        case 1: // GATEWAY_ID
          return GATEWAY_ID;
        case 2: // CREDENTIAL_STORE_TOKEN
          return CREDENTIAL_STORE_TOKEN;
        case 3: // COMPUTE_RESOURCE_PREFERENCES
          return COMPUTE_RESOURCE_PREFERENCES;
        case 4: // STORAGE_PREFERENCES
          return STORAGE_PREFERENCES;
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
  private static final _Fields optionals[] = {_Fields.CREDENTIAL_STORE_TOKEN,_Fields.COMPUTE_RESOURCE_PREFERENCES,_Fields.STORAGE_PREFERENCES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREDENTIAL_STORE_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("credentialStoreToken", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPUTE_RESOURCE_PREFERENCES, new org.apache.thrift.meta_data.FieldMetaData("computeResourcePreferences", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComputeResourcePreference.class))));
    tmpMap.put(_Fields.STORAGE_PREFERENCES, new org.apache.thrift.meta_data.FieldMetaData("storagePreferences", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StoragePreference.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GatewayResourceProfile.class, metaDataMap);
  }

  public GatewayResourceProfile() {
  }

  public GatewayResourceProfile(
    String gatewayID)
  {
    this();
    this.gatewayID = gatewayID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GatewayResourceProfile(GatewayResourceProfile other) {
    if (other.isSetGatewayID()) {
      this.gatewayID = other.gatewayID;
    }
    if (other.isSetCredentialStoreToken()) {
      this.credentialStoreToken = other.credentialStoreToken;
    }
    if (other.isSetComputeResourcePreferences()) {
      List<ComputeResourcePreference> __this__computeResourcePreferences = new ArrayList<ComputeResourcePreference>(other.computeResourcePreferences.size());
      for (ComputeResourcePreference other_element : other.computeResourcePreferences) {
        __this__computeResourcePreferences.add(new ComputeResourcePreference(other_element));
      }
      this.computeResourcePreferences = __this__computeResourcePreferences;
    }
    if (other.isSetStoragePreferences()) {
      List<StoragePreference> __this__storagePreferences = new ArrayList<StoragePreference>(other.storagePreferences.size());
      for (StoragePreference other_element : other.storagePreferences) {
        __this__storagePreferences.add(new StoragePreference(other_element));
      }
      this.storagePreferences = __this__storagePreferences;
    }
  }

  public GatewayResourceProfile deepCopy() {
    return new GatewayResourceProfile(this);
  }

  @Override
  public void clear() {
    this.gatewayID = null;
    this.credentialStoreToken = null;
    this.computeResourcePreferences = null;
    this.storagePreferences = null;
  }

  public String getGatewayID() {
    return this.gatewayID;
  }

  public void setGatewayID(String gatewayID) {
    this.gatewayID = gatewayID;
  }

  public void unsetGatewayID() {
    this.gatewayID = null;
  }

  /** Returns true if field gatewayID is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayID() {
    return this.gatewayID != null;
  }

  public void setGatewayIDIsSet(boolean value) {
    if (!value) {
      this.gatewayID = null;
    }
  }

  public String getCredentialStoreToken() {
    return this.credentialStoreToken;
  }

  public void setCredentialStoreToken(String credentialStoreToken) {
    this.credentialStoreToken = credentialStoreToken;
  }

  public void unsetCredentialStoreToken() {
    this.credentialStoreToken = null;
  }

  /** Returns true if field credentialStoreToken is set (has been assigned a value) and false otherwise */
  public boolean isSetCredentialStoreToken() {
    return this.credentialStoreToken != null;
  }

  public void setCredentialStoreTokenIsSet(boolean value) {
    if (!value) {
      this.credentialStoreToken = null;
    }
  }

  public int getComputeResourcePreferencesSize() {
    return (this.computeResourcePreferences == null) ? 0 : this.computeResourcePreferences.size();
  }

  public java.util.Iterator<ComputeResourcePreference> getComputeResourcePreferencesIterator() {
    return (this.computeResourcePreferences == null) ? null : this.computeResourcePreferences.iterator();
  }

  public void addToComputeResourcePreferences(ComputeResourcePreference elem) {
    if (this.computeResourcePreferences == null) {
      this.computeResourcePreferences = new ArrayList<ComputeResourcePreference>();
    }
    this.computeResourcePreferences.add(elem);
  }

  public List<ComputeResourcePreference> getComputeResourcePreferences() {
    return this.computeResourcePreferences;
  }

  public void setComputeResourcePreferences(List<ComputeResourcePreference> computeResourcePreferences) {
    this.computeResourcePreferences = computeResourcePreferences;
  }

  public void unsetComputeResourcePreferences() {
    this.computeResourcePreferences = null;
  }

  /** Returns true if field computeResourcePreferences is set (has been assigned a value) and false otherwise */
  public boolean isSetComputeResourcePreferences() {
    return this.computeResourcePreferences != null;
  }

  public void setComputeResourcePreferencesIsSet(boolean value) {
    if (!value) {
      this.computeResourcePreferences = null;
    }
  }

  public int getStoragePreferencesSize() {
    return (this.storagePreferences == null) ? 0 : this.storagePreferences.size();
  }

  public java.util.Iterator<StoragePreference> getStoragePreferencesIterator() {
    return (this.storagePreferences == null) ? null : this.storagePreferences.iterator();
  }

  public void addToStoragePreferences(StoragePreference elem) {
    if (this.storagePreferences == null) {
      this.storagePreferences = new ArrayList<StoragePreference>();
    }
    this.storagePreferences.add(elem);
  }

  public List<StoragePreference> getStoragePreferences() {
    return this.storagePreferences;
  }

  public void setStoragePreferences(List<StoragePreference> storagePreferences) {
    this.storagePreferences = storagePreferences;
  }

  public void unsetStoragePreferences() {
    this.storagePreferences = null;
  }

  /** Returns true if field storagePreferences is set (has been assigned a value) and false otherwise */
  public boolean isSetStoragePreferences() {
    return this.storagePreferences != null;
  }

  public void setStoragePreferencesIsSet(boolean value) {
    if (!value) {
      this.storagePreferences = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayID();
      } else {
        setGatewayID((String)value);
      }
      break;

    case CREDENTIAL_STORE_TOKEN:
      if (value == null) {
        unsetCredentialStoreToken();
      } else {
        setCredentialStoreToken((String)value);
      }
      break;

    case COMPUTE_RESOURCE_PREFERENCES:
      if (value == null) {
        unsetComputeResourcePreferences();
      } else {
        setComputeResourcePreferences((List<ComputeResourcePreference>)value);
      }
      break;

    case STORAGE_PREFERENCES:
      if (value == null) {
        unsetStoragePreferences();
      } else {
        setStoragePreferences((List<StoragePreference>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GATEWAY_ID:
      return getGatewayID();

    case CREDENTIAL_STORE_TOKEN:
      return getCredentialStoreToken();

    case COMPUTE_RESOURCE_PREFERENCES:
      return getComputeResourcePreferences();

    case STORAGE_PREFERENCES:
      return getStoragePreferences();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GATEWAY_ID:
      return isSetGatewayID();
    case CREDENTIAL_STORE_TOKEN:
      return isSetCredentialStoreToken();
    case COMPUTE_RESOURCE_PREFERENCES:
      return isSetComputeResourcePreferences();
    case STORAGE_PREFERENCES:
      return isSetStoragePreferences();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GatewayResourceProfile)
      return this.equals((GatewayResourceProfile)that);
    return false;
  }

  public boolean equals(GatewayResourceProfile that) {
    if (that == null)
      return false;

    boolean this_present_gatewayID = true && this.isSetGatewayID();
    boolean that_present_gatewayID = true && that.isSetGatewayID();
    if (this_present_gatewayID || that_present_gatewayID) {
      if (!(this_present_gatewayID && that_present_gatewayID))
        return false;
      if (!this.gatewayID.equals(that.gatewayID))
        return false;
    }

    boolean this_present_credentialStoreToken = true && this.isSetCredentialStoreToken();
    boolean that_present_credentialStoreToken = true && that.isSetCredentialStoreToken();
    if (this_present_credentialStoreToken || that_present_credentialStoreToken) {
      if (!(this_present_credentialStoreToken && that_present_credentialStoreToken))
        return false;
      if (!this.credentialStoreToken.equals(that.credentialStoreToken))
        return false;
    }

    boolean this_present_computeResourcePreferences = true && this.isSetComputeResourcePreferences();
    boolean that_present_computeResourcePreferences = true && that.isSetComputeResourcePreferences();
    if (this_present_computeResourcePreferences || that_present_computeResourcePreferences) {
      if (!(this_present_computeResourcePreferences && that_present_computeResourcePreferences))
        return false;
      if (!this.computeResourcePreferences.equals(that.computeResourcePreferences))
        return false;
    }

    boolean this_present_storagePreferences = true && this.isSetStoragePreferences();
    boolean that_present_storagePreferences = true && that.isSetStoragePreferences();
    if (this_present_storagePreferences || that_present_storagePreferences) {
      if (!(this_present_storagePreferences && that_present_storagePreferences))
        return false;
      if (!this.storagePreferences.equals(that.storagePreferences))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_gatewayID = true && (isSetGatewayID());
    list.add(present_gatewayID);
    if (present_gatewayID)
      list.add(gatewayID);

    boolean present_credentialStoreToken = true && (isSetCredentialStoreToken());
    list.add(present_credentialStoreToken);
    if (present_credentialStoreToken)
      list.add(credentialStoreToken);

    boolean present_computeResourcePreferences = true && (isSetComputeResourcePreferences());
    list.add(present_computeResourcePreferences);
    if (present_computeResourcePreferences)
      list.add(computeResourcePreferences);

    boolean present_storagePreferences = true && (isSetStoragePreferences());
    list.add(present_storagePreferences);
    if (present_storagePreferences)
      list.add(storagePreferences);

    return list.hashCode();
  }

  @Override
  public int compareTo(GatewayResourceProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGatewayID()).compareTo(other.isSetGatewayID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayID, other.gatewayID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCredentialStoreToken()).compareTo(other.isSetCredentialStoreToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCredentialStoreToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.credentialStoreToken, other.credentialStoreToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComputeResourcePreferences()).compareTo(other.isSetComputeResourcePreferences());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComputeResourcePreferences()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.computeResourcePreferences, other.computeResourcePreferences);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStoragePreferences()).compareTo(other.isSetStoragePreferences());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoragePreferences()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storagePreferences, other.storagePreferences);
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
    StringBuilder sb = new StringBuilder("GatewayResourceProfile(");
    boolean first = true;

    sb.append("gatewayID:");
    if (this.gatewayID == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayID);
    }
    first = false;
    if (isSetCredentialStoreToken()) {
      if (!first) sb.append(", ");
      sb.append("credentialStoreToken:");
      if (this.credentialStoreToken == null) {
        sb.append("null");
      } else {
        sb.append(this.credentialStoreToken);
      }
      first = false;
    }
    if (isSetComputeResourcePreferences()) {
      if (!first) sb.append(", ");
      sb.append("computeResourcePreferences:");
      if (this.computeResourcePreferences == null) {
        sb.append("null");
      } else {
        sb.append(this.computeResourcePreferences);
      }
      first = false;
    }
    if (isSetStoragePreferences()) {
      if (!first) sb.append(", ");
      sb.append("storagePreferences:");
      if (this.storagePreferences == null) {
        sb.append("null");
      } else {
        sb.append(this.storagePreferences);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetGatewayID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayID' is unset! Struct:" + toString());
    }

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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GatewayResourceProfileStandardSchemeFactory implements SchemeFactory {
    public GatewayResourceProfileStandardScheme getScheme() {
      return new GatewayResourceProfileStandardScheme();
    }
  }

  private static class GatewayResourceProfileStandardScheme extends StandardScheme<GatewayResourceProfile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GatewayResourceProfile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayID = iprot.readString();
              struct.setGatewayIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREDENTIAL_STORE_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.credentialStoreToken = iprot.readString();
              struct.setCredentialStoreTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPUTE_RESOURCE_PREFERENCES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.computeResourcePreferences = new ArrayList<ComputeResourcePreference>(_list0.size);
                ComputeResourcePreference _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ComputeResourcePreference();
                  _elem1.read(iprot);
                  struct.computeResourcePreferences.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setComputeResourcePreferencesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STORAGE_PREFERENCES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.storagePreferences = new ArrayList<StoragePreference>(_list3.size);
                StoragePreference _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new StoragePreference();
                  _elem4.read(iprot);
                  struct.storagePreferences.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setStoragePreferencesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GatewayResourceProfile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.gatewayID != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayID);
        oprot.writeFieldEnd();
      }
      if (struct.credentialStoreToken != null) {
        if (struct.isSetCredentialStoreToken()) {
          oprot.writeFieldBegin(CREDENTIAL_STORE_TOKEN_FIELD_DESC);
          oprot.writeString(struct.credentialStoreToken);
          oprot.writeFieldEnd();
        }
      }
      if (struct.computeResourcePreferences != null) {
        if (struct.isSetComputeResourcePreferences()) {
          oprot.writeFieldBegin(COMPUTE_RESOURCE_PREFERENCES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.computeResourcePreferences.size()));
            for (ComputeResourcePreference _iter6 : struct.computeResourcePreferences)
            {
              _iter6.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.storagePreferences != null) {
        if (struct.isSetStoragePreferences()) {
          oprot.writeFieldBegin(STORAGE_PREFERENCES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.storagePreferences.size()));
            for (StoragePreference _iter7 : struct.storagePreferences)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GatewayResourceProfileTupleSchemeFactory implements SchemeFactory {
    public GatewayResourceProfileTupleScheme getScheme() {
      return new GatewayResourceProfileTupleScheme();
    }
  }

  private static class GatewayResourceProfileTupleScheme extends TupleScheme<GatewayResourceProfile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GatewayResourceProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.gatewayID);
      BitSet optionals = new BitSet();
      if (struct.isSetCredentialStoreToken()) {
        optionals.set(0);
      }
      if (struct.isSetComputeResourcePreferences()) {
        optionals.set(1);
      }
      if (struct.isSetStoragePreferences()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCredentialStoreToken()) {
        oprot.writeString(struct.credentialStoreToken);
      }
      if (struct.isSetComputeResourcePreferences()) {
        {
          oprot.writeI32(struct.computeResourcePreferences.size());
          for (ComputeResourcePreference _iter8 : struct.computeResourcePreferences)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetStoragePreferences()) {
        {
          oprot.writeI32(struct.storagePreferences.size());
          for (StoragePreference _iter9 : struct.storagePreferences)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GatewayResourceProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.gatewayID = iprot.readString();
      struct.setGatewayIDIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.credentialStoreToken = iprot.readString();
        struct.setCredentialStoreTokenIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.computeResourcePreferences = new ArrayList<ComputeResourcePreference>(_list10.size);
          ComputeResourcePreference _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new ComputeResourcePreference();
            _elem11.read(iprot);
            struct.computeResourcePreferences.add(_elem11);
          }
        }
        struct.setComputeResourcePreferencesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.storagePreferences = new ArrayList<StoragePreference>(_list13.size);
          StoragePreference _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new StoragePreference();
            _elem14.read(iprot);
            struct.storagePreferences.add(_elem14);
          }
        }
        struct.setStoragePreferencesIsSet(true);
      }
    }
  }

}

