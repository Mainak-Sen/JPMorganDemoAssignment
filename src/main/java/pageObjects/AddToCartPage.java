package pageObjects;

import generic.cucumber.java.selenium.base.Locators;
import generic.cucumber.java.selenium.base.SeleniumBase;

public class AddToCartPage extends SeleniumBase {

    private String addToCartXpath = "//a[text() = 'Add to cart']";
    private String addToCartProductNameXpath = "//h2[@class='name']";

    public HomePage click_add_to_cart() {
        click(findElementBy(Locators.valueOf("XPATH"), addToCartXpath));
        return new HomePage();
    }

    public boolean is_add_to_cart_visible() {
        return findElementBy(Locators.valueOf("XPATH"), addToCartProductNameXpath).isDisplayed();
    }

    public boolean is_desired_item_name_visible(String itemName) {
        return findElementBy(Locators.valueOf("XPATH"), addToCartProductNameXpath).getText().equalsIgnoreCase(itemName);
    }

}
