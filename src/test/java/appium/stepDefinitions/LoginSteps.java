package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest {
    loginPage loginPage = new loginPage(driver);

    @Given("User is on Login page")
    public void user_is_on_login_page(){
        loginPage.validateOnPage();
    }

    @Then("User input email with {string}")
    public void user_input_email_with(String email){
        loginPage.inputEmail(email);
    }

    @Then("User input password with {string}")
    public void user_input_password_with(String pass){
        loginPage.inputPassword(pass);
    }
    @When("User click login button")
    public void user_click_login_button(){
        loginPage.clickLoginButton();
    }
}
