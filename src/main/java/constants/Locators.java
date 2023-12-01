package constants;

public class Locators {
    public interface Item{
        String FIRST_PRODUCT_XPATH = "//*[@class='card-title']//*[@href='prod.html?idp_=1']",
        ADD_TO_CART_BUTTON_XPATH = "//*[contains(text(), 'Add to cart')]";
    }
}
