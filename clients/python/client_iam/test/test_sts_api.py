# coding: utf-8

"""
    Iam

    Affinidi IAM

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from affinidi_tdk_client_iam.api.sts_api import StsApi  # noqa: E501


class TestStsApi(unittest.TestCase):
    """StsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = StsApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_create_project_scoped_token(self) -> None:
        """Test case for create_project_scoped_token

        """
        pass

    def test_whoami(self) -> None:
        """Test case for whoami

        """
        pass


if __name__ == '__main__':
    unittest.main()
