package global.bank.application.exception;

public class DuplicateAccountIdException extends RuntimeException {

  public DuplicateAccountIdException(String message) {
    super(message);
  }
}
