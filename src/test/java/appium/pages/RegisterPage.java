package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public RegisterPage (AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By firstName = AppiumBy.id("com.android.fitmoveai:id/edt_firstname");
    By lastName = AppiumBy.id("com.android.fitmoveai:id/edt_lastname");
    By emailField = AppiumBy.id("com.android.fitmoveai:id/edt_email_regis");
    By passwordField = AppiumBy.id("com.android.fitmoveai:id/edt_password_regis");
    By registerButton = AppiumBy.id("com.android.fitmoveai:id/btn_regis");
    By maleGender = AppiumBy.id("com.android.fitmoveai:id/male_gender");
    By nextButton = AppiumBy.id("com.android.fitmoveai:id/btn_gender_next");
    By ageField = AppiumBy.id("com.android.fitmoveai:id/edt_age");
    By heightField = AppiumBy.id("com.android.fitmoveai:id/edt_height");
    By weightField = AppiumBy.id("com.android.fitmoveai:id/edt_weight");
    By simpanButton = AppiumBy.id("com.android.fitmoveai:id/btnSimpan");
    By assemenTV = AppiumBy.id("com.android.fitmoveai:id/textView2");

    //method
    public void inputFirstname(String first){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(first);
    }
    public void inputLastname(String last){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(last);
    }
    public void setEmailField(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
    }
    public void setPasswordField(String pass){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(pass);
    }
    public void clickRegister(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton)).click();
    }
    public void clickMale(){
        wait.until(ExpectedConditions.elementToBeClickable(maleGender)).click();
    }
    public void clickNext(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton)).click();
    }
    public void inputAge(String age){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ageField)).sendKeys(age);
    }
    public void inputHeight(String height){
        wait.until(ExpectedConditions.visibilityOfElementLocated(heightField)).sendKeys(height);
    }
    public void inputWeight(String weight){
        wait.until(ExpectedConditions.visibilityOfElementLocated(weightField)).sendKeys(weight);
    }
    public void clickSimpan(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(simpanButton)).click();
    }
    public void assementTVisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(assemenTV)).isDisplayed();
    }
}
