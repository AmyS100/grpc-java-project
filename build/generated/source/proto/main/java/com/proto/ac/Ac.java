// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ac/ac.proto

package com.proto.ac;

public final class Ac {
  private Ac() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ac_AC_Controller_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ac_AC_Controller_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ac_GetByDeviceIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ac_GetByDeviceIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ac_ACDeviceTempRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ac_ACDeviceTempRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ac_ACDetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ac_ACDetailResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013ac/ac.proto\022\002ac\"\240\001\n\rAC_Controller\022\021\n\td" +
      "evice_id\030\001 \001(\005\022\023\n\013device_name\030\002 \001(\t\022\032\n\022d" +
      "evice_description\030\003 \001(\t\022\027\n\017device_locati" +
      "on\030\004 \001(\t\022\025\n\rdevice_status\030\005 \001(\t\022\033\n\023devic" +
      "e_temp_setting\030\006 \001(\005\")\n\024GetByDeviceIdReq" +
      "uest\022\021\n\tdevice_id\030\001 \001(\005\"B\n\023ACDeviceTempR" +
      "equest\022\021\n\tdevice_id\030\001 \001(\005\022\030\n\020new_temp_se" +
      "tting\030\002 \001(\005\"<\n\020ACDetailResponse\022(\n\rac_co" +
      "ntroller\030\001 \001(\0132\021.ac.AC_Controller2\316\001\n\nAC" +
      "_Service\022F\n\022ShowCurrentDetails\022\030.ac.GetB" +
      "yDeviceIdRequest\032\024.ac.ACDetailResponse\"\000" +
      "\022:\n\007SetTemp\022\027.ac.ACDeviceTempRequest\032\024.a" +
      "c.ACDetailResponse\"\000\022<\n\010SetToOff\022\030.ac.Ge" +
      "tByDeviceIdRequest\032\024.ac.ACDetailResponse" +
      "\"\000B\020\n\014com.proto.acP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ac_AC_Controller_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ac_AC_Controller_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ac_AC_Controller_descriptor,
        new java.lang.String[] { "DeviceId", "DeviceName", "DeviceDescription", "DeviceLocation", "DeviceStatus", "DeviceTempSetting", });
    internal_static_ac_GetByDeviceIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ac_GetByDeviceIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ac_GetByDeviceIdRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_ac_ACDeviceTempRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ac_ACDeviceTempRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ac_ACDeviceTempRequest_descriptor,
        new java.lang.String[] { "DeviceId", "NewTempSetting", });
    internal_static_ac_ACDetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ac_ACDetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ac_ACDetailResponse_descriptor,
        new java.lang.String[] { "AcController", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
