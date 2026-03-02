import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaExpressionsTest {

    private LambdaExpressions validator;

    @BeforeEach
    void setUp() {
        validator = new LambdaExpressions();
    }

    // First Name Tests
    @Test
    void givenValidFirstName_shouldReturnTrue() {
        Assertions.assertTrue(validator.validateFirstName("John"));
    }

    @Test
    void givenInvalidFirstName_shouldReturnFalse() {
        Assertions.assertFalse(validator.validateFirstName("jo"));
    }

    // Last Name Tests
    @Test
    void givenValidLastName_shouldReturnTrue() {
        Assertions.assertTrue(validator.validateLastName("Kumar"));
    }

    @Test
    void givenInvalidLastName_shouldReturnFalse() {
        Assertions.assertFalse(validator.validateLastName("ku"));
    }

    // Email Tests
    @Test
    void givenValidEmail_shouldReturnTrue() {
        Assertions.assertTrue(validator.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    void givenInvalidEmail_shouldReturnFalse() {
        Assertions.assertFalse(validator.validateEmail("abc@.co"));
    }

    // Mobile Tests
    @Test
    void givenValidMobile_shouldReturnTrue() {
        Assertions.assertTrue(validator.validateMobile("91 9919819801"));
    }

    @Test
    void givenInvalidMobile_shouldReturnFalse() {
        Assertions.assertFalse(validator.validateMobile("919919819801"));
    }

    // Password Tests
    @Test
    void givenValidPassword_shouldReturnTrue() {
        Assertions.assertTrue(validator.validatePassword("Password1@"));
    }

    @Test
    void givenInvalidPassword_shouldReturnFalse() {
        Assertions.assertFalse(validator.validatePassword("password"));
    }
}