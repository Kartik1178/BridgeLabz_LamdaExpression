/*
 * UC4: Validate Mobile Number using Lambda Expression
 * This class provides validation logic for
 * user mobile number according to the rule:
 * 1. Format should be: CountryCode space 10-digit-number
 * 2. Example: 91 9919819801
 * 3. Country code must be 2 digits
 * 4. Mobile number must be exactly 10 digits
 * Valid: 91 9919819801
 * Invalid: 919919819801, 91-9919819801, 91 99198
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda function to validate mobile number using regex
    private static final Predicate<String> validateMobile =
            mobile -> mobile.matches("^[0-9]{2} [0-9]{10}$");

    public static void main(String[] args) {
        System.out.println(validateMobile.test("91 9919819801")); // true
        System.out.println(validateMobile.test("91 9876543210")); // true
        System.out.println(validateMobile.test("919919819801"));  // false
        System.out.println(validateMobile.test("91-9919819801")); // false
        System.out.println(validateMobile.test("91 99198"));      // false
    }
}