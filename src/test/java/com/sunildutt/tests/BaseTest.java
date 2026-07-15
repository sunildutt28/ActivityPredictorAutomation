package com.sunildutt.tests;

import com.sunildutt.base.DriverFactory;
import com.sunildutt.base.DriverManager;
import com.sunildutt.config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {

        ConfigReader config = new ConfigReader();

        driver = DriverFactory.getDriver(config.getBrowser());

        driver.manage().window().maximize();

        driver.get(config.getBaseUrl());
    }

    @AfterEach
    public void tearDown() {

        DriverManager.quitDriver();

    }
}