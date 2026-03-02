/*
 * UC1: Validate First Name using Lambda Expression
 * This class provides validation logic for
 * user first name according to the rule:
 * 1. First name should start with a capital letter.
 * 2. It should have a minimum of 3 characters.
 * Example of valid names: "John", "Amit", "Ravi"
 * Example of invalid names: "jo", "aBC", "ra"
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda function to validate first name using regex
    private static final Predicate<String> validateFirstName =
            firstName -> firstName.matches("^[A-Z][a-zA-Z]{2,}$");

    public static void main(String[] args) {
        System.out.println(validateFirstName.test("John")); // true
        System.out.println(validateFirstName.test("jo"));   // false
        System.out.println(validateFirstName.test("Amit")); // true
        System.out.println(validateFirstName.test("ravi")); // false
    }
}