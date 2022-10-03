/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/policytroubleshooter/v1/checker.proto

package com.google.cloud.policytroubleshooter.v1;

/**
 *
 *
 * <pre>
 * Request for [TroubleshootIamPolicy][google.cloud.policytroubleshooter.v1.IamChecker.TroubleshootIamPolicy].
 * </pre>
 *
 * Protobuf type {@code google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest}
 */
public final class TroubleshootIamPolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest)
    TroubleshootIamPolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TroubleshootIamPolicyRequest.newBuilder() to construct.
  private TroubleshootIamPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TroubleshootIamPolicyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TroubleshootIamPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.policytroubleshooter.v1.IAMCheckerProto
        .internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.policytroubleshooter.v1.IAMCheckerProto
        .internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest.class,
            com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest.Builder.class);
  }

  public static final int ACCESS_TUPLE_FIELD_NUMBER = 1;
  private google.cloud.policytroubleshooter.v1.Explanations.AccessTuple accessTuple_;
  /**
   *
   *
   * <pre>
   * The information to use for checking whether a member has a permission for a
   * resource.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
   *
   * @return Whether the accessTuple field is set.
   */
  @java.lang.Override
  public boolean hasAccessTuple() {
    return accessTuple_ != null;
  }
  /**
   *
   *
   * <pre>
   * The information to use for checking whether a member has a permission for a
   * resource.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
   *
   * @return The accessTuple.
   */
  @java.lang.Override
  public google.cloud.policytroubleshooter.v1.Explanations.AccessTuple getAccessTuple() {
    return accessTuple_ == null
        ? google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.getDefaultInstance()
        : accessTuple_;
  }
  /**
   *
   *
   * <pre>
   * The information to use for checking whether a member has a permission for a
   * resource.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
   */
  @java.lang.Override
  public google.cloud.policytroubleshooter.v1.Explanations.AccessTupleOrBuilder
      getAccessTupleOrBuilder() {
    return getAccessTuple();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (accessTuple_ != null) {
      output.writeMessage(1, getAccessTuple());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accessTuple_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAccessTuple());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest other =
        (com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest) obj;

    if (hasAccessTuple() != other.hasAccessTuple()) return false;
    if (hasAccessTuple()) {
      if (!getAccessTuple().equals(other.getAccessTuple())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAccessTuple()) {
      hash = (37 * hash) + ACCESS_TUPLE_FIELD_NUMBER;
      hash = (53 * hash) + getAccessTuple().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for [TroubleshootIamPolicy][google.cloud.policytroubleshooter.v1.IamChecker.TroubleshootIamPolicy].
   * </pre>
   *
   * Protobuf type {@code google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest)
      com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.policytroubleshooter.v1.IAMCheckerProto
          .internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.policytroubleshooter.v1.IAMCheckerProto
          .internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest.class,
              com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (accessTupleBuilder_ == null) {
        accessTuple_ = null;
      } else {
        accessTuple_ = null;
        accessTupleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.policytroubleshooter.v1.IAMCheckerProto
          .internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
        getDefaultInstanceForType() {
      return com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest build() {
      com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest buildPartial() {
      com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest result =
          new com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest(this);
      if (accessTupleBuilder_ == null) {
        result.accessTuple_ = accessTuple_;
      } else {
        result.accessTuple_ = accessTupleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest) {
        return mergeFrom(
            (com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest other) {
      if (other
          == com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
              .getDefaultInstance()) return this;
      if (other.hasAccessTuple()) {
        mergeAccessTuple(other.getAccessTuple());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getAccessTupleFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private google.cloud.policytroubleshooter.v1.Explanations.AccessTuple accessTuple_;
    private com.google.protobuf.SingleFieldBuilderV3<
            google.cloud.policytroubleshooter.v1.Explanations.AccessTuple,
            google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.Builder,
            google.cloud.policytroubleshooter.v1.Explanations.AccessTupleOrBuilder>
        accessTupleBuilder_;
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     *
     * @return Whether the accessTuple field is set.
     */
    public boolean hasAccessTuple() {
      return accessTupleBuilder_ != null || accessTuple_ != null;
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     *
     * @return The accessTuple.
     */
    public google.cloud.policytroubleshooter.v1.Explanations.AccessTuple getAccessTuple() {
      if (accessTupleBuilder_ == null) {
        return accessTuple_ == null
            ? google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.getDefaultInstance()
            : accessTuple_;
      } else {
        return accessTupleBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     */
    public Builder setAccessTuple(
        google.cloud.policytroubleshooter.v1.Explanations.AccessTuple value) {
      if (accessTupleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessTuple_ = value;
        onChanged();
      } else {
        accessTupleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     */
    public Builder setAccessTuple(
        google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.Builder builderForValue) {
      if (accessTupleBuilder_ == null) {
        accessTuple_ = builderForValue.build();
        onChanged();
      } else {
        accessTupleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     */
    public Builder mergeAccessTuple(
        google.cloud.policytroubleshooter.v1.Explanations.AccessTuple value) {
      if (accessTupleBuilder_ == null) {
        if (accessTuple_ != null) {
          accessTuple_ =
              google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.newBuilder(accessTuple_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          accessTuple_ = value;
        }
        onChanged();
      } else {
        accessTupleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     */
    public Builder clearAccessTuple() {
      if (accessTupleBuilder_ == null) {
        accessTuple_ = null;
        onChanged();
      } else {
        accessTuple_ = null;
        accessTupleBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     */
    public google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.Builder
        getAccessTupleBuilder() {

      onChanged();
      return getAccessTupleFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     */
    public google.cloud.policytroubleshooter.v1.Explanations.AccessTupleOrBuilder
        getAccessTupleOrBuilder() {
      if (accessTupleBuilder_ != null) {
        return accessTupleBuilder_.getMessageOrBuilder();
      } else {
        return accessTuple_ == null
            ? google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.getDefaultInstance()
            : accessTuple_;
      }
    }
    /**
     *
     *
     * <pre>
     * The information to use for checking whether a member has a permission for a
     * resource.
     * </pre>
     *
     * <code>.google.cloud.policytroubleshooter.v1.AccessTuple access_tuple = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            google.cloud.policytroubleshooter.v1.Explanations.AccessTuple,
            google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.Builder,
            google.cloud.policytroubleshooter.v1.Explanations.AccessTupleOrBuilder>
        getAccessTupleFieldBuilder() {
      if (accessTupleBuilder_ == null) {
        accessTupleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                google.cloud.policytroubleshooter.v1.Explanations.AccessTuple,
                google.cloud.policytroubleshooter.v1.Explanations.AccessTuple.Builder,
                google.cloud.policytroubleshooter.v1.Explanations.AccessTupleOrBuilder>(
                getAccessTuple(), getParentForChildren(), isClean());
        accessTuple_ = null;
      }
      return accessTupleBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest)
  private static final com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest();
  }

  public static com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TroubleshootIamPolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<TroubleshootIamPolicyRequest>() {
        @java.lang.Override
        public TroubleshootIamPolicyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<TroubleshootIamPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TroubleshootIamPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
