public class ErrorMessage {

    private String errorLevel;
    private String errorMessage;
    private String errorTime;

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "errorLevel='" + errorLevel + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorTime='" + errorTime + '\'' +
                '}';
    }

    public String getErrorLevel() {
        return errorLevel;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorTime() {
        return errorTime;
    }

    public ErrorMessage(String errorLevel, String errorMessage, String errorTime) {
        this.errorLevel = errorLevel;
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }

    public String toLine(){
        return this.errorTime + ": " + this.errorLevel + " - " + this.errorMessage;
    }

}
