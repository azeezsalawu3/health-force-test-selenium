package com.healthforce.HandlerClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    public static JavascriptExecutor javascriptExecutor;
    private Logger log = Logger.getLogger(BaseClass.class.getName());

    public void initializeDriver(){

        try {
            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");

            ChromeOptions cOptions = new ChromeOptions();
            DesiredCapabilities cap = DesiredCapabilities.chrome();

            driver = new ChromeDriver(cOptions);
            driver.manage().window().maximize();
            LoggingPreferences logPrefs = new LoggingPreferences();
            logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
            cap.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);


            webDriverWait = new WebDriverWait(driver, 30);
            javascriptExecutor =  (JavascriptExecutor) driver;

        }
        catch (Exception e){
            log.info(e.getMessage());
        }
    }

    public String getStringByIndex(String value){
        int startCharIndex = value.indexOf("R");

        String actualPrice = value.substring(startCharIndex);

        return actualPrice;
    }
}
