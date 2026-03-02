/*
 * UC10: Validator Class for User Registration using Lambda Expressions
 * Provides reusable validation methods for:
 * First Name, Last Name, Email, Mobile, and Password
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda to validate first name
    private static final Predicate<String> firstNameValidator =
            name -> name.matches("^[A-Z][a-zA-Z]{2,}$");

    // Lambda to validate last name
    private static final Predicate<String> lastNameValidator =
            name -> name.matches("^[A-Z][a-zA-Z]{2,}$");

    // Lambda to validate email
    private static final Predicate<String> emailValidator =
            email -> email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.co(\\.[a-zA-Z]{2})?$");

    // Lambda to validate mobile number
    private static final Predicate<String> mobileValidator =
            mobile -> mobile.matches("^[0-9]{2} [0-9]{10}$");

    // Lambda to validate password (all UC5–UC8 rules)
    private static final Predicate<String> passwordValidator =
            password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$");

    // Public methods for testing
    public boolean validateFirstName(String name) { return firstNameValidator.test(name); }
    public boolean validateLastName(String name) { return lastNameValidator.test(name); }
    public boolean validateEmail(String email) { return emailValidator.test(email); }
    public boolean validateMobile(String mobile) { return mobileValidator.test(mobile); }
    public boolean validatePassword(String password) { return passwordValidator.test(password); }
}