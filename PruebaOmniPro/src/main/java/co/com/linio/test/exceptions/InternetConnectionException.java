package co.com.linio.test.exceptions;

public class InternetConnectionException extends RuntimeException {
    public static final String INTERNET_FAILED = "Por favor verifique su conexiòn a Internet";

    public InternetConnectionException(String message) {
        super(message);
    }
}
