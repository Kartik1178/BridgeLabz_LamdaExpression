/*
 * UC7: Validate Password Rule 3 using Lambda Expression
 * This class provides validation logic for
 * user password according to the rules:
 * 1. Password must contain minimum 8 characters
 * 2. Password must contain at least 1 uppercase letter
 * 3. Password must contain at least 1 numeric digit
 * Valid: Password1, Abcdefg1
 * Invalid: password1 (no uppercase), Password (no digit), pass1 (less length)
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda function to validate password (min 8 chars + 1 uppercase + 1 digit)
    private static final Predicate<String> validatePasswordRule3 =
            password -> password.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$");

    public static void main(String[] args) {
        System.out.println(validatePasswordRule3.test("Password1")); // true
        System.out.println(validatePasswordRule3.test("Abcdefg1"));  // true
        System.out.println(validatePasswordRule3.test("password1")); // false (no uppercase)
        System.out.println(validatePasswordRule3.test("Password"));  // false (no digit)
        System.out.println(validatePasswordRule3.test("pass1"));     // false (length < 8)
    }
}