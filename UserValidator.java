
/*
 * UC13: Functional Interface for User Validation
 * This interface represents a lambda-based validator
 * that validates user input and throws exception if invalid.
 */
@FunctionalInterface
public interface UserValidator {
    boolean validate(String input) throws InvalidUserDetailsException;
}