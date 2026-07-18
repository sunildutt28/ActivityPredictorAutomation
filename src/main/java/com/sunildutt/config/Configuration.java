package com.sunildutt.config;

public class Configuration {

    private BrowserConfig browser;
    private ApplicationConfig application;
    private TimeoutConfig timeouts;

    public BrowserConfig getBrowser() {
        return browser;
    }

    public ApplicationConfig getApplication() {
        return application;
    }

    public TimeoutConfig getTimeouts() {
        return timeouts;
    }

    public void setBrowser(BrowserConfig browser) {
        this.browser = browser;
    }

    public void setApplication(ApplicationConfig application) {
        this.application = application;
    }

    public void setTimeouts(TimeoutConfig timeouts) {
        this.timeouts = timeouts;
    }
}