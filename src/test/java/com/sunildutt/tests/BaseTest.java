package com.sunildutt.tests;

import com.sunildutt.base.DriverFactory;
import com.sunildutt.base.DriverManager;
import com.sunildutt.config.ConfigReader;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.sunildutt.utils.ScreenshotExtension;
//import org.junit.jupiter.api.extension.ExtendWith;
import com.sunildutt.reporting.ReportManager;




public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {

        ConfigReader config = new ConfigReader();

        ReportManager.startTest(getClass().getSimpleName());

        driver = DriverFactory.getDriver(config.getBrowser());

        ReportManager.info("Browser launched: " + config.getBrowser());

        driver.manage().window().maximize();

        ReportManager.info("Browser maximized");

        driver.get(config.getBaseUrl());

        ReportManager.info("Navigated to: " + config.getBaseUrl());


    }

    @AfterEach
    public void tearDown() {
        ReportManager.flush();
        DriverManager.quitDriver();

    }
}