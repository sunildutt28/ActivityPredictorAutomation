package com.sunildutt.base;

import com.sunildutt.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);

    }

    protected WebElement find(By locator) {

        return waitUtils.waitForVisibility(locator);

    }

    public void click(By locator) {
        WebElement element = waitUtils.waitForClickable((locator));
        element.click();
    }

    protected void type(By locator, String text) {

        WebElement element = waitUtils.waitForVisibility(locator);

        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(text);

    }

    protected String getText(By locator) {

        return waitUtils.waitForVisibility(locator).getText();

    }

    protected String getValue(By locator) {

        return waitUtils.waitForVisibility(locator)
                .getAttribute("value");

    }

    protected boolean isDisplayed(By locator) {

        return waitUtils.waitForVisibility(locator)
                .isDisplayed();

    }

}