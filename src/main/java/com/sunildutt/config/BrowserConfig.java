package com.sunildutt.config;

public class BrowserConfig {

    private String name;
    private boolean headless;

    public String getName() {
        return name;
    }

    public boolean isHeadless() {
        return headless;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }
}