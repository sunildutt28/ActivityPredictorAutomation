package com.sunildutt.pages;

import com.sunildutt.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By cityInput =
            By.cssSelector("input[aria-label='City Name']");
    private final By activitySuggestion =
            By.tagName("h1");
    private final By activitySuggestionButton =
            By.cssSelector("button[data-testid='stBaseButton-primary']");

    public HomePage(WebDriver driver) {
        super(driver);
    }



    public void enterCity(String city) {
        type(cityInput, city);
    }

    public String getCity() {
        return getValue(cityInput);
    }
    public void clickActivitySuggestion() {

        click(activitySuggestionButton);

    }
    public String getActivitySuggestion() {

        return getText(activitySuggestion);

    }
}