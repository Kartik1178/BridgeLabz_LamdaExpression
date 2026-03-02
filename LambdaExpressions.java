/*
 * UC6: Validate Password Rule 2 using Lambda Expression
 * This class provides validation logic for
 * user password according to the rules:
 * 1. Password must contain minimum 8 characters
 * 2. Password must contain at least 1 uppercase letter
 * Valid: Password1, Abcdefgh
 * Invalid: password, abcdefgh, pass
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda function to validate password (min 8 chars + at least 1 uppercase)
    private static final Predicate<String> validatePasswordRule2 =
            password -> password.matches("^(?=.*[A-Z]).{8,}$");
    public static void main(String[] args) {
        System.out.println(validatePasswordRule2.test("Password"));  // true
        System.out.println(validatePasswordRule2.test("Abcdefgh"));  // true
        System.out.println(validatePasswordRule2.test("password"));  // false (no uppercase)
        System.out.println(validatePasswordRule2.test("pass"));      // false (less than 8)
    }
}