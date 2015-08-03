package pool;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */

  public class NotAvailableObjectException extends RuntimeException {

    public NotAvailableObjectException(String message) {
      super(message);
    }
  }
