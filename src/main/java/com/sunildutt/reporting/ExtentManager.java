package com.sunildutt.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    private ExtentManager() {
    }

    public static ExtentReports getInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("test-output/ExtentReport.html");

            spark.config().setReportName("Activity Predictor Automation Report");
            spark.config().setDocumentTitle("Automation Test Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo("Framework", "Selenium Java");

            extent.setSystemInfo("Tester", "Sunil Dutt");

            extent.setSystemInfo("Java", System.getProperty("java.version"));

            extent.setSystemInfo("OS", System.getProperty("os.name"));

        }

        return extent;

    }

}