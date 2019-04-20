// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: heating/heater.proto

package com.proto.heating;

public final class HeaterOuterClass {
  private HeaterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_heating_Heater_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_heating_Heater_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_heating_HeaterStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_heating_HeaterStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_heating_HeaterToUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_heating_HeaterToUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_heating_HeaterStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_heating_HeaterStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_heating_HeaterDetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_heating_HeaterDetailResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024heating/heater.proto\022\007heating\"u\n\006Heate" +
      "r\022\021\n\tdevice_id\030\001 \001(\005\022\023\n\013device_name\030\002 \001(" +
      "\t\022\032\n\022device_description\030\003 \001(\t\022\027\n\017device_" +
      "location\030\004 \001(\t\022\016\n\006status\030\005 \001(\t\"(\n\023Heater" +
      "StatusRequest\022\021\n\tdevice_id\030\001 \001(\005\"*\n\025Heat" +
      "erToUpdateRequest\022\021\n\tdevice_id\030\001 \001(\005\"7\n\024" +
      "HeaterStatusResponse\022\037\n\006heater\030\001 \001(\0132\017.h" +
      "eating.Heater\"7\n\024HeaterDetailResponse\022\037\n" +
      "\006heater\030\001 \001(\0132\017.heating.Heater2\240\003\n\rHeate" +
      "rService\022K\n\nShowStatus\022\034.heating.HeaterS" +
      "tatusRequest\032\035.heating.HeaterStatusRespo" +
      "nse\"\000\022O\n\014SetTempToLow\022\036.heating.HeaterTo" +
      "UpdateRequest\032\035.heating.HeaterDetailResp" +
      "onse\"\000\022R\n\017SetTempToMedium\022\036.heating.Heat" +
      "erToUpdateRequest\032\035.heating.HeaterDetail" +
      "Response\"\000\022P\n\rSetTempToHigh\022\036.heating.He" +
      "aterToUpdateRequest\032\035.heating.HeaterDeta" +
      "ilResponse\"\000\022K\n\010SetToOff\022\036.heating.Heate" +
      "rToUpdateRequest\032\035.heating.HeaterDetailR" +
      "esponse\"\000B\025\n\021com.proto.heatingP\001b\006proto3"
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
    internal_static_heating_Heater_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_heating_Heater_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_heating_Heater_descriptor,
        new java.lang.String[] { "DeviceId", "DeviceName", "DeviceDescription", "DeviceLocation", "Status", });
    internal_static_heating_HeaterStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_heating_HeaterStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_heating_HeaterStatusRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_heating_HeaterToUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_heating_HeaterToUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_heating_HeaterToUpdateRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_heating_HeaterStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_heating_HeaterStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_heating_HeaterStatusResponse_descriptor,
        new java.lang.String[] { "Heater", });
    internal_static_heating_HeaterDetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_heating_HeaterDetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_heating_HeaterDetailResponse_descriptor,
        new java.lang.String[] { "Heater", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}