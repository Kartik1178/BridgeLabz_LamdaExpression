/*
 * UC12: Custom Exception Class for Invalid User Details
 * This exception is thrown when user input validation fails
 * for first name, last name, email, mobile, or password.
 */
public class InvalidUserDetailsException extends Exception {

    public InvalidUserDetailsException(String message) {
        super(message);
    }
}