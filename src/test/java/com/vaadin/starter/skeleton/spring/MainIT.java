package com.vaadin.starter.skeleton.spring;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.combobox.testbench.ComboBoxElement;
import com.vaadin.flow.component.notification.testbench.NotificationElement;
import com.vaadin.testbench.addons.junit5.extensions.unittest.VaadinWebUnitTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@VaadinWebUnitTest
public class MainIT {

    @Test
    @VaadinWebUnitTest
    public void testFormSubmission(SkeletonVaadinPageObject po) {
        po.loadPage();

        ComboBoxElement element = po.comboBox().id("someId");
        po.getTestCase().$(ButtonElement.class).first().click();


        Assertions.assertEquals("Form submitted",
                po.getTestCase().$(NotificationElement.class).first().getText());
    }
}
