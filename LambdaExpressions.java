/*
 * UC2: Validate Last Name using Lambda Expression
 * This class provides validation logic for
 * user last name according to the rule:
 * 1. Last name should start with a capital letter.
 * 2. It should have a minimum of 3 characters.
 * Example of valid names: "Kumar", "Sharma", "Reddy"
 * Example of invalid names: "ku", "sh", "reddy"
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda function to validate last name using regex
    private static final Predicate<String> validateLastName =
            lastName -> lastName.matches("^[A-Z][a-zA-Z]{2,}$");

    public static void main(String[] args) {
        System.out.println(validateLastName.test("Kumar"));  // true
        System.out.println(validateLastName.test("ku"));     // false
        System.out.println(validateLastName.test("Sharma")); // true
        System.out.println(validateLastName.test("reddy"));  // false
    }
}