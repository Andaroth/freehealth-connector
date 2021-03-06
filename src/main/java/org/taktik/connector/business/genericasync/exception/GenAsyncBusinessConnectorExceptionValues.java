package org.taktik.connector.business.genericasync.exception;

public enum GenAsyncBusinessConnectorExceptionValues {
   TARGET_SERVICE_ERROR("targetservice.error", "TargetService error description: {0}"),
   SESSION_MANAGEMENT_ERROR("sessionmanagement.error", "SessionManagemenent error description: {0}"),
   MALFORMED_URL("malformed.url", "Invalid url to {0} file"),
   SETTINGS_NOT_FOUND("settings.not.found", "Could not find the settings file : {0}"),
   ERROR_XML_DMGVALIDATOR("error.xml.dmg.validator", "XML is not correct: {0}"),
   ERROR_XML_UNDEFINED_XSD_FOR_XML_CLASS_VALIDATOR("error.xml.dmg.undefined.class.validator", "no xsd file location is defined for class: {0}"),
   PARAMETER_NULL("parameters.null", "This parameter is null : {0}"),
   SEND_REQUEST_FAILED("send.request.failed", "The request failed : {0}"),
   SIGNATURE_VALIDATION_ERROR("signaturevalidation.error", "Embedded signature is invalid.");

   private String errorCode;
   private String message;

   private GenAsyncBusinessConnectorExceptionValues(String errorCode, String errorMessage) {
      this.errorCode = errorCode;
      this.message = errorMessage;
   }

   public String getErrorCode() {
      return this.errorCode;
   }

   public String getMessage() {
      return this.message;
   }
}
