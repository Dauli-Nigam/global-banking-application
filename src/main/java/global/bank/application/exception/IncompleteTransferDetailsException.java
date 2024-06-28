package global.bank.application.exception;

public class IncompleteTransferDetailsException extends RuntimeException {
    public IncompleteTransferDetailsException(String message) {
        super(message);
    }
}
