package stepDefinition;

import generic.cucumber.java.selenium.base.SeleniumBase;
import org.openqa.selenium.OutputType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;

public class Hooks extends SeleniumBase {

    @Before
    public void BeforeScenario() {
        //enter url
        String appUrl = System.getProperty("applicationUrl");
        String browser = System.getProperty("browser");
        if (browser != null) {
            startApp(browser, appUrl);
        } else {
            startApp(appUrl);
        }
    }

    @After
    public void AfterScenario() {
        quit();
    }

    @AfterStep
    public void TakeScreesnhot(Scenario sc) {
        byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
        sc.embed(screenshot, "image/png");
    }
}
