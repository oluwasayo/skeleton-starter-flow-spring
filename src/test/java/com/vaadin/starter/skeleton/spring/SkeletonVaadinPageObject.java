package com.vaadin.starter.skeleton.spring;

import com.vaadin.testbench.addons.junit5.extensions.container.ContainerInfo;
import com.vaadin.testbench.addons.junit5.pageobject.AbstractVaadinPageObject;
import org.openqa.selenium.WebDriver;

public class SkeletonVaadinPageObject extends AbstractVaadinPageObject {

    public SkeletonVaadinPageObject(WebDriver webdriver, ContainerInfo containerInfo) {
        super(webdriver, containerInfo);
    }
}
