package appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseTest {
    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public static void setup() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "14.0");
        capabilities.setCapability("appium:deviceName", "RRCW40292QF");
        capabilities.setCapability("appium:app", "D:/FitMoveAI/app/build/outputs/apk/debug/app-debug.apk");
        capabilities.setCapability("appium:automationName", "UIAutomator2");
        capabilities.setCapability("appium:appPackage", "com.android.fitmoveai");
        capabilities.setCapability("appium:appActivity", "com.android.fitmoveai.ui.MainActivity");

        driver = new AndroidDriver(capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static void closeSession() {
        driver.quit();
    }

    public static void resetApp() {
        driver.terminateApp("com.android.fitmoveai");
        driver.activateApp("com.android.fitmoveai");
    }

    public static void removeApp() {
        driver.removeApp("com.android.fitmoveai");
        driver.installApp("D:/FitMoveAI/app/build/outputs/apk/debug/app-debug.apk");
    }
}