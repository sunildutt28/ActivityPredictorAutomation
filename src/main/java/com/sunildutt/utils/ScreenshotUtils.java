package com.sunildutt.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String capture(WebDriver driver, String testName) {

        try {

            File directory = new File("test-output/screenshots");

            if (!directory.exists()) {
                directory.mkdirs();
            }

            String timestamp =
                    new SimpleDateFormat("yyyyMMdd_HHmmss")
                            .format(new Date());
            String safeTestName =
                    testName.replaceAll("[^a-zA-Z0-9_-]", "_");

            String fileName =
                    safeTestName + "_" + timestamp + ".png";

            File source =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File destination =
                    new File(directory, fileName);

            Files.copy(
                    source.toPath(),
                    destination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

            return destination.getAbsolutePath();

        }
        catch (IOException e) {

            throw new RuntimeException("Unable to capture screenshot", e);

        }

    }

}