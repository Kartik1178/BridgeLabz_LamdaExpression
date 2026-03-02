/*
 * UC8: Validate Password Rule 4 using Lambda Expression
 * This class provides validation logic for
 * user password according to the rules:
 * 1. Minimum 8 characters
 * 2. At least 1 uppercase letter
 * 3. At least 1 numeric digit
 * 4. Exactly 1 special character
 * Valid: Password1@
 * Invalid: Password@@1 (2 special chars), password1@ (no uppercase)
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda function to validate password with all rules including exactly 1 special character
    private static final Predicate<String> validatePasswordRule4 =
            password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$");

    public static void main(String[] args) {
        System.out.println(validatePasswordRule4.test("Password1@"));  // true
        System.out.println(validatePasswordRule4.test("Abcdefg1#"));   // true
        System.out.println(validatePasswordRule4.test("Password@@1")); // false (2 special chars)
        System.out.println(validatePasswordRule4.test("password1@"));  // false (no uppercase)
        System.out.println(validatePasswordRule4.test("Pass1"));       // false (length < 8)
    }
}