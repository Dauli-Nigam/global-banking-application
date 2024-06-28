package global.bank.application.exception;

public class IllegalAmountException extends RuntimeException {
    public IllegalAmountException(String message) {
        super(message);
    }
}
