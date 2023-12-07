package constants;

public class Inputs {
    public interface Cart {
        String NAME_FIELD_INPUT = "Charles Leclerc",
                COUNTRY_FIELD_INPUT = "Charles Leclerc",
                CITY_FIELD_INPUT = "Monaco",
                CREDIT_CART_FIELD_INPUT = "374245455400126",
                MONTH_FIELD_INPUT = "8",
                YEAR_FIELD_INPUT = "2027",
                INVALID_EMPTY_INPUT = "''";
    }

    public interface LogIn {
        String HEADER_TEXT = "Log in",
                USERNAME_TITLE_FIELD_TEXT = "Username:",
                PASSWORD_TITLE_FIELD_TEXT = "Password:",
                VALID_USERNAME = "qwerty1!",
                VALID_PASSWORD = "qwerty1!",
                WEAK_USERNAME = "Username333",
                WEAK_PASSWORD = "Username333",
                SHORT_PASSWORD_WITHOUT_SPECIAL_CHARACTERS = "qwerty1",
                SHORT_PASSWORD_WITHOUT_NUMBER = "qwerty!",
                PASSWORD_VALUE_WITHOUT_SPECIAL_CHARACTERS = "qwerty11",
                PASSWORD_VALUE_WITHOUT_NUMBER = "qwerty!!",
                NUMBERS_PASSWORD = "12345678",
                NUMBERS_PASSWORD_WITHOUT_SPECIAL_CHARACTERS = "12345678a",
                NUMBERS_PASSWORD_WITHOUT_LETTER = "1234567!",
                AUTHORIZED_USER = "Welcome " + VALID_USERNAME;

    public interface Contact {
        String EMAIL_VALID_INPUT = "test@gmail.com",
               INVALID_INPUT_DATA = "###",
               USERNAME_FIELD_INPUT = "tester",
               MESSAGE_FIELD_INPUT = "Hello, I'd like to return an item";
    }
}
