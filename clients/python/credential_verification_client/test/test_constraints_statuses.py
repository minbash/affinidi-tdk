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

from affinidi_tdk_credential_verification_client.models.constraints_statuses import ConstraintsStatuses  # noqa: E501

class TestConstraintsStatuses(unittest.TestCase):
    """ConstraintsStatuses unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConstraintsStatuses:
        """Test ConstraintsStatuses
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConstraintsStatuses`
        """
        model = ConstraintsStatuses()  # noqa: E501
        if include_optional:
            return ConstraintsStatuses(
                active = affinidi_tdk_credential_verification_client.models.pd_status.PdStatus(
                    directive = 'required', ),
                suspended = affinidi_tdk_credential_verification_client.models.pd_status.PdStatus(
                    directive = 'required', ),
                revoked = affinidi_tdk_credential_verification_client.models.pd_status.PdStatus(
                    directive = 'required', )
            )
        else:
            return ConstraintsStatuses(
        )
        """

    def testConstraintsStatuses(self):
        """Test ConstraintsStatuses"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
