package com.vaadin.starter.skeleton.spring;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.LoggerFactory;

import com.vaadin.testbench.IPAddress;
import com.vaadin.testbench.TestBenchDriverProxy;
import com.vaadin.testbench.parallel.ParallelTest;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public abstract class AbstractIT extends ParallelTest {

    protected String BASE_URL = "http://localhost:8080/";

    static {
        // Prevent debug logging from Apache HTTP client
        Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.INFO);
    }

    @Override
    public void setup() throws Exception {
        super.setup();
        if (getRunLocallyBrowser() == null) {
            BASE_URL = "http://" + IPAddress.findSiteLocalAddress() + ":8080/";
        }
    }

    @Override
    public TestBenchDriverProxy getDriver() {
        return (TestBenchDriverProxy) super.getDriver();
    }

    @Override
    public void setDesiredCapabilities(DesiredCapabilities desiredCapabilities) {
        // Disable interactivity check in Firefox https://github.com/mozilla/geckodriver/#mozwebdriverclick
        if (desiredCapabilities.getBrowserName().equals(BrowserType.FIREFOX)) {
            desiredCapabilities.setCapability("moz:webdriverClick", false);
        }

        super.setDesiredCapabilities(desiredCapabilities);
    }
}
