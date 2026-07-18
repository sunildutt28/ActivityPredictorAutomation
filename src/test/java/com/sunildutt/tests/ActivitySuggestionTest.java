package com.sunildutt.tests;

import com.sunildutt.config.Configuration;
import com.sunildutt.pages.HomePage;
import com.sunildutt.reporting.ReportManager;
import com.sunildutt.utils.ScreenshotUtils;
import com.sunildutt.utils.YamlReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActivitySuggestionTest extends BaseTest {

    @Test
    public void testCity() throws InterruptedException {

        Thread.sleep(5000);

        HomePage home = new HomePage(driver);

        System.out.println("Current City : " + home.getCity());

        home.enterCity("Cork");

        System.out.println("Updated City : " + home.getCity());

        Thread.sleep(3000);
    }
    @Test
    public void testYamlReader() {

        Configuration config =
                YamlReader.getConfiguration();

        System.out.println(config.getBrowser().getName());

        System.out.println(config.getApplication().getUrl());

        System.out.println(config.getTimeouts().getExplicit());

    }
    @Test
    public void verifyActivitySuggestion() {

        HomePage home = new HomePage(driver);

        home.enterCity("Dublin");

        String screenshot =
                ScreenshotUtils.capture(driver,
                        "BeforePrediction");

        System.out.println(screenshot);

        home.clickActivitySuggestion();

        String suggestion =
                home.getActivitySuggestion();

        System.out.println(suggestion);

        Assertions.assertTrue(
                suggestion.length() > 5);
        Assertions.assertFalse(suggestion.isBlank());

        ReportManager.pass(
                "Activity suggested: " + suggestion);

    }
}