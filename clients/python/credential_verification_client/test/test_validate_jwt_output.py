# coding: utf-8

"""
    VerificationService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_credential_verification_client.models.validate_jwt_output import ValidateJwtOutput  # noqa: E501

class TestValidateJwtOutput(unittest.TestCase):
    """ValidateJwtOutput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ValidateJwtOutput:
        """Test ValidateJwtOutput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ValidateJwtOutput`
        """
        model = ValidateJwtOutput()  # noqa: E501
        if include_optional:
            return ValidateJwtOutput(
                is_valid = True,
                payload = None
            )
        else:
            return ValidateJwtOutput(
                is_valid = True,
                payload = None,
        )
        """

    def testValidateJwtOutput(self):
        """Test ValidateJwtOutput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
