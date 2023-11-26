package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.cucumber.java.selenium.base.SeleniumBase;
import org.testng.Assert;
import pageObjects.AddToCartPage;
import pageObjects.HomePage;

public class Steps extends SeleniumBase {

    /*private static CarsPage cp;*/
    private static AddToCartPage addToCartPage;
    private static HomePage homePage;
    /*private static PickUpDatePage pup;
    private static Start_Point_Page spp;*/

    @Given("User is on the URL: {string}")
    public void user_is_on_the_URL(String URL) {
        Assert.assertTrue(verifyUrl(URL));
    }

    @When("User clicks on category {string}")
    public void user_clicks_on_category(String categoryToBeClicked) throws InterruptedException {
        homePage = new HomePage();
        homePage.click_category(categoryToBeClicked);
    }

    @When("User clicks on phone name {string}")
    public void user_clicks_on_phone_name(String phoneNameToBeClicked) throws InterruptedException {
        homePage = new HomePage();
        homePage.click_phone_name(phoneNameToBeClicked);
    }

   /* @Then("User lands on {string} page")
    public void user_lands_on_page(String pageName) {
        if (pageName.equalsIgnoreCase("STARTING POINT")) {
            Assert.assertTrue(spp.is_StartingPoint_diplayed());
        } else if (pageName.equalsIgnoreCase("PICKUP TIME")) {
            Assert.assertTrue(pup.is_PickupPointdiplayed());
        } else if (pageName.equalsIgnoreCase("DROP OFF TIME")) {
            Assert.assertTrue(dop.is_DropOffTime_diplayed());
        }

    }

    @When("User selects {string} as {string}")
    public void user_selects_as(String select, String choice) {

        if (select.equalsIgnoreCase("pickup point")) {
            spp = spp.select_pick_up_point(choice);
        } else if (select.equalsIgnoreCase("Start Date")) {
            if (choice.equalsIgnoreCase("tomorrow")) {
                pup = pup.select_tomorrow();
            }
        } else if (select.equalsIgnoreCase("End Date")) {
            if (choice.equalsIgnoreCase("the last displayed one")) {
                dop = dop.click_last_day();
            }
        }

    }

    @Then("User gets to see list of available cars and count them.")
    public void user_gets_to_see_list_of_available_cars_and_count_them() throws InterruptedException {
        cp.find_carCount();
    }

    @Then("User finds the name of the car with {string} price.")
    public void user_finds_the_name_of_the_car_with_price(String level) throws InterruptedException {
        if (level.equalsIgnoreCase("Highest")) {
            cp.get_max();
        }
    }*/
}
