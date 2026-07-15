package com.sunildutt.base;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;

    // Private constructor prevents object creation
    private DriverManager() {
    }

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}