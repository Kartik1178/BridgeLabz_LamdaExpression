/*
 * UC13: Final Refactor using Lambda Functional Interface
 * All validations are implemented using lambda expressions
 * and custom functional interface UserValidator.
 */

public class LambdaExpressions {
    // Lambda implementations for each validation rule

    private final UserValidator firstNameValidator = input -> {
        if (!input.matches("^[A-Z][a-zA-Z]{2,}$"))
            throw new InvalidUserDetailsException("Invalid First Name");
        return true;
    };

    private final UserValidator lastNameValidator = input -> {
        if (!input.matches("^[A-Z][a-zA-Z]{2,}$"))
            throw new InvalidUserDetailsException("Invalid Last Name");
        return true;
    };
    private final UserValidator emailValidator = input -> {
        if (!input.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.co(\\.[a-zA-Z]{2})?$"))
            throw new InvalidUserDetailsException("Invalid Email");
        return true;
    };

    private final UserValidator mobileValidator = input -> {
        if (!input.matches("^[0-9]{2} [0-9]{10}$"))
            throw new InvalidUserDetailsException("Invalid Mobile Number");
        return true;
    };

    private final UserValidator passwordValidator = input -> {
        if (!input.matches("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$"))
            throw new InvalidUserDetailsException("Invalid Password");
        return true;
    };
    // Public wrapper methods

    public boolean validateFirstName(String firstName) throws InvalidUserDetailsException {
        return firstNameValidator.validate(firstName);
    }

    public boolean validateLastName(String lastName) throws InvalidUserDetailsException {
        return lastNameValidator.validate(lastName);
    }

    public boolean validateEmail(String email) throws InvalidUserDetailsException {
        return emailValidator.validate(email);
    }
    public boolean validateMobile(String mobile) throws InvalidUserDetailsException {
        return mobileValidator.validate(mobile);
    }
    public boolean validatePassword(String password) throws InvalidUserDetailsException {
        return passwordValidator.validate(password);
    }
}