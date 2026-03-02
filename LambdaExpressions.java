/*
 * UC5: Validate Password Rule 1 using Lambda Expression
 * This class provides validation logic for
 * user password according to the rule:
 * 1. Password must contain minimum 8 characters
 * Valid: password, abcdefgh
 * Invalid: pass, abc12
 */

import java.util.function.Predicate;

public class LambdaExpressions {
    // Lambda function to validate password minimum 8 characters
    private static final Predicate<String> validatePasswordRule1 =
            password -> password.matches("^.{8,}$");
    public static void main(String[] args) {
        System.out.println(validatePasswordRule1.test("password")); // true
        System.out.println(validatePasswordRule1.test("abc12345")); // true
        System.out.println(validatePasswordRule1.test("pass"));     // false
        System.out.println(validatePasswordRule1.test("abc12"));    // false
    }
}