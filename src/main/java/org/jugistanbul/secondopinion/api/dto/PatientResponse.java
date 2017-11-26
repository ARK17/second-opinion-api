package org.jugistanbul.secondopinion.api.dto;

public class PatientResponse extends Response {

    private String status;
    private String errorCode;
    private String errorMessage;
    private long patientId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getPatientId() {

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
}
