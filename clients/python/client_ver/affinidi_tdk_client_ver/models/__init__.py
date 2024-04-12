# coding: utf-8

# flake8: noqa
"""
    VerificationService

    Affinidi VerificationService Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


# import models into model package
from affinidi_tdk_client_ver.models.constraints import Constraints
from affinidi_tdk_client_ver.models.constraints_statuses import ConstraintsStatuses
from affinidi_tdk_client_ver.models.credential_requirements import CredentialRequirements
from affinidi_tdk_client_ver.models.credential_requirements_constraints import CredentialRequirementsConstraints
from affinidi_tdk_client_ver.models.descriptor import Descriptor
from affinidi_tdk_client_ver.models.error import Error
from affinidi_tdk_client_ver.models.error_detail import ErrorDetail
from affinidi_tdk_client_ver.models.evaluate_vp_output import EvaluateVpOutput
from affinidi_tdk_client_ver.models.field import Field
from affinidi_tdk_client_ver.models.filter import Filter
from affinidi_tdk_client_ver.models.filter_const import FilterConst
from affinidi_tdk_client_ver.models.filter_items import FilterItems
from affinidi_tdk_client_ver.models.format import Format
from affinidi_tdk_client_ver.models.free_form_object import FreeFormObject
from affinidi_tdk_client_ver.models.holder_subject import HolderSubject
from affinidi_tdk_client_ver.models.input_descriptor import InputDescriptor
from affinidi_tdk_client_ver.models.invalid_parameter_error import InvalidParameterError
from affinidi_tdk_client_ver.models.jwt_object import JwtObject
from affinidi_tdk_client_ver.models.ldp_object import LdpObject
from affinidi_tdk_client_ver.models.nested_descriptor import NestedDescriptor
from affinidi_tdk_client_ver.models.not_found_error import NotFoundError
from affinidi_tdk_client_ver.models.not_found_error_details_inner import NotFoundErrorDetailsInner
from affinidi_tdk_client_ver.models.pd_status import PdStatus
from affinidi_tdk_client_ver.models.presentation_definition import PresentationDefinition
from affinidi_tdk_client_ver.models.presentation_submission import PresentationSubmission
from affinidi_tdk_client_ver.models.submission_requirement import SubmissionRequirement
from affinidi_tdk_client_ver.models.validate_jwt_input import ValidateJwtInput
from affinidi_tdk_client_ver.models.validate_jwt_output import ValidateJwtOutput
from affinidi_tdk_client_ver.models.verify_credential_input import VerifyCredentialInput
from affinidi_tdk_client_ver.models.verify_credential_output import VerifyCredentialOutput
from affinidi_tdk_client_ver.models.verify_presentation_input import VerifyPresentationInput
from affinidi_tdk_client_ver.models.verify_presentation_output import VerifyPresentationOutput
from affinidi_tdk_client_ver.models.verify_presentation_output_errors import VerifyPresentationOutputErrors
from affinidi_tdk_client_ver.models.w3c_credential import W3cCredential
from affinidi_tdk_client_ver.models.w3c_credential_credential_schema import W3cCredentialCredentialSchema
from affinidi_tdk_client_ver.models.w3c_credential_credential_subject import W3cCredentialCredentialSubject
from affinidi_tdk_client_ver.models.w3c_credential_holder import W3cCredentialHolder
from affinidi_tdk_client_ver.models.w3c_credential_status import W3cCredentialStatus
from affinidi_tdk_client_ver.models.w3c_presentation import W3cPresentation
from affinidi_tdk_client_ver.models.w3c_presentation_context import W3cPresentationContext
from affinidi_tdk_client_ver.models.w3c_presentation_context_one_of_inner import W3cPresentationContextOneOfInner
from affinidi_tdk_client_ver.models.w3c_proof import W3cProof
