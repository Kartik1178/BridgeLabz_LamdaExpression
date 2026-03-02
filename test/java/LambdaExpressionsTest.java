import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaExpressionsTest {

    private LambdaExpressions validator;

    @BeforeEach
    void setUp() {
        validator = new LambdaExpressions();
    }

    // Happy Test Case
    @Test
    void givenValidFirstName_shouldReturnTrue() throws InvalidUserDetailsException {
        Assertions.assertTrue(validator.validateFirstName("John"));
    }

    // Sad Test Case
    @Test
    void givenInvalidFirstName_shouldThrowException() {
        Assertions.assertThrows(InvalidUserDetailsException.class,
                () -> validator.validateFirstName("jo"));
    }

    @Test
    void givenInvalidLastName_shouldThrowException() {
        Assertions.assertThrows(InvalidUserDetailsException.class,
                () -> validator.validateLastName("ku"));
    }

    @Test
    void givenInvalidEmail_shouldThrowException() {
        Assertions.assertThrows(InvalidUserDetailsException.class,
                () -> validator.validateEmail("abc@.co"));
    }

    @Test
    void givenInvalidMobile_shouldThrowException() {
        Assertions.assertThrows(InvalidUserDetailsException.class,
                () -> validator.validateMobile("919919819801"));
    }

    @Test
    void givenInvalidPassword_shouldThrowException() {
        Assertions.assertThrows(InvalidUserDetailsException.class,
                () -> validator.validatePassword("password"));
    }
}