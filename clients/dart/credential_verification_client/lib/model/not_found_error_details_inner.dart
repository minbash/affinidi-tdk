//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NotFoundErrorDetailsInner {
  /// Returns a new [NotFoundErrorDetailsInner] instance.
  NotFoundErrorDetailsInner({
    required this.issue,
    this.field,
    this.value,
    this.location,
  });

  String issue;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? field;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? value;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? location;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NotFoundErrorDetailsInner &&
    other.issue == issue &&
    other.field == field &&
    other.value == value &&
    other.location == location;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (issue.hashCode) +
    (field == null ? 0 : field!.hashCode) +
    (value == null ? 0 : value!.hashCode) +
    (location == null ? 0 : location!.hashCode);

  @override
  String toString() => 'NotFoundErrorDetailsInner[issue=$issue, field=$field, value=$value, location=$location]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'issue'] = this.issue;
    if (this.field != null) {
      json[r'field'] = this.field;
    } else {
      json[r'field'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    if (this.location != null) {
      json[r'location'] = this.location;
    } else {
      json[r'location'] = null;
    }
    return json;
  }

  /// Returns a new [NotFoundErrorDetailsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NotFoundErrorDetailsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "NotFoundErrorDetailsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "NotFoundErrorDetailsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return NotFoundErrorDetailsInner(
        issue: mapValueOfType<String>(json, r'issue')!,
        field: mapValueOfType<String>(json, r'field'),
        value: mapValueOfType<String>(json, r'value'),
        location: mapValueOfType<String>(json, r'location'),
      );
    }
    return null;
  }

  static List<NotFoundErrorDetailsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NotFoundErrorDetailsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NotFoundErrorDetailsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NotFoundErrorDetailsInner> mapFromJson(dynamic json) {
    final map = <String, NotFoundErrorDetailsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NotFoundErrorDetailsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NotFoundErrorDetailsInner-objects as value to a dart map
  static Map<String, List<NotFoundErrorDetailsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NotFoundErrorDetailsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NotFoundErrorDetailsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'issue',
  };
}

