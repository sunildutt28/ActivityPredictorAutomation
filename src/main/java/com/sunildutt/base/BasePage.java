package com.sunildutt.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    protected WebElement find(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected String getText(By locator) {
        return find(locator).getText();
    }
    protected void click(By locator) {
        find(locator).click();
    }

    protected void type(By locator, String text) {

        WebElement element = find(locator);

        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(text);
        element.sendKeys(Keys.TAB);
    }

    protected String getValue(By locator) {
        return find(locator).getAttribute("value");
    }

    protected boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }
}