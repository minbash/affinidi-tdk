<?php
/**
 * CreateLoginConfigurationInput
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OidcVpAdapterBackend
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
 * CreateLoginConfigurationInput Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CreateLoginConfigurationInput implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CreateLoginConfigurationInput';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'name' => 'string',
        'description' => 'string',
        'redirect_uris' => 'string[]',
        'post_logout_redirect_uris' => 'string[]',
        'vp_definition' => 'string',
        'presentation_definition' => 'object',
        'id_token_mapping' => '\OpenAPI\Client\Model\IdTokenMapping',
        'client_metadata' => '\OpenAPI\Client\Model\LoginConfigurationClientMetadataInput',
        'claim_format' => 'string',
        'fail_on_mapping_conflict' => 'bool',
        'scope' => 'string',
        'token_endpoint_auth_method' => '\OpenAPI\Client\Model\TokenEndpointAuthMethod'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'name' => null,
        'description' => null,
        'redirect_uris' => null,
        'post_logout_redirect_uris' => null,
        'vp_definition' => null,
        'presentation_definition' => null,
        'id_token_mapping' => null,
        'client_metadata' => null,
        'claim_format' => null,
        'fail_on_mapping_conflict' => null,
        'scope' => null,
        'token_endpoint_auth_method' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'name' => false,
        'description' => false,
        'redirect_uris' => false,
        'post_logout_redirect_uris' => false,
        'vp_definition' => false,
        'presentation_definition' => false,
        'id_token_mapping' => false,
        'client_metadata' => false,
        'claim_format' => false,
        'fail_on_mapping_conflict' => false,
        'scope' => false,
        'token_endpoint_auth_method' => false
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
        'name' => 'name',
        'description' => 'description',
        'redirect_uris' => 'redirectUris',
        'post_logout_redirect_uris' => 'postLogoutRedirectUris',
        'vp_definition' => 'vpDefinition',
        'presentation_definition' => 'presentationDefinition',
        'id_token_mapping' => 'idTokenMapping',
        'client_metadata' => 'clientMetadata',
        'claim_format' => 'claimFormat',
        'fail_on_mapping_conflict' => 'failOnMappingConflict',
        'scope' => 'scope',
        'token_endpoint_auth_method' => 'tokenEndpointAuthMethod'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'name' => 'setName',
        'description' => 'setDescription',
        'redirect_uris' => 'setRedirectUris',
        'post_logout_redirect_uris' => 'setPostLogoutRedirectUris',
        'vp_definition' => 'setVpDefinition',
        'presentation_definition' => 'setPresentationDefinition',
        'id_token_mapping' => 'setIdTokenMapping',
        'client_metadata' => 'setClientMetadata',
        'claim_format' => 'setClaimFormat',
        'fail_on_mapping_conflict' => 'setFailOnMappingConflict',
        'scope' => 'setScope',
        'token_endpoint_auth_method' => 'setTokenEndpointAuthMethod'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'name' => 'getName',
        'description' => 'getDescription',
        'redirect_uris' => 'getRedirectUris',
        'post_logout_redirect_uris' => 'getPostLogoutRedirectUris',
        'vp_definition' => 'getVpDefinition',
        'presentation_definition' => 'getPresentationDefinition',
        'id_token_mapping' => 'getIdTokenMapping',
        'client_metadata' => 'getClientMetadata',
        'claim_format' => 'getClaimFormat',
        'fail_on_mapping_conflict' => 'getFailOnMappingConflict',
        'scope' => 'getScope',
        'token_endpoint_auth_method' => 'getTokenEndpointAuthMethod'
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

    public const CLAIM_FORMAT__ARRAY = 'array';
    public const CLAIM_FORMAT_MAP = 'map';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getClaimFormatAllowableValues()
    {
        return [
            self::CLAIM_FORMAT__ARRAY,
            self::CLAIM_FORMAT_MAP,
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
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('description', $data ?? [], null);
        $this->setIfExists('redirect_uris', $data ?? [], null);
        $this->setIfExists('post_logout_redirect_uris', $data ?? [], null);
        $this->setIfExists('vp_definition', $data ?? [], null);
        $this->setIfExists('presentation_definition', $data ?? [], null);
        $this->setIfExists('id_token_mapping', $data ?? [], null);
        $this->setIfExists('client_metadata', $data ?? [], null);
        $this->setIfExists('claim_format', $data ?? [], null);
        $this->setIfExists('fail_on_mapping_conflict', $data ?? [], true);
        $this->setIfExists('scope', $data ?? [], null);
        $this->setIfExists('token_endpoint_auth_method', $data ?? [], null);
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

        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['redirect_uris'] === null) {
            $invalidProperties[] = "'redirect_uris' can't be null";
        }
        $allowedValues = $this->getClaimFormatAllowableValues();
        if (!is_null($this->container['claim_format']) && !in_array($this->container['claim_format'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'claim_format', must be one of '%s'",
                $this->container['claim_format'],
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
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name User defined login configuration name
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string|null $description description
     *
     * @return self
     */
    public function setDescription($description)
    {
        if (is_null($description)) {
            throw new \InvalidArgumentException('non-nullable description cannot be null');
        }
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets redirect_uris
     *
     * @return string[]
     */
    public function getRedirectUris()
    {
        return $this->container['redirect_uris'];
    }

    /**
     * Sets redirect_uris
     *
     * @param string[] $redirect_uris OAuth 2.0 Redirect URIs
     *
     * @return self
     */
    public function setRedirectUris($redirect_uris)
    {
        if (is_null($redirect_uris)) {
            throw new \InvalidArgumentException('non-nullable redirect_uris cannot be null');
        }
        $this->container['redirect_uris'] = $redirect_uris;

        return $this;
    }

    /**
     * Gets post_logout_redirect_uris
     *
     * @return string[]|null
     */
    public function getPostLogoutRedirectUris()
    {
        return $this->container['post_logout_redirect_uris'];
    }

    /**
     * Sets post_logout_redirect_uris
     *
     * @param string[]|null $post_logout_redirect_uris Post Logout Redirect URIs, Used to redirect the user's browser to a specified URL after the logout process is complete. Must match the domain, port, scheme of at least one of the registered redirect URIs
     *
     * @return self
     */
    public function setPostLogoutRedirectUris($post_logout_redirect_uris)
    {
        if (is_null($post_logout_redirect_uris)) {
            throw new \InvalidArgumentException('non-nullable post_logout_redirect_uris cannot be null');
        }
        $this->container['post_logout_redirect_uris'] = $post_logout_redirect_uris;

        return $this;
    }

    /**
     * Gets vp_definition
     *
     * @return string|null
     */
    public function getVpDefinition()
    {
        return $this->container['vp_definition'];
    }

    /**
     * Sets vp_definition
     *
     * @param string|null $vp_definition VP definition in JSON stringify format
     *
     * @return self
     */
    public function setVpDefinition($vp_definition)
    {
        if (is_null($vp_definition)) {
            throw new \InvalidArgumentException('non-nullable vp_definition cannot be null');
        }
        $this->container['vp_definition'] = $vp_definition;

        return $this;
    }

    /**
     * Gets presentation_definition
     *
     * @return object|null
     */
    public function getPresentationDefinition()
    {
        return $this->container['presentation_definition'];
    }

    /**
     * Sets presentation_definition
     *
     * @param object|null $presentation_definition Presentation Definition
     *
     * @return self
     */
    public function setPresentationDefinition($presentation_definition)
    {
        if (is_null($presentation_definition)) {
            throw new \InvalidArgumentException('non-nullable presentation_definition cannot be null');
        }
        $this->container['presentation_definition'] = $presentation_definition;

        return $this;
    }

    /**
     * Gets id_token_mapping
     *
     * @return \OpenAPI\Client\Model\IdTokenMapping|null
     */
    public function getIdTokenMapping()
    {
        return $this->container['id_token_mapping'];
    }

    /**
     * Sets id_token_mapping
     *
     * @param \OpenAPI\Client\Model\IdTokenMapping|null $id_token_mapping id_token_mapping
     *
     * @return self
     */
    public function setIdTokenMapping($id_token_mapping)
    {
        if (is_null($id_token_mapping)) {
            throw new \InvalidArgumentException('non-nullable id_token_mapping cannot be null');
        }
        $this->container['id_token_mapping'] = $id_token_mapping;

        return $this;
    }

    /**
     * Gets client_metadata
     *
     * @return \OpenAPI\Client\Model\LoginConfigurationClientMetadataInput|null
     */
    public function getClientMetadata()
    {
        return $this->container['client_metadata'];
    }

    /**
     * Sets client_metadata
     *
     * @param \OpenAPI\Client\Model\LoginConfigurationClientMetadataInput|null $client_metadata client_metadata
     *
     * @return self
     */
    public function setClientMetadata($client_metadata)
    {
        if (is_null($client_metadata)) {
            throw new \InvalidArgumentException('non-nullable client_metadata cannot be null');
        }
        $this->container['client_metadata'] = $client_metadata;

        return $this;
    }

    /**
     * Gets claim_format
     *
     * @return string|null
     */
    public function getClaimFormat()
    {
        return $this->container['claim_format'];
    }

    /**
     * Sets claim_format
     *
     * @param string|null $claim_format ID token claims output format. Default is array.
     *
     * @return self
     */
    public function setClaimFormat($claim_format)
    {
        if (is_null($claim_format)) {
            throw new \InvalidArgumentException('non-nullable claim_format cannot be null');
        }
        $allowedValues = $this->getClaimFormatAllowableValues();
        if (!in_array($claim_format, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'claim_format', must be one of '%s'",
                    $claim_format,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['claim_format'] = $claim_format;

        return $this;
    }

    /**
     * Gets fail_on_mapping_conflict
     *
     * @return bool|null
     */
    public function getFailOnMappingConflict()
    {
        return $this->container['fail_on_mapping_conflict'];
    }

    /**
     * Sets fail_on_mapping_conflict
     *
     * @param bool|null $fail_on_mapping_conflict Interrupts login process if duplications of data fields names will be found
     *
     * @return self
     */
    public function setFailOnMappingConflict($fail_on_mapping_conflict)
    {
        if (is_null($fail_on_mapping_conflict)) {
            throw new \InvalidArgumentException('non-nullable fail_on_mapping_conflict cannot be null');
        }
        $this->container['fail_on_mapping_conflict'] = $fail_on_mapping_conflict;

        return $this;
    }

    /**
     * Gets scope
     *
     * @return string|null
     */
    public function getScope()
    {
        return $this->container['scope'];
    }

    /**
     * Sets scope
     *
     * @param string|null $scope List of groups separated by space
     *
     * @return self
     */
    public function setScope($scope)
    {
        if (is_null($scope)) {
            throw new \InvalidArgumentException('non-nullable scope cannot be null');
        }
        $this->container['scope'] = $scope;

        return $this;
    }

    /**
     * Gets token_endpoint_auth_method
     *
     * @return \OpenAPI\Client\Model\TokenEndpointAuthMethod|null
     */
    public function getTokenEndpointAuthMethod()
    {
        return $this->container['token_endpoint_auth_method'];
    }

    /**
     * Sets token_endpoint_auth_method
     *
     * @param \OpenAPI\Client\Model\TokenEndpointAuthMethod|null $token_endpoint_auth_method token_endpoint_auth_method
     *
     * @return self
     */
    public function setTokenEndpointAuthMethod($token_endpoint_auth_method)
    {
        if (is_null($token_endpoint_auth_method)) {
            throw new \InvalidArgumentException('non-nullable token_endpoint_auth_method cannot be null');
        }
        $this->container['token_endpoint_auth_method'] = $token_endpoint_auth_method;

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


