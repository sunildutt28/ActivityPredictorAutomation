package com.sunildutt.stepdefinitions;

import com.sunildutt.base.DriverManager;
import com.sunildutt.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;

public class ActivitySuggestionSteps {

    private HomePage homePage;

    @Given("the Activity Predictor application is open")
    public void openApplication() {

        homePage = new HomePage(DriverManager.getDriver());

    }

    @When("I enter {string} as the city")
    public void enterCity(String city) {

        homePage.enterCity(city);

    }

    @When("I click the Get Activity Suggestion button")
    public void clickButton() {

        homePage.clickActivitySuggestion();

    }

    @Then("an activity suggestion should be displayed")
    public void verifySuggestion() {

        String suggestion = homePage.getActivitySuggestion();

        System.out.println("Activity: " + suggestion);

        Assertions.assertFalse(suggestion.isBlank());

    }

    @Then("the text {string} should be displayed")
    public void the_text_should_be_displayed(String expectedMessage) {
        String expectedText = "Failed to fetch weather data";
        String actualMessage = homePage.getErrorMessage();

        Assertions.assertEquals(expectedText, actualMessage.trim());
    }
   
}