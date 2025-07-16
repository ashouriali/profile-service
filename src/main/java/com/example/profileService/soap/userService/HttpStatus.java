
package com.example.profileService.soap.userService;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for httpStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="httpStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTINUE"/&gt;
 *     &lt;enumeration value="SWITCHING_PROTOCOLS"/&gt;
 *     &lt;enumeration value="PROCESSING"/&gt;
 *     &lt;enumeration value="EARLY_HINTS"/&gt;
 *     &lt;enumeration value="CHECKPOINT"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *     &lt;enumeration value="ACCEPTED"/&gt;
 *     &lt;enumeration value="NON_AUTHORITATIVE_INFORMATION"/&gt;
 *     &lt;enumeration value="NO_CONTENT"/&gt;
 *     &lt;enumeration value="RESET_CONTENT"/&gt;
 *     &lt;enumeration value="PARTIAL_CONTENT"/&gt;
 *     &lt;enumeration value="MULTI_STATUS"/&gt;
 *     &lt;enumeration value="ALREADY_REPORTED"/&gt;
 *     &lt;enumeration value="IM_USED"/&gt;
 *     &lt;enumeration value="MULTIPLE_CHOICES"/&gt;
 *     &lt;enumeration value="MOVED_PERMANENTLY"/&gt;
 *     &lt;enumeration value="FOUND"/&gt;
 *     &lt;enumeration value="MOVED_TEMPORARILY"/&gt;
 *     &lt;enumeration value="SEE_OTHER"/&gt;
 *     &lt;enumeration value="NOT_MODIFIED"/&gt;
 *     &lt;enumeration value="USE_PROXY"/&gt;
 *     &lt;enumeration value="TEMPORARY_REDIRECT"/&gt;
 *     &lt;enumeration value="PERMANENT_REDIRECT"/&gt;
 *     &lt;enumeration value="BAD_REQUEST"/&gt;
 *     &lt;enumeration value="UNAUTHORIZED"/&gt;
 *     &lt;enumeration value="PAYMENT_REQUIRED"/&gt;
 *     &lt;enumeration value="FORBIDDEN"/&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *     &lt;enumeration value="METHOD_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="NOT_ACCEPTABLE"/&gt;
 *     &lt;enumeration value="PROXY_AUTHENTICATION_REQUIRED"/&gt;
 *     &lt;enumeration value="REQUEST_TIMEOUT"/&gt;
 *     &lt;enumeration value="CONFLICT"/&gt;
 *     &lt;enumeration value="GONE"/&gt;
 *     &lt;enumeration value="LENGTH_REQUIRED"/&gt;
 *     &lt;enumeration value="PRECONDITION_FAILED"/&gt;
 *     &lt;enumeration value="PAYLOAD_TOO_LARGE"/&gt;
 *     &lt;enumeration value="REQUEST_ENTITY_TOO_LARGE"/&gt;
 *     &lt;enumeration value="URI_TOO_LONG"/&gt;
 *     &lt;enumeration value="REQUEST_URI_TOO_LONG"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_MEDIA_TYPE"/&gt;
 *     &lt;enumeration value="REQUESTED_RANGE_NOT_SATISFIABLE"/&gt;
 *     &lt;enumeration value="EXPECTATION_FAILED"/&gt;
 *     &lt;enumeration value="I_AM_A_TEAPOT"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_SPACE_ON_RESOURCE"/&gt;
 *     &lt;enumeration value="METHOD_FAILURE"/&gt;
 *     &lt;enumeration value="DESTINATION_LOCKED"/&gt;
 *     &lt;enumeration value="UNPROCESSABLE_ENTITY"/&gt;
 *     &lt;enumeration value="LOCKED"/&gt;
 *     &lt;enumeration value="FAILED_DEPENDENCY"/&gt;
 *     &lt;enumeration value="TOO_EARLY"/&gt;
 *     &lt;enumeration value="UPGRADE_REQUIRED"/&gt;
 *     &lt;enumeration value="PRECONDITION_REQUIRED"/&gt;
 *     &lt;enumeration value="TOO_MANY_REQUESTS"/&gt;
 *     &lt;enumeration value="REQUEST_HEADER_FIELDS_TOO_LARGE"/&gt;
 *     &lt;enumeration value="UNAVAILABLE_FOR_LEGAL_REASONS"/&gt;
 *     &lt;enumeration value="INTERNAL_SERVER_ERROR"/&gt;
 *     &lt;enumeration value="NOT_IMPLEMENTED"/&gt;
 *     &lt;enumeration value="BAD_GATEWAY"/&gt;
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="GATEWAY_TIMEOUT"/&gt;
 *     &lt;enumeration value="HTTP_VERSION_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="VARIANT_ALSO_NEGOTIATES"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_STORAGE"/&gt;
 *     &lt;enumeration value="LOOP_DETECTED"/&gt;
 *     &lt;enumeration value="BANDWIDTH_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="NOT_EXTENDED"/&gt;
 *     &lt;enumeration value="NETWORK_AUTHENTICATION_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "httpStatus")
@XmlEnum
public enum HttpStatus {

    CONTINUE,
    SWITCHING_PROTOCOLS,
    PROCESSING,
    EARLY_HINTS,
    CHECKPOINT,
    OK,
    CREATED,
    ACCEPTED,
    NON_AUTHORITATIVE_INFORMATION,
    NO_CONTENT,
    RESET_CONTENT,
    PARTIAL_CONTENT,
    MULTI_STATUS,
    ALREADY_REPORTED,
    IM_USED,
    MULTIPLE_CHOICES,
    MOVED_PERMANENTLY,
    FOUND,
    MOVED_TEMPORARILY,
    SEE_OTHER,
    NOT_MODIFIED,
    USE_PROXY,
    TEMPORARY_REDIRECT,
    PERMANENT_REDIRECT,
    BAD_REQUEST,
    UNAUTHORIZED,
    PAYMENT_REQUIRED,
    FORBIDDEN,
    NOT_FOUND,
    METHOD_NOT_ALLOWED,
    NOT_ACCEPTABLE,
    PROXY_AUTHENTICATION_REQUIRED,
    REQUEST_TIMEOUT,
    CONFLICT,
    GONE,
    LENGTH_REQUIRED,
    PRECONDITION_FAILED,
    PAYLOAD_TOO_LARGE,
    REQUEST_ENTITY_TOO_LARGE,
    URI_TOO_LONG,
    REQUEST_URI_TOO_LONG,
    UNSUPPORTED_MEDIA_TYPE,
    REQUESTED_RANGE_NOT_SATISFIABLE,
    EXPECTATION_FAILED,
    I_AM_A_TEAPOT,
    INSUFFICIENT_SPACE_ON_RESOURCE,
    METHOD_FAILURE,
    DESTINATION_LOCKED,
    UNPROCESSABLE_ENTITY,
    LOCKED,
    FAILED_DEPENDENCY,
    TOO_EARLY,
    UPGRADE_REQUIRED,
    PRECONDITION_REQUIRED,
    TOO_MANY_REQUESTS,
    REQUEST_HEADER_FIELDS_TOO_LARGE,
    UNAVAILABLE_FOR_LEGAL_REASONS,
    INTERNAL_SERVER_ERROR,
    NOT_IMPLEMENTED,
    BAD_GATEWAY,
    SERVICE_UNAVAILABLE,
    GATEWAY_TIMEOUT,
    HTTP_VERSION_NOT_SUPPORTED,
    VARIANT_ALSO_NEGOTIATES,
    INSUFFICIENT_STORAGE,
    LOOP_DETECTED,
    BANDWIDTH_LIMIT_EXCEEDED,
    NOT_EXTENDED,
    NETWORK_AUTHENTICATION_REQUIRED;

    public String value() {
        return name();
    }

    public static HttpStatus fromValue(String v) {
        return valueOf(v);
    }

}
