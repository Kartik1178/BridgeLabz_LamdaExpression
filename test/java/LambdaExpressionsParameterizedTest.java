import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LambdaExpressionsParameterizedTest {

    LambdaExpressions validator = new LambdaExpressions();

    // Happy Test Cases (Valid Emails)
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@bl.co",
            "abc.xyz@bl.co",
            "abc@bl.co.in",
            "abc.xyz@bl.co.in"
    })
    void givenValidEmails_shouldReturnTrue(String email) throws InvalidUserDetailsException {
        Assertions.assertTrue(validator.validateEmail(email));
    }

    // Sad Test Cases (Invalid Emails)
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@.co",
            "abc@bl",
            "@bl.co",
            "abc@bl.",
            "abcbl.co"
    })
    void givenInvalidEmails_shouldThrowException(String email) {
        Assertions.assertThrows(InvalidUserDetailsException.class,
                () -> validator.validateEmail(email));
    }
}