/*
 * UC3: Validate Email using Lambda Expression
 * This class provides validation logic for
 * user email according to the rule:
 * 1. Email format like abc.xyz@bl.co.in
 * 2. Mandatory parts: abc, bl, co
 * 3. Optional parts: xyz and in
 * 4. Must contain proper '@' and '.' positions
 * Valid: abc@bl.co, abc.xyz@bl.co.in
 * Invalid: abc@.co, abc@bl, @bl.co
 */
import java.util.function.Predicate;
public class LambdaExpressions {
    // Lambda function to validate email using regex
    private static final Predicate<String> validateEmail =
            email -> email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.co(\\.[a-zA-Z]{2})?$");
    public static void main(String[] args) {
        System.out.println(validateEmail.test("abc@bl.co"));          // true
        System.out.println(validateEmail.test("abc.xyz@bl.co.in"));   // true
        System.out.println(validateEmail.test("abc@.co"));            // false
        System.out.println(validateEmail.test("abc@bl"));             // false
        System.out.println(validateEmail.test("@bl.co"));             // false
    }
}