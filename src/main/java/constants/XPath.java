package constants;

public class XPath {
    public interface Common {
         String GENERAL_HOME_BUTTON = "//*[@id='nava']",
                HOME_BUTTON = "//*[@class='nav-link' and @href='index.html']",
                CONTACT_BUTTON = "//*[@data-target='#exampleModal']",
                ABOUT_US_BUTTON = "//*[@data-target='#videoModal']",
                CART_BUTTON = "//*[@id='cartur']",
                LOGIN_BUTTON = "//*[@data-target='#logInModal']",
                SIGNUP_BUTTON = "//*[@data-target='#signInModal']";
    }

    public interface HomePage{
         String CAROUSEL_PREVIOUS_ITEM_BUTTON="//span[contains(text(),'Previous')]",
                CAROUSEL_NEXT_ITEM_BUTTON="//span[contains(text(),'Next')]",
                CATEGORIES_A="//a[@id=\"cat\"]",
                CATEGORIES_PHONES="//a[contains(text(), 'Phones')]",
                CATEGORIES_LAPTOPS="//a[contains(text(), 'Laptops')]",
                CATEGORIES_MONITORS="//a[contains(text(), 'Monitors')]",
                PREVIOUS_PAGE_BUTTON="//button[contains(text(),'Previous')]",
                NEXT_PAGE_BUTTON="//button[contains(text(),'Next')]",
                ALL_PRODUCT_CARDS_IMAGES_A="//img[contains(@class, 'card-img-top') and contains(@class, 'img-fluid')]/..",
                ALL_PRODUCT_CARDS_A="//a[contains(@class, 'hrefch')]";
    }

    public interface ContactPage {
         String EMAIL_FIELD = "//input[@id='recipient-email']",
                NAME_FIELD = "//input[@id='recipient-name']",
                MASSAGE_FIELD = "//input[@id='message-text']",
                SEND_BUTTON = "//button[contains(text(),'Send massage`)]",
                CLOSE_BUTTON = "//*[@id='exampleModal']//button[contains(text(), 'Close')]";
    }

    public interface CartPage {
         String DELETE_BUTTON = "//*[contains(text(), 'Delete')]",
                PLACE_ORDER_BUTTON = "//*[@data-target='#orderModal']",

                NAME_FIELD = "//*[@id='name']",
                COUNTRY_FIELD = "//*[@id='country']",
                CITY_FIELD = "//*[@id='city']",
                CREDIT_CARD_FIELD = "//*[@id='card']",
                MONTH_FIELD = "//*[@id='month']",
                YEAR_FIELD = "//*[@id='year']",

                CANCEL_BUTTON = "//*[@id='orderModal']//button[contains(text(), 'Close')]",
                PURCHASE_BUTTON = "//*[@id='orderModal']//button[contains(text(), 'Purchase')]",
                EXIT_BUTTON = "//*[@id='orderModal']//*[@aria-label='Close']";

    }

    public interface LogInPage {
         String HEADER = "//*[@id='logInModalLabel']",
                USERNAME_TITLE_FIELD = "//label[@for='log-name' and contains(@class, 'form-control-label')]",
                USERNAME_FIELD = "//*[@id='loginusername']",
                PASSWORD_TITLE_FIELD = "//label[@for='log-pass' and contains(@class, 'form-control-label')]",
                PASSWORD_FIELD = "//*[@id='loginpassword']",
                CLOSE_BUTTON = "//*[@id='logInModal']",
                CLOSE_ICON = "//*[@id='logInModal']",
                LOGIN_BUTTON = "//button[text()='Log in']";


    }

    public interface SignUpPage{
         String HEADER = "//h5[@class='modal-title' and @id='signInModalLabel']",
                EMAIL_FIELD = "//input[@id='sign-username']",
                PASSWORD_FIELD = "//input[@id='sign-password']",
                SIGNUP_BUTTON ="//button[contains(text(),'Sign up')]",
                CLOSE_BUTTON="//*[@id='signInModal']//button[contains(text(),'Close')]";

    }
}
