// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.compiler.plugin

/** The version number of protocol compiler.
  *
  * @param suffix
  *   A suffix for alpha, beta or rc release, e.g., "alpha-1", "rc2". It should
  *   be empty for mainline stable releases.
  */
@SerialVersionUID(0L)
final case class Version(
    major: scala.Option[_root_.scala.Int] = None,
    minor: scala.Option[_root_.scala.Int] = None,
    patch: scala.Option[_root_.scala.Int] = None,
    suffix: scala.Option[_root_.scala.Predef.String] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[Version] with scalapb.lenses.Updatable[Version] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (major.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, major.get) }
      if (minor.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, minor.get) }
      if (patch.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, patch.get) }
      if (suffix.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, suffix.get) }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      major.foreach { __v =>
        _output__.writeInt32(1, __v)
      };
      minor.foreach { __v =>
        _output__.writeInt32(2, __v)
      };
      patch.foreach { __v =>
        _output__.writeInt32(3, __v)
      };
      suffix.foreach { __v =>
        _output__.writeString(4, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.Version = {
      var __major = this.major
      var __minor = this.minor
      var __patch = this.patch
      var __suffix = this.suffix
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __major = Option(_input__.readInt32())
          case 16 =>
            __minor = Option(_input__.readInt32())
          case 24 =>
            __patch = Option(_input__.readInt32())
          case 34 =>
            __suffix = Option(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.compiler.plugin.Version(
          major = __major,
          minor = __minor,
          patch = __patch,
          suffix = __suffix
      )
    }
    def getMajor: _root_.scala.Int = major.getOrElse(0)
    def clearMajor: Version = copy(major = None)
    def withMajor(__v: _root_.scala.Int): Version = copy(major = Option(__v))
    def getMinor: _root_.scala.Int = minor.getOrElse(0)
    def clearMinor: Version = copy(minor = None)
    def withMinor(__v: _root_.scala.Int): Version = copy(minor = Option(__v))
    def getPatch: _root_.scala.Int = patch.getOrElse(0)
    def clearPatch: Version = copy(patch = None)
    def withPatch(__v: _root_.scala.Int): Version = copy(patch = Option(__v))
    def getSuffix: _root_.scala.Predef.String = suffix.getOrElse("")
    def clearSuffix: Version = copy(suffix = None)
    def withSuffix(__v: _root_.scala.Predef.String): Version = copy(suffix = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => major.orNull
        case 2 => minor.orNull
        case 3 => patch.orNull
        case 4 => suffix.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => major.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => minor.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => patch.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => suffix.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.compiler.plugin.Version
}

object Version extends scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.Version] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.Version] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.compiler.plugin.Version = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.compiler.plugin.Version(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[_root_.scala.Int]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[_root_.scala.Int]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[_root_.scala.Int]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.compiler.plugin.Version] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.compiler.plugin.Version(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[_root_.scala.Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[_root_.scala.Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[_root_.scala.Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PluginProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PluginProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.compiler.plugin.Version(
  )
  implicit class VersionLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.Version]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.Version](_l) {
    def major: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getMajor)((c_, f_) => c_.copy(major = Option(f_)))
    def optionalMajor: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Int]] = field(_.major)((c_, f_) => c_.copy(major = f_))
    def minor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getMinor)((c_, f_) => c_.copy(minor = Option(f_)))
    def optionalMinor: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Int]] = field(_.minor)((c_, f_) => c_.copy(minor = f_))
    def patch: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getPatch)((c_, f_) => c_.copy(patch = Option(f_)))
    def optionalPatch: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Int]] = field(_.patch)((c_, f_) => c_.copy(patch = f_))
    def suffix: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getSuffix)((c_, f_) => c_.copy(suffix = Option(f_)))
    def optionalSuffix: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Predef.String]] = field(_.suffix)((c_, f_) => c_.copy(suffix = f_))
  }
  final val MAJOR_FIELD_NUMBER = 1
  final val MINOR_FIELD_NUMBER = 2
  final val PATCH_FIELD_NUMBER = 3
  final val SUFFIX_FIELD_NUMBER = 4
}
