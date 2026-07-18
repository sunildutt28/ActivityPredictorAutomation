package com.sunildutt.stepdefinitions;

import com.sunildutt.base.DriverFactory;
import com.sunildutt.base.DriverManager;
import com.sunildutt.config.ConfigReader;
import com.sunildutt.reporting.ReportManager;
import com.sunildutt.utils.ScreenshotUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {

        ConfigReader config = new ConfigReader();

        // Start Extent Report for this scenario
        ReportManager.startTest(scenario.getName());

        DriverFactory.getDriver(config.getBrowser());

        ReportManager.info("Browser launched: " + config.getBrowser());

        DriverManager.getDriver().manage().window().maximize();

        ReportManager.info("Browser maximized");

        DriverManager.getDriver().get(config.getBaseUrl());

        ReportManager.info("Navigated to: " + config.getBaseUrl());
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            String screenshot =
                    ScreenshotUtils.capture(
                            DriverManager.getDriver(),
                            scenario.getName());

            ReportManager.fail("Scenario Failed");

            ReportManager.attachScreenshot(screenshot);

        } else {

            ReportManager.pass("Scenario Passed");

        }

        ReportManager.flush();

        DriverManager.quitDriver();

    }
}