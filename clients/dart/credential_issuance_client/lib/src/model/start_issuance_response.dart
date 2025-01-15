//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'start_issuance_response.g.dart';

/// StartIssuanceResponse
///
/// Properties:
/// * [credentialOfferUri] - URL where wallet can view offer details
/// * [txCode] - One time transaction code generated by CIS
/// * [issuanceId] - Website's internal identifier. Website may use to get info about the status of issuance flow. If it is not provided, CIS will generate one.
/// * [expiresIn] - Expire time in seconds
@BuiltValue()
abstract class StartIssuanceResponse implements Built<StartIssuanceResponse, StartIssuanceResponseBuilder> {
  /// URL where wallet can view offer details
  @BuiltValueField(wireName: r'credentialOfferUri')
  String get credentialOfferUri;

  /// One time transaction code generated by CIS
  @BuiltValueField(wireName: r'txCode')
  String? get txCode;

  /// Website's internal identifier. Website may use to get info about the status of issuance flow. If it is not provided, CIS will generate one.
  @BuiltValueField(wireName: r'issuanceId')
  String get issuanceId;

  /// Expire time in seconds
  @BuiltValueField(wireName: r'expiresIn')
  int get expiresIn;

  StartIssuanceResponse._();

  factory StartIssuanceResponse([void updates(StartIssuanceResponseBuilder b)]) = _$StartIssuanceResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StartIssuanceResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StartIssuanceResponse> get serializer => _$StartIssuanceResponseSerializer();
}

class _$StartIssuanceResponseSerializer implements PrimitiveSerializer<StartIssuanceResponse> {
  @override
  final Iterable<Type> types = const [StartIssuanceResponse, _$StartIssuanceResponse];

  @override
  final String wireName = r'StartIssuanceResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StartIssuanceResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'credentialOfferUri';
    yield serializers.serialize(
      object.credentialOfferUri,
      specifiedType: const FullType(String),
    );
    if (object.txCode != null) {
      yield r'txCode';
      yield serializers.serialize(
        object.txCode,
        specifiedType: const FullType(String),
      );
    }
    yield r'issuanceId';
    yield serializers.serialize(
      object.issuanceId,
      specifiedType: const FullType(String),
    );
    yield r'expiresIn';
    yield serializers.serialize(
      object.expiresIn,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StartIssuanceResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StartIssuanceResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'credentialOfferUri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.credentialOfferUri = valueDes;
          break;
        case r'txCode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.txCode = valueDes;
          break;
        case r'issuanceId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.issuanceId = valueDes;
          break;
        case r'expiresIn':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiresIn = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StartIssuanceResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StartIssuanceResponseBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

