package bsky4j;

public class ATProtocolException extends RuntimeException {

    private String error;
    private String errorMessage;

    public ATProtocolException(Exception e) {
        super(e);
    }

    // region
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    // endregion
}
