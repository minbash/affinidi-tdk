# coding: utf-8

"""
    IotaService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import re  # noqa: F401
import io
import warnings

from pydantic import validate_arguments, ValidationError

from typing_extensions import Annotated
from pydantic import Field, StrictStr, conint, constr

from typing import Optional

from affinidi_tdk_iota_client.models.create_pex_query_input import CreatePexQueryInput
from affinidi_tdk_iota_client.models.list_pex_queries_ok import ListPexQueriesOK
from affinidi_tdk_iota_client.models.pex_query_dto import PexQueryDto
from affinidi_tdk_iota_client.models.update_pex_query_input import UpdatePexQueryInput

from affinidi_tdk_iota_client.api_client import ApiClient
from affinidi_tdk_iota_client.api_response import ApiResponse
from affinidi_tdk_iota_client.exceptions import (  # noqa: F401
    ApiTypeError,
    ApiValueError
)


class PexQueryApi:
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None) -> None:
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client

    @validate_arguments
    def create_pex_query(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], create_pex_query_input : Annotated[CreatePexQueryInput, Field(..., description="CreatePexQuery")], **kwargs) -> PexQueryDto:  # noqa: E501
        """create_pex_query  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_pex_query(configuration_id, create_pex_query_input, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param create_pex_query_input: CreatePexQuery (required)
        :type create_pex_query_input: CreatePexQueryInput
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request.
               If one number provided, it will be total request
               timeout. It can also be a pair (tuple) of
               (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: PexQueryDto
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            message = "Error! Please call the create_pex_query_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data"  # noqa: E501
            raise ValueError(message)
        return self.create_pex_query_with_http_info(configuration_id, create_pex_query_input, **kwargs)  # noqa: E501

    @validate_arguments
    def create_pex_query_with_http_info(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], create_pex_query_input : Annotated[CreatePexQueryInput, Field(..., description="CreatePexQuery")], **kwargs) -> ApiResponse:  # noqa: E501
        """create_pex_query  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_pex_query_with_http_info(configuration_id, create_pex_query_input, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param create_pex_query_input: CreatePexQuery (required)
        :type create_pex_query_input: CreatePexQueryInput
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(PexQueryDto, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'configuration_id',
            'create_pex_query_input'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_pex_query" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}
        if _params['configuration_id'] is not None:
            _path_params['configurationId'] = _params['configuration_id']


        # process the query parameters
        _query_params = []
        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params = []
        _files = {}
        # process the body parameter
        _body_params = None
        if _params['create_pex_query_input'] is not None:
            _body_params = _params['create_pex_query_input']

        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # set the HTTP header `Content-Type`
        _content_types_list = _params.get('_content_type',
            self.api_client.select_header_content_type(
                ['application/json']))
        if _content_types_list:
                _header_params['Content-Type'] = _content_types_list

        # authentication setting
        _auth_settings = ['ProjectTokenAuth']  # noqa: E501

        _response_types_map = {
            '201': "PexQueryDto",
            '400': "InvalidParameterError",
            '403': "OperationForbiddenError",
            '404': "NotFoundError",
            '409': "AlreadyExistsError",
            '422': "ResourceLimitExceededError",
        }

        return self.api_client.call_api(
            '/v1/configurations/{configurationId}/pex-queries', 'POST',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))

    @validate_arguments
    def delete_pex_query_by_id(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], query_id : Annotated[StrictStr, Field(..., description="pex-query Id")], **kwargs) -> None:  # noqa: E501
        """delete_pex_query_by_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_pex_query_by_id(configuration_id, query_id, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param query_id: pex-query Id (required)
        :type query_id: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request.
               If one number provided, it will be total request
               timeout. It can also be a pair (tuple) of
               (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: None
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            message = "Error! Please call the delete_pex_query_by_id_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data"  # noqa: E501
            raise ValueError(message)
        return self.delete_pex_query_by_id_with_http_info(configuration_id, query_id, **kwargs)  # noqa: E501

    @validate_arguments
    def delete_pex_query_by_id_with_http_info(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], query_id : Annotated[StrictStr, Field(..., description="pex-query Id")], **kwargs) -> ApiResponse:  # noqa: E501
        """delete_pex_query_by_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_pex_query_by_id_with_http_info(configuration_id, query_id, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param query_id: pex-query Id (required)
        :type query_id: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: None
        """

        _params = locals()

        _all_params = [
            'configuration_id',
            'query_id'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_pex_query_by_id" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}
        if _params['configuration_id'] is not None:
            _path_params['configurationId'] = _params['configuration_id']

        if _params['query_id'] is not None:
            _path_params['queryId'] = _params['query_id']


        # process the query parameters
        _query_params = []
        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params = []
        _files = {}
        # process the body parameter
        _body_params = None
        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # authentication setting
        _auth_settings = ['ProjectTokenAuth']  # noqa: E501

        _response_types_map = {}

        return self.api_client.call_api(
            '/v1/configurations/{configurationId}/pex-queries/{queryId}', 'DELETE',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))

    @validate_arguments
    def get_pex_query_by_id(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], query_id : Annotated[StrictStr, Field(..., description="pex-query Id")], **kwargs) -> PexQueryDto:  # noqa: E501
        """get_pex_query_by_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_pex_query_by_id(configuration_id, query_id, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param query_id: pex-query Id (required)
        :type query_id: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request.
               If one number provided, it will be total request
               timeout. It can also be a pair (tuple) of
               (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: PexQueryDto
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            message = "Error! Please call the get_pex_query_by_id_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data"  # noqa: E501
            raise ValueError(message)
        return self.get_pex_query_by_id_with_http_info(configuration_id, query_id, **kwargs)  # noqa: E501

    @validate_arguments
    def get_pex_query_by_id_with_http_info(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], query_id : Annotated[StrictStr, Field(..., description="pex-query Id")], **kwargs) -> ApiResponse:  # noqa: E501
        """get_pex_query_by_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_pex_query_by_id_with_http_info(configuration_id, query_id, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param query_id: pex-query Id (required)
        :type query_id: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(PexQueryDto, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'configuration_id',
            'query_id'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_pex_query_by_id" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}
        if _params['configuration_id'] is not None:
            _path_params['configurationId'] = _params['configuration_id']

        if _params['query_id'] is not None:
            _path_params['queryId'] = _params['query_id']


        # process the query parameters
        _query_params = []
        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params = []
        _files = {}
        # process the body parameter
        _body_params = None
        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # authentication setting
        _auth_settings = ['ProjectTokenAuth']  # noqa: E501

        _response_types_map = {
            '200': "PexQueryDto",
            '400': "InvalidParameterError",
            '403': "OperationForbiddenError",
            '404': "NotFoundError",
        }

        return self.api_client.call_api(
            '/v1/configurations/{configurationId}/pex-queries/{queryId}', 'GET',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))

    @validate_arguments
    def list_pex_queries(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], limit : Annotated[Optional[conint(strict=True, le=100, ge=1)], Field(description="Maximum number of records to fetch in a list")] = None, exclusive_start_key : Annotated[Optional[constr(strict=True, max_length=3000)], Field(description="The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation.")] = None, **kwargs) -> ListPexQueriesOK:  # noqa: E501
        """list_pex_queries  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.list_pex_queries(configuration_id, limit, exclusive_start_key, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param limit: Maximum number of records to fetch in a list
        :type limit: int
        :param exclusive_start_key: The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation.
        :type exclusive_start_key: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request.
               If one number provided, it will be total request
               timeout. It can also be a pair (tuple) of
               (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: ListPexQueriesOK
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            message = "Error! Please call the list_pex_queries_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data"  # noqa: E501
            raise ValueError(message)
        return self.list_pex_queries_with_http_info(configuration_id, limit, exclusive_start_key, **kwargs)  # noqa: E501

    @validate_arguments
    def list_pex_queries_with_http_info(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], limit : Annotated[Optional[conint(strict=True, le=100, ge=1)], Field(description="Maximum number of records to fetch in a list")] = None, exclusive_start_key : Annotated[Optional[constr(strict=True, max_length=3000)], Field(description="The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation.")] = None, **kwargs) -> ApiResponse:  # noqa: E501
        """list_pex_queries  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.list_pex_queries_with_http_info(configuration_id, limit, exclusive_start_key, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param limit: Maximum number of records to fetch in a list
        :type limit: int
        :param exclusive_start_key: The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation.
        :type exclusive_start_key: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(ListPexQueriesOK, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'configuration_id',
            'limit',
            'exclusive_start_key'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method list_pex_queries" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}
        if _params['configuration_id'] is not None:
            _path_params['configurationId'] = _params['configuration_id']


        # process the query parameters
        _query_params = []
        if _params.get('limit') is not None:  # noqa: E501
            _query_params.append(('limit', _params['limit']))

        if _params.get('exclusive_start_key') is not None:  # noqa: E501
            _query_params.append(('exclusiveStartKey', _params['exclusive_start_key']))

        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params = []
        _files = {}
        # process the body parameter
        _body_params = None
        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # authentication setting
        _auth_settings = ['ProjectTokenAuth']  # noqa: E501

        _response_types_map = {
            '200': "ListPexQueriesOK",
            '400': "InvalidParameterError",
            '403': "OperationForbiddenError",
            '404': "NotFoundError",
        }

        return self.api_client.call_api(
            '/v1/configurations/{configurationId}/pex-queries', 'GET',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))

    @validate_arguments
    def update_pex_query_by_id(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], query_id : Annotated[StrictStr, Field(..., description="pex-query Id")], update_pex_query_input : Annotated[UpdatePexQueryInput, Field(..., description="UpdatePexQueryById")], **kwargs) -> PexQueryDto:  # noqa: E501
        """update_pex_query_by_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_pex_query_by_id(configuration_id, query_id, update_pex_query_input, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param query_id: pex-query Id (required)
        :type query_id: str
        :param update_pex_query_input: UpdatePexQueryById (required)
        :type update_pex_query_input: UpdatePexQueryInput
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request.
               If one number provided, it will be total request
               timeout. It can also be a pair (tuple) of
               (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: PexQueryDto
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            message = "Error! Please call the update_pex_query_by_id_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data"  # noqa: E501
            raise ValueError(message)
        return self.update_pex_query_by_id_with_http_info(configuration_id, query_id, update_pex_query_input, **kwargs)  # noqa: E501

    @validate_arguments
    def update_pex_query_by_id_with_http_info(self, configuration_id : Annotated[StrictStr, Field(..., description="iotaConfiguration Id")], query_id : Annotated[StrictStr, Field(..., description="pex-query Id")], update_pex_query_input : Annotated[UpdatePexQueryInput, Field(..., description="UpdatePexQueryById")], **kwargs) -> ApiResponse:  # noqa: E501
        """update_pex_query_by_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_pex_query_by_id_with_http_info(configuration_id, query_id, update_pex_query_input, async_req=True)
        >>> result = thread.get()

        :param configuration_id: iotaConfiguration Id (required)
        :type configuration_id: str
        :param query_id: pex-query Id (required)
        :type query_id: str
        :param update_pex_query_input: UpdatePexQueryById (required)
        :type update_pex_query_input: UpdatePexQueryInput
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(PexQueryDto, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'configuration_id',
            'query_id',
            'update_pex_query_input'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_pex_query_by_id" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}
        if _params['configuration_id'] is not None:
            _path_params['configurationId'] = _params['configuration_id']

        if _params['query_id'] is not None:
            _path_params['queryId'] = _params['query_id']


        # process the query parameters
        _query_params = []
        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params = []
        _files = {}
        # process the body parameter
        _body_params = None
        if _params['update_pex_query_input'] is not None:
            _body_params = _params['update_pex_query_input']

        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # set the HTTP header `Content-Type`
        _content_types_list = _params.get('_content_type',
            self.api_client.select_header_content_type(
                ['application/json']))
        if _content_types_list:
                _header_params['Content-Type'] = _content_types_list

        # authentication setting
        _auth_settings = ['ProjectTokenAuth']  # noqa: E501

        _response_types_map = {
            '200': "PexQueryDto",
            '400': "InvalidParameterError",
            '403': "OperationForbiddenError",
            '404': "NotFoundError",
        }

        return self.api_client.call_api(
            '/v1/configurations/{configurationId}/pex-queries/{queryId}', 'PATCH',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))
