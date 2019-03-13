package com.vaadin.starter.skeleton.spring;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.notification.testbench.NotificationElement;
import com.vaadin.testbench.addons.junit5.extensions.container.ContainerInfo;
import com.vaadin.testbench.addons.junit5.pageobject.AbstractVaadinPageObject;
import org.openqa.selenium.WebDriver;

public class MainViewPageObject extends AbstractVaadinPageObject {

    public MainViewPageObject(WebDriver webdriver,
                              ContainerInfo containerInfo) {
        super(webdriver, containerInfo);
    }

    public ButtonElement button(){
        return $(ButtonElement.class).first();
    }

    public NotificationElement notification(){
        return $(NotificationElement.class).first();
    }
}
