# coding: utf-8

"""
    Iam

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_iam_client.models.principal_cannot_be_deleted_error import PrincipalCannotBeDeletedError  # noqa: E501

class TestPrincipalCannotBeDeletedError(unittest.TestCase):
    """PrincipalCannotBeDeletedError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PrincipalCannotBeDeletedError:
        """Test PrincipalCannotBeDeletedError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PrincipalCannotBeDeletedError`
        """
        model = PrincipalCannotBeDeletedError()  # noqa: E501
        if include_optional:
            return PrincipalCannotBeDeletedError(
                name = 'PrincipalCannotBeDeletedError',
                message = 'Cannot delete own record from the project with the same principalId',
                http_status_code = 409,
                trace_id = '',
                details = [
                    affinidi_tdk_iam_client.models.service_error_response_details_inner.ServiceErrorResponse_details_inner(
                        issue = '', 
                        field = '', 
                        value = '', 
                        location = '', )
                    ]
            )
        else:
            return PrincipalCannotBeDeletedError(
                name = 'PrincipalCannotBeDeletedError',
                message = 'Cannot delete own record from the project with the same principalId',
                http_status_code = 409,
                trace_id = '',
        )
        """

    def testPrincipalCannotBeDeletedError(self):
        """Test PrincipalCannotBeDeletedError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
