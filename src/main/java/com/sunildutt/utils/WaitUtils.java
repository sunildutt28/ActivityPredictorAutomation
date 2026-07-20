package com.sunildutt.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private final WebDriverWait wait;

    public WaitUtils(WebDriver driver) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }

    public WebElement waitForVisibility(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public WebElement waitForClickable(By locator) {

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));

    }

    public boolean waitForText(By locator, String text) {

        return wait.until(
                ExpectedConditions.textToBePresentInElementLocated(locator, text));

    }

    public String waitForTextToChange(By locator, String oldText) {

        return wait.until(driver -> {

            String newText = driver.findElement(locator).getText().trim();

            return !newText.equals(oldText) ? newText : null;

        });
    }

}