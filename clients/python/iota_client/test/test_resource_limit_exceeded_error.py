# coding: utf-8

"""
    IotaService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_iota_client.models.resource_limit_exceeded_error import ResourceLimitExceededError  # noqa: E501

class TestResourceLimitExceededError(unittest.TestCase):
    """ResourceLimitExceededError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ResourceLimitExceededError:
        """Test ResourceLimitExceededError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ResourceLimitExceededError`
        """
        model = ResourceLimitExceededError()  # noqa: E501
        if include_optional:
            return ResourceLimitExceededError(
                name = 'ResourceLimitExceededError',
                message = 'Resource limit exceeded: ${param}.',
                http_status_code = 422,
                trace_id = '',
                details = [
                    affinidi_tdk_iota_client.models.invalid_parameter_error_details_inner.InvalidParameterError_details_inner(
                        issue = '', 
                        field = '', 
                        value = '', 
                        location = '', )
                    ]
            )
        else:
            return ResourceLimitExceededError(
                name = 'ResourceLimitExceededError',
                message = 'Resource limit exceeded: ${param}.',
                http_status_code = 422,
                trace_id = '',
        )
        """

    def testResourceLimitExceededError(self):
        """Test ResourceLimitExceededError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
