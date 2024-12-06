<?php
/**
 * TokenEndpointAuthMethod
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
use \OpenAPI\Client\ObjectSerializer;

/**
 * TokenEndpointAuthMethod Class Doc Comment
 *
 * @category Class
 * @description Requested Client Authentication method for the Token Endpoint. The options are: &#x60;client_secret_post&#x60;: (default) Send client_id and client_secret as application/x-www-form-urlencoded in the HTTP body. &#x60;client_secret_basic&#x60;: Send client_id and client_secret as application/x-www-form-urlencoded encoded in the HTTP Authorization header. &#x60;none&#x60;: For public clients (native/mobile apps) which can not have secret.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class TokenEndpointAuthMethod
{
    /**
     * Possible values of this enum
     */
    public const CLIENT_SECRET_BASIC = 'client_secret_basic';

    public const CLIENT_SECRET_POST = 'client_secret_post';

    public const NONE = 'none';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CLIENT_SECRET_BASIC,
            self::CLIENT_SECRET_POST,
            self::NONE
        ];
    }
}


