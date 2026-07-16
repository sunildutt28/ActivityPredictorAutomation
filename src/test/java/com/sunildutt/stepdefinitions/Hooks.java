package com.sunildutt.stepdefinitions;

import com.sunildutt.base.DriverFactory;
import com.sunildutt.base.DriverManager;
import com.sunildutt.config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {

        ConfigReader config = new ConfigReader();

        DriverFactory.getDriver(config.getBrowser());

        DriverManager.getDriver().manage().window().maximize();

        DriverManager.getDriver().get(config.getBaseUrl());
    }

    @After
    public void tearDown() {

        DriverManager.quitDriver();

    }
}