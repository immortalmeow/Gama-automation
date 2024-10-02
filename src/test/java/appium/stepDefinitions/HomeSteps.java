package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.homePage;
import io.cucumber.java.en.Then;

public class HomeSteps extends BaseTest {
    homePage homePage = new homePage(driver);
    @Then("User is on Home page")
    public void user_is_on_home_page(){
        homePage.userTextIsDisplayed();
    }
}
