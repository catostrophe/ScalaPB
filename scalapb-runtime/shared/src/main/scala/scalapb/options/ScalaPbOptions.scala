// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param packageName
  *   If set then it overrides the java_package and package.
  * @param flatPackage
  *   If true, the compiler does not append the proto base file name
  *   into the generated package name. If false (the default), the
  *   generated scala package name is the package_name.basename where
  *   basename is the proto file name without the .proto extension.
  * @param import
  *   Adds the following imports at the top of the file (this is meant
  *   to provide implicit TypeMappers)
  * @param preamble
  *   Text to add to the generated scala file.  This can be used only
  *   when single_file is true.
  * @param singleFile
  *   If true, all messages and enums (but not services) will be written
  *   to a single Scala file.
  * @param noPrimitiveWrappers
  *   By default, wrappers defined at
  *   https://github.com/google/protobuf/blob/master/src/google/protobuf/wrappers.proto,
  *   are mapped to an Option[T] where T is a primitive type. When this field
  *   is set to true, we do not perform this transformation.
  * @param primitiveWrappers
  *   DEPRECATED. In ScalaPB &lt;= 0.5.47, it was necessary to explicitly enable
  *   primitive_wrappers. This field remains here for backwards compatibility,
  *   but it has no effect on generated code. It is an error to set both
  *   `primitive_wrappers` and `no_primitive_wrappers`.
  * @param collectionType
  *   Scala type to be used for repeated fields. If unspecified,
  *   `scala.collection.Seq` will be used.
  * @param preserveUnknownFields
  *   If set to true, all generated messages in this file will preserve unknown
  *   fields.
  * @param testOnlyNoJavaConversions
  *   For use in tests only. Inhibit Java conversions even when when generator parameters
  *   request for it.
  */
@SerialVersionUID(0L)
final case class ScalaPbOptions(
    packageName: scala.Option[_root_.scala.Predef.String] = None,
    flatPackage: scala.Option[_root_.scala.Boolean] = None,
    `import`: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    preamble: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    singleFile: scala.Option[_root_.scala.Boolean] = None,
    noPrimitiveWrappers: scala.Option[_root_.scala.Boolean] = None,
    primitiveWrappers: scala.Option[_root_.scala.Boolean] = None,
    collectionType: scala.Option[_root_.scala.Predef.String] = None,
    preserveUnknownFields: scala.Option[_root_.scala.Boolean] = None,
    testOnlyNoJavaConversions: scala.Option[_root_.scala.Boolean] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[ScalaPbOptions] with scalapb.lenses.Updatable[ScalaPbOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (packageName.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, packageName.get) }
      if (flatPackage.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, flatPackage.get) }
      `import`.foreach(`import` => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, `import`))
      preamble.foreach(preamble => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, preamble))
      if (singleFile.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, singleFile.get) }
      if (noPrimitiveWrappers.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(7, noPrimitiveWrappers.get) }
      if (primitiveWrappers.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(6, primitiveWrappers.get) }
      if (collectionType.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, collectionType.get) }
      if (preserveUnknownFields.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(9, preserveUnknownFields.get) }
      if (testOnlyNoJavaConversions.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(100001, testOnlyNoJavaConversions.get) }
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
      packageName.foreach { __v =>
        _output__.writeString(1, __v)
      };
      flatPackage.foreach { __v =>
        _output__.writeBool(2, __v)
      };
      `import`.foreach { __v =>
        _output__.writeString(3, __v)
      };
      preamble.foreach { __v =>
        _output__.writeString(4, __v)
      };
      singleFile.foreach { __v =>
        _output__.writeBool(5, __v)
      };
      primitiveWrappers.foreach { __v =>
        _output__.writeBool(6, __v)
      };
      noPrimitiveWrappers.foreach { __v =>
        _output__.writeBool(7, __v)
      };
      collectionType.foreach { __v =>
        _output__.writeString(8, __v)
      };
      preserveUnknownFields.foreach { __v =>
        _output__.writeBool(9, __v)
      };
      testOnlyNoJavaConversions.foreach { __v =>
        _output__.writeBool(100001, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.ScalaPbOptions = {
      var __packageName = this.packageName
      var __flatPackage = this.flatPackage
      val __import = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.`import`)
      val __preamble = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.preamble)
      var __singleFile = this.singleFile
      var __noPrimitiveWrappers = this.noPrimitiveWrappers
      var __primitiveWrappers = this.primitiveWrappers
      var __collectionType = this.collectionType
      var __preserveUnknownFields = this.preserveUnknownFields
      var __testOnlyNoJavaConversions = this.testOnlyNoJavaConversions
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __packageName = Option(_input__.readString())
          case 16 =>
            __flatPackage = Option(_input__.readBool())
          case 26 =>
            __import += _input__.readString()
          case 34 =>
            __preamble += _input__.readString()
          case 40 =>
            __singleFile = Option(_input__.readBool())
          case 56 =>
            __noPrimitiveWrappers = Option(_input__.readBool())
          case 48 =>
            __primitiveWrappers = Option(_input__.readBool())
          case 66 =>
            __collectionType = Option(_input__.readString())
          case 72 =>
            __preserveUnknownFields = Option(_input__.readBool())
          case 800008 =>
            __testOnlyNoJavaConversions = Option(_input__.readBool())
          case tag => _input__.skipField(tag)
        }
      }
      scalapb.options.ScalaPbOptions(
          packageName = __packageName,
          flatPackage = __flatPackage,
          `import` = __import.result(),
          preamble = __preamble.result(),
          singleFile = __singleFile,
          noPrimitiveWrappers = __noPrimitiveWrappers,
          primitiveWrappers = __primitiveWrappers,
          collectionType = __collectionType,
          preserveUnknownFields = __preserveUnknownFields,
          testOnlyNoJavaConversions = __testOnlyNoJavaConversions
      )
    }
    def getPackageName: _root_.scala.Predef.String = packageName.getOrElse("")
    def clearPackageName: ScalaPbOptions = copy(packageName = None)
    def withPackageName(__v: _root_.scala.Predef.String): ScalaPbOptions = copy(packageName = Option(__v))
    def getFlatPackage: _root_.scala.Boolean = flatPackage.getOrElse(false)
    def clearFlatPackage: ScalaPbOptions = copy(flatPackage = None)
    def withFlatPackage(__v: _root_.scala.Boolean): ScalaPbOptions = copy(flatPackage = Option(__v))
    def clearImport = copy(`import` = _root_.scala.collection.Seq.empty)
    def addImport(__vs: _root_.scala.Predef.String*): ScalaPbOptions = addAllImport(__vs)
    def addAllImport(__vs: TraversableOnce[_root_.scala.Predef.String]): ScalaPbOptions = copy(`import` = `import` ++ __vs)
    def withImport(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): ScalaPbOptions = copy(`import` = __v)
    def clearPreamble = copy(preamble = _root_.scala.collection.Seq.empty)
    def addPreamble(__vs: _root_.scala.Predef.String*): ScalaPbOptions = addAllPreamble(__vs)
    def addAllPreamble(__vs: TraversableOnce[_root_.scala.Predef.String]): ScalaPbOptions = copy(preamble = preamble ++ __vs)
    def withPreamble(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): ScalaPbOptions = copy(preamble = __v)
    def getSingleFile: _root_.scala.Boolean = singleFile.getOrElse(false)
    def clearSingleFile: ScalaPbOptions = copy(singleFile = None)
    def withSingleFile(__v: _root_.scala.Boolean): ScalaPbOptions = copy(singleFile = Option(__v))
    def getNoPrimitiveWrappers: _root_.scala.Boolean = noPrimitiveWrappers.getOrElse(false)
    def clearNoPrimitiveWrappers: ScalaPbOptions = copy(noPrimitiveWrappers = None)
    def withNoPrimitiveWrappers(__v: _root_.scala.Boolean): ScalaPbOptions = copy(noPrimitiveWrappers = Option(__v))
    def getPrimitiveWrappers: _root_.scala.Boolean = primitiveWrappers.getOrElse(false)
    def clearPrimitiveWrappers: ScalaPbOptions = copy(primitiveWrappers = None)
    def withPrimitiveWrappers(__v: _root_.scala.Boolean): ScalaPbOptions = copy(primitiveWrappers = Option(__v))
    def getCollectionType: _root_.scala.Predef.String = collectionType.getOrElse("")
    def clearCollectionType: ScalaPbOptions = copy(collectionType = None)
    def withCollectionType(__v: _root_.scala.Predef.String): ScalaPbOptions = copy(collectionType = Option(__v))
    def getPreserveUnknownFields: _root_.scala.Boolean = preserveUnknownFields.getOrElse(false)
    def clearPreserveUnknownFields: ScalaPbOptions = copy(preserveUnknownFields = None)
    def withPreserveUnknownFields(__v: _root_.scala.Boolean): ScalaPbOptions = copy(preserveUnknownFields = Option(__v))
    def getTestOnlyNoJavaConversions: _root_.scala.Boolean = testOnlyNoJavaConversions.getOrElse(false)
    def clearTestOnlyNoJavaConversions: ScalaPbOptions = copy(testOnlyNoJavaConversions = None)
    def withTestOnlyNoJavaConversions(__v: _root_.scala.Boolean): ScalaPbOptions = copy(testOnlyNoJavaConversions = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => packageName.orNull
        case 2 => flatPackage.orNull
        case 3 => `import`
        case 4 => preamble
        case 5 => singleFile.orNull
        case 7 => noPrimitiveWrappers.orNull
        case 6 => primitiveWrappers.orNull
        case 8 => collectionType.orNull
        case 9 => preserveUnknownFields.orNull
        case 100001 => testOnlyNoJavaConversions.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => packageName.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => flatPackage.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PRepeated(`import`.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 4 => _root_.scalapb.descriptors.PRepeated(preamble.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 5 => singleFile.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => noPrimitiveWrappers.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => primitiveWrappers.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => collectionType.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => preserveUnknownFields.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 100001 => testOnlyNoJavaConversions.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.options.ScalaPbOptions
}

object ScalaPbOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.ScalaPbOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.ScalaPbOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): scalapb.options.ScalaPbOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    scalapb.options.ScalaPbOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[_root_.scala.Boolean]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(9)).asInstanceOf[scala.Option[_root_.scala.Boolean]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.ScalaPbOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.ScalaPbOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(100001).get).flatMap(_.as[scala.Option[_root_.scala.Boolean]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.ScalaPbOptions(
  )
  implicit class ScalaPbOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.ScalaPbOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.ScalaPbOptions](_l) {
    def packageName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getPackageName)((c_, f_) => c_.copy(packageName = Option(f_)))
    def optionalPackageName: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Predef.String]] = field(_.packageName)((c_, f_) => c_.copy(packageName = f_))
    def flatPackage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getFlatPackage)((c_, f_) => c_.copy(flatPackage = Option(f_)))
    def optionalFlatPackage: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Boolean]] = field(_.flatPackage)((c_, f_) => c_.copy(flatPackage = f_))
    def `import`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.`import`)((c_, f_) => c_.copy(`import` = f_))
    def preamble: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.preamble)((c_, f_) => c_.copy(preamble = f_))
    def singleFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getSingleFile)((c_, f_) => c_.copy(singleFile = Option(f_)))
    def optionalSingleFile: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Boolean]] = field(_.singleFile)((c_, f_) => c_.copy(singleFile = f_))
    def noPrimitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoPrimitiveWrappers)((c_, f_) => c_.copy(noPrimitiveWrappers = Option(f_)))
    def optionalNoPrimitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Boolean]] = field(_.noPrimitiveWrappers)((c_, f_) => c_.copy(noPrimitiveWrappers = f_))
    def primitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getPrimitiveWrappers)((c_, f_) => c_.copy(primitiveWrappers = Option(f_)))
    def optionalPrimitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Boolean]] = field(_.primitiveWrappers)((c_, f_) => c_.copy(primitiveWrappers = f_))
    def collectionType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getCollectionType)((c_, f_) => c_.copy(collectionType = Option(f_)))
    def optionalCollectionType: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Predef.String]] = field(_.collectionType)((c_, f_) => c_.copy(collectionType = f_))
    def preserveUnknownFields: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getPreserveUnknownFields)((c_, f_) => c_.copy(preserveUnknownFields = Option(f_)))
    def optionalPreserveUnknownFields: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Boolean]] = field(_.preserveUnknownFields)((c_, f_) => c_.copy(preserveUnknownFields = f_))
    def testOnlyNoJavaConversions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getTestOnlyNoJavaConversions)((c_, f_) => c_.copy(testOnlyNoJavaConversions = Option(f_)))
    def optionalTestOnlyNoJavaConversions: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Boolean]] = field(_.testOnlyNoJavaConversions)((c_, f_) => c_.copy(testOnlyNoJavaConversions = f_))
  }
  final val PACKAGE_NAME_FIELD_NUMBER = 1
  final val FLAT_PACKAGE_FIELD_NUMBER = 2
  final val IMPORT_FIELD_NUMBER = 3
  final val PREAMBLE_FIELD_NUMBER = 4
  final val SINGLE_FILE_FIELD_NUMBER = 5
  final val NO_PRIMITIVE_WRAPPERS_FIELD_NUMBER = 7
  final val PRIMITIVE_WRAPPERS_FIELD_NUMBER = 6
  final val COLLECTION_TYPE_FIELD_NUMBER = 8
  final val PRESERVE_UNKNOWN_FIELDS_FIELD_NUMBER = 9
  final val TEST_ONLY_NO_JAVA_CONVERSIONS_FIELD_NUMBER = 100001
}
