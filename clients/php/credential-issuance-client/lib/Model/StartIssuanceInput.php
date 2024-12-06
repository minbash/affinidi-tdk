<?php
/**
 * StartIssuanceInput
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * CredentialIssuanceService
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
 * StartIssuanceInput Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class StartIssuanceInput implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'StartIssuanceInput';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'claim_mode' => 'string',
        'holder_did' => 'string',
        'issuance_id' => 'string',
        'data' => '\OpenAPI\Client\Model\StartIssuanceInputDataInner[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'claim_mode' => null,
        'holder_did' => null,
        'issuance_id' => null,
        'data' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'claim_mode' => false,
        'holder_did' => false,
        'issuance_id' => false,
        'data' => false
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
        'claim_mode' => 'claimMode',
        'holder_did' => 'holderDid',
        'issuance_id' => 'issuanceId',
        'data' => 'data'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'claim_mode' => 'setClaimMode',
        'holder_did' => 'setHolderDid',
        'issuance_id' => 'setIssuanceId',
        'data' => 'setData'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'claim_mode' => 'getClaimMode',
        'holder_did' => 'getHolderDid',
        'issuance_id' => 'getIssuanceId',
        'data' => 'getData'
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

    public const CLAIM_MODE_NORMAL = 'NORMAL';
    public const CLAIM_MODE_TX_CODE = 'TX_CODE';
    public const CLAIM_MODE_FIXED_HOLDER = 'FIXED_HOLDER';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getClaimModeAllowableValues()
    {
        return [
            self::CLAIM_MODE_NORMAL,
            self::CLAIM_MODE_TX_CODE,
            self::CLAIM_MODE_FIXED_HOLDER,
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
        $this->setIfExists('claim_mode', $data ?? [], null);
        $this->setIfExists('holder_did', $data ?? [], null);
        $this->setIfExists('issuance_id', $data ?? [], null);
        $this->setIfExists('data', $data ?? [], null);
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

        $allowedValues = $this->getClaimModeAllowableValues();
        if (!is_null($this->container['claim_mode']) && !in_array($this->container['claim_mode'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'claim_mode', must be one of '%s'",
                $this->container['claim_mode'],
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['holder_did']) && !preg_match("/^did:.+$/", $this->container['holder_did'])) {
            $invalidProperties[] = "invalid value for 'holder_did', must be conform to the pattern /^did:.+$/.";
        }

        if ($this->container['data'] === null) {
            $invalidProperties[] = "'data' can't be null";
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
     * Gets claim_mode
     *
     * @return string|null
     */
    public function getClaimMode()
    {
        return $this->container['claim_mode'];
    }

    /**
     * Sets claim_mode
     *
     * @param string|null $claim_mode In TX_CODE claim mode, additional transaction code will be generated and the Authorization Server expects presentation of the transaction Code by the end-user. If FIXED_HOLDER claim mode is defined, holderDid must be present and service will not generate additional transaction code (NORMAL claimMode is deprecated).
     *
     * @return self
     */
    public function setClaimMode($claim_mode)
    {
        if (is_null($claim_mode)) {
            throw new \InvalidArgumentException('non-nullable claim_mode cannot be null');
        }
        $allowedValues = $this->getClaimModeAllowableValues();
        if (!in_array($claim_mode, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'claim_mode', must be one of '%s'",
                    $claim_mode,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['claim_mode'] = $claim_mode;

        return $this;
    }

    /**
     * Gets holder_did
     *
     * @return string|null
     */
    public function getHolderDid()
    {
        return $this->container['holder_did'];
    }

    /**
     * Sets holder_did
     *
     * @param string|null $holder_did Holder DID
     *
     * @return self
     */
    public function setHolderDid($holder_did)
    {
        if (is_null($holder_did)) {
            throw new \InvalidArgumentException('non-nullable holder_did cannot be null');
        }

        if ((!preg_match("/^did:.+$/", ObjectSerializer::toString($holder_did)))) {
            throw new \InvalidArgumentException("invalid value for \$holder_did when calling StartIssuanceInput., must conform to the pattern /^did:.+$/.");
        }

        $this->container['holder_did'] = $holder_did;

        return $this;
    }

    /**
     * Gets issuance_id
     *
     * @return string|null
     */
    public function getIssuanceId()
    {
        return $this->container['issuance_id'];
    }

    /**
     * Sets issuance_id
     *
     * @param string|null $issuance_id Website's internal identifier. Website may use to get info about the status of issuance flow. If it is not provided, CIS will generate one.
     *
     * @return self
     */
    public function setIssuanceId($issuance_id)
    {
        if (is_null($issuance_id)) {
            throw new \InvalidArgumentException('non-nullable issuance_id cannot be null');
        }
        $this->container['issuance_id'] = $issuance_id;

        return $this;
    }

    /**
     * Gets data
     *
     * @return \OpenAPI\Client\Model\StartIssuanceInputDataInner[]
     */
    public function getData()
    {
        return $this->container['data'];
    }

    /**
     * Sets data
     *
     * @param \OpenAPI\Client\Model\StartIssuanceInputDataInner[] $data data
     *
     * @return self
     */
    public function setData($data)
    {
        if (is_null($data)) {
            throw new \InvalidArgumentException('non-nullable data cannot be null');
        }
        $this->container['data'] = $data;

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


