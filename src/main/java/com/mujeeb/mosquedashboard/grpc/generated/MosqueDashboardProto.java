// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mosque-dashboard.proto

package com.mujeeb.mosquedashboard.grpc.generated;

@SuppressWarnings("deprecation")
public final class MosqueDashboardProto {
  private MosqueDashboardProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mujeeb_mosquedashboard_grpc_NamazTimeUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mujeeb_mosquedashboard_grpc_NamazTimeUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mujeeb_mosquedashboard_grpc_GenericReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mujeeb_mosquedashboard_grpc_GenericReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026mosque-dashboard.proto\022\037com.mujeeb.mos" +
      "quedashboard.grpc\"M\n\026NamazTimeUpdateRequ" +
      "est\022\025\n\rnamazTimeName\030\001 \001(\t\022\014\n\004hour\030\002 \001(\005" +
      "\022\016\n\006minute\030\003 \001(\005\"9\n\014GenericReply\022\023\n\013desc" +
      "ription\030\001 \001(\t\022\024\n\014responseCode\030\002 \001(\0052\216\001\n\017" +
      "UpdateNamazTime\022{\n\017UpdateNamazTime\0227.com" +
      ".mujeeb.mosquedashboard.grpc.NamazTimeUp" +
      "dateRequest\032-.com.mujeeb.mosquedashboard" +
      ".grpc.GenericReply\"\000B?\n\037com.mujeeb.mosqu" +
      "edashboard.grpcB\024MosqueDashboardProtoP\001\242" +
      "\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_mujeeb_mosquedashboard_grpc_NamazTimeUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_mujeeb_mosquedashboard_grpc_NamazTimeUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mujeeb_mosquedashboard_grpc_NamazTimeUpdateRequest_descriptor,
        new java.lang.String[] { "NamazTimeName", "Hour", "Minute", });
    internal_static_com_mujeeb_mosquedashboard_grpc_GenericReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_mujeeb_mosquedashboard_grpc_GenericReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mujeeb_mosquedashboard_grpc_GenericReply_descriptor,
        new java.lang.String[] { "Description", "ResponseCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
