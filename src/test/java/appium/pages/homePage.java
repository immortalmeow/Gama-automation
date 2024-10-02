package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public homePage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By userText = AppiumBy.id("com.android.fitmoveai:id/tv_username_welcome");


    //Method
    public void userTextIsDisplayed(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(userText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userText)).isDisplayed();
    }
}
