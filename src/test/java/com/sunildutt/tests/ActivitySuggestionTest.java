package com.sunildutt.tests;

import com.sunildutt.pages.HomePage;
import com.sunildutt.utils.ScreenshotUtils;
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

    }
}