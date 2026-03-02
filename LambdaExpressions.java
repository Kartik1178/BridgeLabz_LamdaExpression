/*
 * UC9: Validate Multiple Email Samples using Lambda Expression
 * This class validates multiple email inputs
 * according to the required email pattern rules.
 * Valid emails: abc@bl.co, abc.xyz@bl.co.in
 * Invalid emails: abc@.co, abc@bl, @bl.co
 */

import java.util.function.Predicate;

public class LambdaExpressions {

    // Lambda function to validate email format
    private static final Predicate<String> validateEmail =
            email -> email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.co(\\.[a-zA-Z]{2})?$");

    public static void main(String[] args) {

        String[] validEmails = {
                "abc@bl.co",
                "abc.xyz@bl.co",
                "abc@bl.co.in",
                "abc.xyz@bl.co.in"
        };

        String[] invalidEmails = {
                "abc@.co",
                "abc@bl",
                "@bl.co",
                "abc@bl.",
                "abcbl.co"
        };

        System.out.println("Valid Email Tests:");
        for (String email : validEmails) {
            System.out.println(email + " -> " + validateEmail.test(email));
        }

        System.out.println("\nInvalid Email Tests:");
        for (String email : invalidEmails) {
            System.out.println(email + " -> " + validateEmail.test(email));
        }
    }
}