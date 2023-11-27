package pageObjects;

import generic.cucumber.java.selenium.base.Locators;
import generic.cucumber.java.selenium.base.SeleniumBase;

public class HomePage extends SeleniumBase {

    private String getCategoryXpath(String category) {
        return "//a[text() =" + " " + "'" + category + "'" + "]";
    }

    private String getPhoneNameXpath(String phoneName) {
        return "//a[text() =" + " " + "'" + phoneName + "'" + "]";
    }

    public HomePage click_category(String category) {
        click(findElementBy(Locators.valueOf("XPATH"), getCategoryXpath(category)));
        return new HomePage();
    }

    public AddToCartPage click_phone_name(String name) {
        click(findElementBy(Locators.valueOf("XPATH"), getPhoneNameXpath(name)));
        return new AddToCartPage();
    }

}
