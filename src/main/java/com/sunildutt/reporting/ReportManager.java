package com.sunildutt.reporting;

import com.aventstack.extentreports.ExtentTest;

public class ReportManager {

    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    private ReportManager() {
    }

    public static void startTest(String testName) {

        ExtentTest extentTest =
                ExtentManager.getInstance().createTest(testName);

        test.set(extentTest);
    }

    public static ExtentTest getTest() {
        return test.get();
    }

    public static void info(String message) {
        getTest().info(message);
    }

    public static void pass(String message) {
        getTest().pass(message);
    }

    public static void fail(String message) {
        getTest().fail(message);
    }

    public static void attachScreenshot(String path) {

        try {

            getTest().addScreenCaptureFromPath(path);

        } catch (Exception e) {

            throw new RuntimeException(e);

        }

    }

    public static void flush() {
        ExtentManager.getInstance().flush();
    }
}