<?php
/**
 * Constraints
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * VerificationService
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.9.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * Constraints Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class Constraints implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Constraints';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'limit_disclosure' => 'string',
        'statuses' => '\OpenAPI\Client\Model\ConstraintsStatuses',
        'fields' => '\OpenAPI\Client\Model\Field[]',
        'subject_is_issuer' => 'string',
        'is_holder' => '\OpenAPI\Client\Model\HolderSubject[]',
        'same_subject' => '\OpenAPI\Client\Model\HolderSubject[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'limit_disclosure' => null,
        'statuses' => null,
        'fields' => null,
        'subject_is_issuer' => null,
        'is_holder' => null,
        'same_subject' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'limit_disclosure' => false,
        'statuses' => false,
        'fields' => false,
        'subject_is_issuer' => false,
        'is_holder' => false,
        'same_subject' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'limit_disclosure' => 'limit_disclosure',
        'statuses' => 'statuses',
        'fields' => 'fields',
        'subject_is_issuer' => 'subject_is_issuer',
        'is_holder' => 'is_holder',
        'same_subject' => 'same_subject'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'limit_disclosure' => 'setLimitDisclosure',
        'statuses' => 'setStatuses',
        'fields' => 'setFields',
        'subject_is_issuer' => 'setSubjectIsIssuer',
        'is_holder' => 'setIsHolder',
        'same_subject' => 'setSameSubject'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'limit_disclosure' => 'getLimitDisclosure',
        'statuses' => 'getStatuses',
        'fields' => 'getFields',
        'subject_is_issuer' => 'getSubjectIsIssuer',
        'is_holder' => 'getIsHolder',
        'same_subject' => 'getSameSubject'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    public const LIMIT_DISCLOSURE_REQUIRED = 'required';
    public const LIMIT_DISCLOSURE_PREFERRED = 'preferred';
    public const SUBJECT_IS_ISSUER_REQUIRED = 'required';
    public const SUBJECT_IS_ISSUER_PREFERRED = 'preferred';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getLimitDisclosureAllowableValues()
    {
        return [
            self::LIMIT_DISCLOSURE_REQUIRED,
            self::LIMIT_DISCLOSURE_PREFERRED,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getSubjectIsIssuerAllowableValues()
    {
        return [
            self::SUBJECT_IS_ISSUER_REQUIRED,
            self::SUBJECT_IS_ISSUER_PREFERRED,
        ];
    }

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('limit_disclosure', $data ?? [], null);
        $this->setIfExists('statuses', $data ?? [], null);
        $this->setIfExists('fields', $data ?? [], null);
        $this->setIfExists('subject_is_issuer', $data ?? [], null);
        $this->setIfExists('is_holder', $data ?? [], null);
        $this->setIfExists('same_subject', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getLimitDisclosureAllowableValues();
        if (!is_null($this->container['limit_disclosure']) && !in_array($this->container['limit_disclosure'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'limit_disclosure', must be one of '%s'",
                $this->container['limit_disclosure'],
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getSubjectIsIssuerAllowableValues();
        if (!is_null($this->container['subject_is_issuer']) && !in_array($this->container['subject_is_issuer'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'subject_is_issuer', must be one of '%s'",
                $this->container['subject_is_issuer'],
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets limit_disclosure
     *
     * @return string|null
     */
    public function getLimitDisclosure()
    {
        return $this->container['limit_disclosure'];
    }

    /**
     * Sets limit_disclosure
     *
     * @param string|null $limit_disclosure limit_disclosure
     *
     * @return self
     */
    public function setLimitDisclosure($limit_disclosure)
    {
        if (is_null($limit_disclosure)) {
            throw new \InvalidArgumentException('non-nullable limit_disclosure cannot be null');
        }
        $allowedValues = $this->getLimitDisclosureAllowableValues();
        if (!in_array($limit_disclosure, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'limit_disclosure', must be one of '%s'",
                    $limit_disclosure,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['limit_disclosure'] = $limit_disclosure;

        return $this;
    }

    /**
     * Gets statuses
     *
     * @return \OpenAPI\Client\Model\ConstraintsStatuses|null
     */
    public function getStatuses()
    {
        return $this->container['statuses'];
    }

    /**
     * Sets statuses
     *
     * @param \OpenAPI\Client\Model\ConstraintsStatuses|null $statuses statuses
     *
     * @return self
     */
    public function setStatuses($statuses)
    {
        if (is_null($statuses)) {
            throw new \InvalidArgumentException('non-nullable statuses cannot be null');
        }
        $this->container['statuses'] = $statuses;

        return $this;
    }

    /**
     * Gets fields
     *
     * @return \OpenAPI\Client\Model\Field[]|null
     */
    public function getFields()
    {
        return $this->container['fields'];
    }

    /**
     * Sets fields
     *
     * @param \OpenAPI\Client\Model\Field[]|null $fields fields
     *
     * @return self
     */
    public function setFields($fields)
    {
        if (is_null($fields)) {
            throw new \InvalidArgumentException('non-nullable fields cannot be null');
        }
        $this->container['fields'] = $fields;

        return $this;
    }

    /**
     * Gets subject_is_issuer
     *
     * @return string|null
     */
    public function getSubjectIsIssuer()
    {
        return $this->container['subject_is_issuer'];
    }

    /**
     * Sets subject_is_issuer
     *
     * @param string|null $subject_is_issuer subject_is_issuer
     *
     * @return self
     */
    public function setSubjectIsIssuer($subject_is_issuer)
    {
        if (is_null($subject_is_issuer)) {
            throw new \InvalidArgumentException('non-nullable subject_is_issuer cannot be null');
        }
        $allowedValues = $this->getSubjectIsIssuerAllowableValues();
        if (!in_array($subject_is_issuer, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'subject_is_issuer', must be one of '%s'",
                    $subject_is_issuer,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['subject_is_issuer'] = $subject_is_issuer;

        return $this;
    }

    /**
     * Gets is_holder
     *
     * @return \OpenAPI\Client\Model\HolderSubject[]|null
     */
    public function getIsHolder()
    {
        return $this->container['is_holder'];
    }

    /**
     * Sets is_holder
     *
     * @param \OpenAPI\Client\Model\HolderSubject[]|null $is_holder is_holder
     *
     * @return self
     */
    public function setIsHolder($is_holder)
    {
        if (is_null($is_holder)) {
            throw new \InvalidArgumentException('non-nullable is_holder cannot be null');
        }
        $this->container['is_holder'] = $is_holder;

        return $this;
    }

    /**
     * Gets same_subject
     *
     * @return \OpenAPI\Client\Model\HolderSubject[]|null
     */
    public function getSameSubject()
    {
        return $this->container['same_subject'];
    }

    /**
     * Sets same_subject
     *
     * @param \OpenAPI\Client\Model\HolderSubject[]|null $same_subject same_subject
     *
     * @return self
     */
    public function setSameSubject($same_subject)
    {
        if (is_null($same_subject)) {
            throw new \InvalidArgumentException('non-nullable same_subject cannot be null');
        }
        $this->container['same_subject'] = $same_subject;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


