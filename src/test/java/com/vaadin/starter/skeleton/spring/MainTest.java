package com.vaadin.starter.skeleton.spring;

import com.vaadin.testbench.TestBenchElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends AbstractIT {

    @Before
    public void init() {
        getDriver().get(BASE_URL);
    }

    @Test
    public void pageLoads() {
        Assert.assertTrue($(TestBenchElement.class).exists());
    }
}