package com.sunildutt.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private final Properties properties;

    public ConfigReader() {

        properties = new Properties();

        try {

            FileInputStream file =
                    new FileInputStream("src/test/resources/config.properties");

            properties.load(file);

        } catch (IOException e) {

            throw new RuntimeException("Unable to load config.properties", e);

        }
    }

    public String getBaseUrl() {
        return properties.getProperty("base.url");
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public int getTimeout() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }

}