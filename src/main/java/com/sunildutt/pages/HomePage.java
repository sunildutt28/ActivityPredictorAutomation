package com.sunildutt.pages;

import com.sunildutt.base.BasePage;
import com.sunildutt.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.sunildutt.reporting.ReportManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private final By cityInput =
            By.cssSelector("input[aria-label='City Name']");
    private final By activitySuggestion =
            By.xpath("(//h1)[last()]");
    private final By activitySuggestionButton =
            By.cssSelector("button[data-testid='stBaseButton-primary']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By errorMessage =
            By.xpath("//p[contains(text(),'Failed to fetch weather data')]");

    public void enterCity(String city) {

        ReportManager.info("Entering city: " + city);

        type(cityInput, city);
    }

    public String getCity() {

        return getValue(cityInput);
    }
    public void clickActivitySuggestion() {
        ReportManager.info("Clicking Activity Suggestion button");

        click(activitySuggestionButton);

    }
    public String getActivitySuggestion() {

        WaitUtils waitUtils = new WaitUtils(driver);

        String oldText = getText(activitySuggestion);

        return waitUtils.waitForTextToChange(activitySuggestion, oldText);
    }
    public String getErrorMessage() {

        return waitUtils.waitForVisibility(errorMessage)
                .getText()
                .trim();
    }
}