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
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "replica_catalog_models_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace apache { namespace airavata { namespace model { namespace data { namespace resource {

int _kReplicaLocationCategoryValues[] = {
  ReplicaLocationCategory::GATEWAY_DATA_STORE,
  ReplicaLocationCategory::COMPUTE_RESOURCE,
  ReplicaLocationCategory::LONG_TERM_STORAGE_RESOURCE,
  ReplicaLocationCategory::OTHER
};
const char* _kReplicaLocationCategoryNames[] = {
  "GATEWAY_DATA_STORE",
  "COMPUTE_RESOURCE",
  "LONG_TERM_STORAGE_RESOURCE",
  "OTHER"
};
const std::map<int, const char*> _ReplicaLocationCategory_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(4, _kReplicaLocationCategoryValues, _kReplicaLocationCategoryNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

int _kReplicaPersistentTypeValues[] = {
  ReplicaPersistentType::TRANSIENT,
  ReplicaPersistentType::PERSISTENT
};
const char* _kReplicaPersistentTypeNames[] = {
  "TRANSIENT",
  "PERSISTENT"
};
const std::map<int, const char*> _ReplicaPersistentType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(2, _kReplicaPersistentTypeValues, _kReplicaPersistentTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));


DataResourceModel::~DataResourceModel() throw() {
}


void DataResourceModel::__set_resourceId(const std::string& val) {
  this->resourceId = val;
__isset.resourceId = true;
}

void DataResourceModel::__set_gatewayId(const std::string& val) {
  this->gatewayId = val;
__isset.gatewayId = true;
}

void DataResourceModel::__set_resourceName(const std::string& val) {
  this->resourceName = val;
__isset.resourceName = true;
}

void DataResourceModel::__set_resourceDescription(const std::string& val) {
  this->resourceDescription = val;
__isset.resourceDescription = true;
}

void DataResourceModel::__set_ownerName(const std::string& val) {
  this->ownerName = val;
__isset.ownerName = true;
}

void DataResourceModel::__set_resourceSize(const int32_t val) {
  this->resourceSize = val;
__isset.resourceSize = true;
}

void DataResourceModel::__set_creationTime(const int64_t val) {
  this->creationTime = val;
__isset.creationTime = true;
}

void DataResourceModel::__set_lastModifiedTime(const int64_t val) {
  this->lastModifiedTime = val;
__isset.lastModifiedTime = true;
}

void DataResourceModel::__set_resourceMetadata(const std::map<std::string, std::string> & val) {
  this->resourceMetadata = val;
__isset.resourceMetadata = true;
}

void DataResourceModel::__set_dataReplicaLocations(const std::vector<DataReplicaLocationModel> & val) {
  this->dataReplicaLocations = val;
__isset.dataReplicaLocations = true;
}

const char* DataResourceModel::ascii_fingerprint = "B62C7AC0978F39C377296FFA824B5766";
const uint8_t DataResourceModel::binary_fingerprint[16] = {0xB6,0x2C,0x7A,0xC0,0x97,0x8F,0x39,0xC3,0x77,0x29,0x6F,0xFA,0x82,0x4B,0x57,0x66};

uint32_t DataResourceModel::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->resourceId);
          this->__isset.resourceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->gatewayId);
          this->__isset.gatewayId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->resourceName);
          this->__isset.resourceName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->resourceDescription);
          this->__isset.resourceDescription = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->ownerName);
          this->__isset.ownerName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->resourceSize);
          this->__isset.resourceSize = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->creationTime);
          this->__isset.creationTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->lastModifiedTime);
          this->__isset.lastModifiedTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 9:
        if (ftype == ::apache::thrift::protocol::T_MAP) {
          {
            this->resourceMetadata.clear();
            uint32_t _size0;
            ::apache::thrift::protocol::TType _ktype1;
            ::apache::thrift::protocol::TType _vtype2;
            xfer += iprot->readMapBegin(_ktype1, _vtype2, _size0);
            uint32_t _i4;
            for (_i4 = 0; _i4 < _size0; ++_i4)
            {
              std::string _key5;
              xfer += iprot->readString(_key5);
              std::string& _val6 = this->resourceMetadata[_key5];
              xfer += iprot->readString(_val6);
            }
            xfer += iprot->readMapEnd();
          }
          this->__isset.resourceMetadata = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 10:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->dataReplicaLocations.clear();
            uint32_t _size7;
            ::apache::thrift::protocol::TType _etype10;
            xfer += iprot->readListBegin(_etype10, _size7);
            this->dataReplicaLocations.resize(_size7);
            uint32_t _i11;
            for (_i11 = 0; _i11 < _size7; ++_i11)
            {
              xfer += this->dataReplicaLocations[_i11].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.dataReplicaLocations = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DataResourceModel::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  oprot->incrementRecursionDepth();
  xfer += oprot->writeStructBegin("DataResourceModel");

  if (this->__isset.resourceId) {
    xfer += oprot->writeFieldBegin("resourceId", ::apache::thrift::protocol::T_STRING, 1);
    xfer += oprot->writeString(this->resourceId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.gatewayId) {
    xfer += oprot->writeFieldBegin("gatewayId", ::apache::thrift::protocol::T_STRING, 2);
    xfer += oprot->writeString(this->gatewayId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.resourceName) {
    xfer += oprot->writeFieldBegin("resourceName", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->resourceName);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.resourceDescription) {
    xfer += oprot->writeFieldBegin("resourceDescription", ::apache::thrift::protocol::T_STRING, 4);
    xfer += oprot->writeString(this->resourceDescription);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.ownerName) {
    xfer += oprot->writeFieldBegin("ownerName", ::apache::thrift::protocol::T_STRING, 5);
    xfer += oprot->writeString(this->ownerName);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.resourceSize) {
    xfer += oprot->writeFieldBegin("resourceSize", ::apache::thrift::protocol::T_I32, 6);
    xfer += oprot->writeI32(this->resourceSize);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.creationTime) {
    xfer += oprot->writeFieldBegin("creationTime", ::apache::thrift::protocol::T_I64, 7);
    xfer += oprot->writeI64(this->creationTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.lastModifiedTime) {
    xfer += oprot->writeFieldBegin("lastModifiedTime", ::apache::thrift::protocol::T_I64, 8);
    xfer += oprot->writeI64(this->lastModifiedTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.resourceMetadata) {
    xfer += oprot->writeFieldBegin("resourceMetadata", ::apache::thrift::protocol::T_MAP, 9);
    {
      xfer += oprot->writeMapBegin(::apache::thrift::protocol::T_STRING, ::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->resourceMetadata.size()));
      std::map<std::string, std::string> ::const_iterator _iter12;
      for (_iter12 = this->resourceMetadata.begin(); _iter12 != this->resourceMetadata.end(); ++_iter12)
      {
        xfer += oprot->writeString(_iter12->first);
        xfer += oprot->writeString(_iter12->second);
      }
      xfer += oprot->writeMapEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.dataReplicaLocations) {
    xfer += oprot->writeFieldBegin("dataReplicaLocations", ::apache::thrift::protocol::T_LIST, 10);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->dataReplicaLocations.size()));
      std::vector<DataReplicaLocationModel> ::const_iterator _iter13;
      for (_iter13 = this->dataReplicaLocations.begin(); _iter13 != this->dataReplicaLocations.end(); ++_iter13)
      {
        xfer += (*_iter13).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  oprot->decrementRecursionDepth();
  return xfer;
}

void swap(DataResourceModel &a, DataResourceModel &b) {
  using ::std::swap;
  swap(a.resourceId, b.resourceId);
  swap(a.gatewayId, b.gatewayId);
  swap(a.resourceName, b.resourceName);
  swap(a.resourceDescription, b.resourceDescription);
  swap(a.ownerName, b.ownerName);
  swap(a.resourceSize, b.resourceSize);
  swap(a.creationTime, b.creationTime);
  swap(a.lastModifiedTime, b.lastModifiedTime);
  swap(a.resourceMetadata, b.resourceMetadata);
  swap(a.dataReplicaLocations, b.dataReplicaLocations);
  swap(a.__isset, b.__isset);
}

DataResourceModel::DataResourceModel(const DataResourceModel& other14) {
  resourceId = other14.resourceId;
  gatewayId = other14.gatewayId;
  resourceName = other14.resourceName;
  resourceDescription = other14.resourceDescription;
  ownerName = other14.ownerName;
  resourceSize = other14.resourceSize;
  creationTime = other14.creationTime;
  lastModifiedTime = other14.lastModifiedTime;
  resourceMetadata = other14.resourceMetadata;
  dataReplicaLocations = other14.dataReplicaLocations;
  __isset = other14.__isset;
}
DataResourceModel& DataResourceModel::operator=(const DataResourceModel& other15) {
  resourceId = other15.resourceId;
  gatewayId = other15.gatewayId;
  resourceName = other15.resourceName;
  resourceDescription = other15.resourceDescription;
  ownerName = other15.ownerName;
  resourceSize = other15.resourceSize;
  creationTime = other15.creationTime;
  lastModifiedTime = other15.lastModifiedTime;
  resourceMetadata = other15.resourceMetadata;
  dataReplicaLocations = other15.dataReplicaLocations;
  __isset = other15.__isset;
  return *this;
}
std::ostream& operator<<(std::ostream& out, const DataResourceModel& obj) {
  using apache::thrift::to_string;
  out << "DataResourceModel(";
  out << "resourceId="; (obj.__isset.resourceId ? (out << to_string(obj.resourceId)) : (out << "<null>"));
  out << ", " << "gatewayId="; (obj.__isset.gatewayId ? (out << to_string(obj.gatewayId)) : (out << "<null>"));
  out << ", " << "resourceName="; (obj.__isset.resourceName ? (out << to_string(obj.resourceName)) : (out << "<null>"));
  out << ", " << "resourceDescription="; (obj.__isset.resourceDescription ? (out << to_string(obj.resourceDescription)) : (out << "<null>"));
  out << ", " << "ownerName="; (obj.__isset.ownerName ? (out << to_string(obj.ownerName)) : (out << "<null>"));
  out << ", " << "resourceSize="; (obj.__isset.resourceSize ? (out << to_string(obj.resourceSize)) : (out << "<null>"));
  out << ", " << "creationTime="; (obj.__isset.creationTime ? (out << to_string(obj.creationTime)) : (out << "<null>"));
  out << ", " << "lastModifiedTime="; (obj.__isset.lastModifiedTime ? (out << to_string(obj.lastModifiedTime)) : (out << "<null>"));
  out << ", " << "resourceMetadata="; (obj.__isset.resourceMetadata ? (out << to_string(obj.resourceMetadata)) : (out << "<null>"));
  out << ", " << "dataReplicaLocations="; (obj.__isset.dataReplicaLocations ? (out << to_string(obj.dataReplicaLocations)) : (out << "<null>"));
  out << ")";
  return out;
}


DataReplicaLocationModel::~DataReplicaLocationModel() throw() {
}


void DataReplicaLocationModel::__set_replicaId(const std::string& val) {
  this->replicaId = val;
__isset.replicaId = true;
}

void DataReplicaLocationModel::__set_resourceId(const std::string& val) {
  this->resourceId = val;
__isset.resourceId = true;
}

void DataReplicaLocationModel::__set_replicaName(const std::string& val) {
  this->replicaName = val;
__isset.replicaName = true;
}

void DataReplicaLocationModel::__set_replicaDescription(const std::string& val) {
  this->replicaDescription = val;
__isset.replicaDescription = true;
}

void DataReplicaLocationModel::__set_creationTime(const int64_t val) {
  this->creationTime = val;
__isset.creationTime = true;
}

void DataReplicaLocationModel::__set_lastModifiedTime(const int64_t val) {
  this->lastModifiedTime = val;
__isset.lastModifiedTime = true;
}

void DataReplicaLocationModel::__set_replicaLocationCategory(const ReplicaLocationCategory::type val) {
  this->replicaLocationCategory = val;
__isset.replicaLocationCategory = true;
}

void DataReplicaLocationModel::__set_replicaPersistentType(const ReplicaPersistentType::type val) {
  this->replicaPersistentType = val;
__isset.replicaPersistentType = true;
}

void DataReplicaLocationModel::__set_dataLocations(const std::vector<std::string> & val) {
  this->dataLocations = val;
__isset.dataLocations = true;
}

void DataReplicaLocationModel::__set_replicaMetadata(const std::map<std::string, std::string> & val) {
  this->replicaMetadata = val;
__isset.replicaMetadata = true;
}

const char* DataReplicaLocationModel::ascii_fingerprint = "781A1748A91BB45A79F33F79DC9474F1";
const uint8_t DataReplicaLocationModel::binary_fingerprint[16] = {0x78,0x1A,0x17,0x48,0xA9,0x1B,0xB4,0x5A,0x79,0xF3,0x3F,0x79,0xDC,0x94,0x74,0xF1};

uint32_t DataReplicaLocationModel::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->replicaId);
          this->__isset.replicaId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->resourceId);
          this->__isset.resourceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->replicaName);
          this->__isset.replicaName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->replicaDescription);
          this->__isset.replicaDescription = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->creationTime);
          this->__isset.creationTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->lastModifiedTime);
          this->__isset.lastModifiedTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast16;
          xfer += iprot->readI32(ecast16);
          this->replicaLocationCategory = (ReplicaLocationCategory::type)ecast16;
          this->__isset.replicaLocationCategory = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast17;
          xfer += iprot->readI32(ecast17);
          this->replicaPersistentType = (ReplicaPersistentType::type)ecast17;
          this->__isset.replicaPersistentType = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 9:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->dataLocations.clear();
            uint32_t _size18;
            ::apache::thrift::protocol::TType _etype21;
            xfer += iprot->readListBegin(_etype21, _size18);
            this->dataLocations.resize(_size18);
            uint32_t _i22;
            for (_i22 = 0; _i22 < _size18; ++_i22)
            {
              xfer += iprot->readString(this->dataLocations[_i22]);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.dataLocations = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 10:
        if (ftype == ::apache::thrift::protocol::T_MAP) {
          {
            this->replicaMetadata.clear();
            uint32_t _size23;
            ::apache::thrift::protocol::TType _ktype24;
            ::apache::thrift::protocol::TType _vtype25;
            xfer += iprot->readMapBegin(_ktype24, _vtype25, _size23);
            uint32_t _i27;
            for (_i27 = 0; _i27 < _size23; ++_i27)
            {
              std::string _key28;
              xfer += iprot->readString(_key28);
              std::string& _val29 = this->replicaMetadata[_key28];
              xfer += iprot->readString(_val29);
            }
            xfer += iprot->readMapEnd();
          }
          this->__isset.replicaMetadata = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DataReplicaLocationModel::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  oprot->incrementRecursionDepth();
  xfer += oprot->writeStructBegin("DataReplicaLocationModel");

  if (this->__isset.replicaId) {
    xfer += oprot->writeFieldBegin("replicaId", ::apache::thrift::protocol::T_STRING, 1);
    xfer += oprot->writeString(this->replicaId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.resourceId) {
    xfer += oprot->writeFieldBegin("resourceId", ::apache::thrift::protocol::T_STRING, 2);
    xfer += oprot->writeString(this->resourceId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.replicaName) {
    xfer += oprot->writeFieldBegin("replicaName", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->replicaName);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.replicaDescription) {
    xfer += oprot->writeFieldBegin("replicaDescription", ::apache::thrift::protocol::T_STRING, 4);
    xfer += oprot->writeString(this->replicaDescription);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.creationTime) {
    xfer += oprot->writeFieldBegin("creationTime", ::apache::thrift::protocol::T_I64, 5);
    xfer += oprot->writeI64(this->creationTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.lastModifiedTime) {
    xfer += oprot->writeFieldBegin("lastModifiedTime", ::apache::thrift::protocol::T_I64, 6);
    xfer += oprot->writeI64(this->lastModifiedTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.replicaLocationCategory) {
    xfer += oprot->writeFieldBegin("replicaLocationCategory", ::apache::thrift::protocol::T_I32, 7);
    xfer += oprot->writeI32((int32_t)this->replicaLocationCategory);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.replicaPersistentType) {
    xfer += oprot->writeFieldBegin("replicaPersistentType", ::apache::thrift::protocol::T_I32, 8);
    xfer += oprot->writeI32((int32_t)this->replicaPersistentType);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.dataLocations) {
    xfer += oprot->writeFieldBegin("dataLocations", ::apache::thrift::protocol::T_LIST, 9);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->dataLocations.size()));
      std::vector<std::string> ::const_iterator _iter30;
      for (_iter30 = this->dataLocations.begin(); _iter30 != this->dataLocations.end(); ++_iter30)
      {
        xfer += oprot->writeString((*_iter30));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.replicaMetadata) {
    xfer += oprot->writeFieldBegin("replicaMetadata", ::apache::thrift::protocol::T_MAP, 10);
    {
      xfer += oprot->writeMapBegin(::apache::thrift::protocol::T_STRING, ::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->replicaMetadata.size()));
      std::map<std::string, std::string> ::const_iterator _iter31;
      for (_iter31 = this->replicaMetadata.begin(); _iter31 != this->replicaMetadata.end(); ++_iter31)
      {
        xfer += oprot->writeString(_iter31->first);
        xfer += oprot->writeString(_iter31->second);
      }
      xfer += oprot->writeMapEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  oprot->decrementRecursionDepth();
  return xfer;
}

void swap(DataReplicaLocationModel &a, DataReplicaLocationModel &b) {
  using ::std::swap;
  swap(a.replicaId, b.replicaId);
  swap(a.resourceId, b.resourceId);
  swap(a.replicaName, b.replicaName);
  swap(a.replicaDescription, b.replicaDescription);
  swap(a.creationTime, b.creationTime);
  swap(a.lastModifiedTime, b.lastModifiedTime);
  swap(a.replicaLocationCategory, b.replicaLocationCategory);
  swap(a.replicaPersistentType, b.replicaPersistentType);
  swap(a.dataLocations, b.dataLocations);
  swap(a.replicaMetadata, b.replicaMetadata);
  swap(a.__isset, b.__isset);
}

DataReplicaLocationModel::DataReplicaLocationModel(const DataReplicaLocationModel& other32) {
  replicaId = other32.replicaId;
  resourceId = other32.resourceId;
  replicaName = other32.replicaName;
  replicaDescription = other32.replicaDescription;
  creationTime = other32.creationTime;
  lastModifiedTime = other32.lastModifiedTime;
  replicaLocationCategory = other32.replicaLocationCategory;
  replicaPersistentType = other32.replicaPersistentType;
  dataLocations = other32.dataLocations;
  replicaMetadata = other32.replicaMetadata;
  __isset = other32.__isset;
}
DataReplicaLocationModel& DataReplicaLocationModel::operator=(const DataReplicaLocationModel& other33) {
  replicaId = other33.replicaId;
  resourceId = other33.resourceId;
  replicaName = other33.replicaName;
  replicaDescription = other33.replicaDescription;
  creationTime = other33.creationTime;
  lastModifiedTime = other33.lastModifiedTime;
  replicaLocationCategory = other33.replicaLocationCategory;
  replicaPersistentType = other33.replicaPersistentType;
  dataLocations = other33.dataLocations;
  replicaMetadata = other33.replicaMetadata;
  __isset = other33.__isset;
  return *this;
}
std::ostream& operator<<(std::ostream& out, const DataReplicaLocationModel& obj) {
  using apache::thrift::to_string;
  out << "DataReplicaLocationModel(";
  out << "replicaId="; (obj.__isset.replicaId ? (out << to_string(obj.replicaId)) : (out << "<null>"));
  out << ", " << "resourceId="; (obj.__isset.resourceId ? (out << to_string(obj.resourceId)) : (out << "<null>"));
  out << ", " << "replicaName="; (obj.__isset.replicaName ? (out << to_string(obj.replicaName)) : (out << "<null>"));
  out << ", " << "replicaDescription="; (obj.__isset.replicaDescription ? (out << to_string(obj.replicaDescription)) : (out << "<null>"));
  out << ", " << "creationTime="; (obj.__isset.creationTime ? (out << to_string(obj.creationTime)) : (out << "<null>"));
  out << ", " << "lastModifiedTime="; (obj.__isset.lastModifiedTime ? (out << to_string(obj.lastModifiedTime)) : (out << "<null>"));
  out << ", " << "replicaLocationCategory="; (obj.__isset.replicaLocationCategory ? (out << to_string(obj.replicaLocationCategory)) : (out << "<null>"));
  out << ", " << "replicaPersistentType="; (obj.__isset.replicaPersistentType ? (out << to_string(obj.replicaPersistentType)) : (out << "<null>"));
  out << ", " << "dataLocations="; (obj.__isset.dataLocations ? (out << to_string(obj.dataLocations)) : (out << "<null>"));
  out << ", " << "replicaMetadata="; (obj.__isset.replicaMetadata ? (out << to_string(obj.replicaMetadata)) : (out << "<null>"));
  out << ")";
  return out;
}

}}}}} // namespace