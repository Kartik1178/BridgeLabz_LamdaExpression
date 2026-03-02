/*
 * UC12: Validator Class using Lambda Expressions with Custom Exceptions
 * Throws InvalidUserDetailsException when validation fails
 * for First Name, Last Name, Email, Mobile, and Password.
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda validators
    private static final Predicate<String> firstNameValidator =
            name -> name.matches("^[A-Z][a-zA-Z]{2,}$");

    private static final Predicate<String> lastNameValidator =
            name -> name.matches("^[A-Z][a-zA-Z]{2,}$");

    private static final Predicate<String> emailValidator =
            email -> email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.co(\\.[a-zA-Z]{2})?$");

    private static final Predicate<String> mobileValidator =
            mobile -> mobile.matches("^[0-9]{2} [0-9]{10}$");

    private static final Predicate<String> passwordValidator =
            password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$");

    // Methods that throw custom exception if invalid

    public boolean validateFirstName(String name) throws InvalidUserDetailsException {
        if (!firstNameValidator.test(name))
            throw new InvalidUserDetailsException("Invalid First Name");
        return true;
    }

    public boolean validateLastName(String name) throws InvalidUserDetailsException {
        if (!lastNameValidator.test(name))
            throw new InvalidUserDetailsException("Invalid Last Name");
        return true;
    }

    public boolean validateEmail(String email) throws InvalidUserDetailsException {
        if (!emailValidator.test(email))
            throw new InvalidUserDetailsException("Invalid Email");
        return true;
    }

    public boolean validateMobile(String mobile) throws InvalidUserDetailsException {
        if (!mobileValidator.test(mobile))
            throw new InvalidUserDetailsException("Invalid Mobile Number");
        return true;
    }

    public boolean validatePassword(String password) throws InvalidUserDetailsException {
        if (!passwordValidator.test(password))
            throw new InvalidUserDetailsException("Invalid Password");
        return true;
    }
}