package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public loginPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By emailET = AppiumBy.id("com.android.fitmoveai:id/edt_email_log");
    By passwordET = AppiumBy.id("com.android.fitmoveai:id/edt_password_log");
    By loginButton = AppiumBy.id("com.android.fitmoveai:id/btn_login");
    By registerButton = AppiumBy.id("com.android.fitmoveai:id/tv_havent_account");

    //method
    public void inputEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailET)).sendKeys(email);
    }
    public void inputPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordET)).sendKeys(password);
    }
    public void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }
    public void clickRegisterButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton)).click();
    }
    public void validateOnPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(emailET));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordET));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }
}
