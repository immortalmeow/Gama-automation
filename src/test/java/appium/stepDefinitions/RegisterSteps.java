package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.RegisterPage;
import appium.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseTest {
    RegisterPage registerPage = new RegisterPage(driver);

    @Given("User is on Register page")
    public void user_is_on_register_page(){
        loginPage lp = new loginPage(driver);
        lp.clickRegisterButton();
        registerPage.validateonPage();
    }
    @And("user input firstname with {string}")
    public void user_input_firstname_with(String first){
        registerPage.inputFirstname(first);
    }
    @And("user input lastname with {string}")
    public void user_input_lastname_with(String last){
        registerPage.inputLastname(last);
    }
    @And("user input email with {string}")
    public void user_input_email_with(String email){
        registerPage.setEmailField(email);
    }
    @And("user input password with {string}")
    public void user_input_password_with(String pass){
        registerPage.setPasswordField(pass);
    }
    @And("user click register button")
    public void user_click_register_button(){
        registerPage.clickRegister();
    }
    @And("user select their gender")
    public void user_select_their_gender(){
        registerPage.clickMale();
    }
    @And("user click next button")
    public void user_click_next_button(){
        registerPage.clickNext();
    }
    @And("user input age field with {string}")
    public void user_input_age_field_with(String age){
        registerPage.inputAge(age);
    }
    @And("user input height field with {string}")
    public void user_input_height_field_with(String height){
        registerPage.inputHeight(height);
    }
    @And("user input weight field with {string}")
    public void user_input_weight_field_with(String weight){
        registerPage.inputWeight(weight);
    }
    @When("User click simpan button")
    public void user_click_simpan_button(){
        registerPage.clickSimpan();
    }
    @Then("User successfully registered")
    public void user_successfully_registered(){
        registerPage.assementTVisDisplayed();
    }
}
