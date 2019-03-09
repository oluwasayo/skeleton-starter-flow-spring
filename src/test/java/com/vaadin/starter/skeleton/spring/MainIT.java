package com.vaadin.starter.skeleton.spring;

import org.junit.jupiter.api.Assertions;
import com.vaadin.flow.component.combobox.testbench.ComboBoxElement;
import com.vaadin.testbench.addons.junit5.extensions.container.SpringBootConf;
import com.vaadin.testbench.addons.junit5.extensions.unittest.VaadinWebUnitTest;
import com.vaadin.testbench.addons.junit5.pageobject.WithID;

@VaadinWebUnitTest
@SpringBootConf(source = Application.class)
public class MainIT {

  @VaadinWebUnitTest
  void testFormSubmission(SkeletonVaadinPageObject po) {
    po.loadPage();
    final WithID<ComboBoxElement> comboBox = po.comboBox();

    po.button().click();

    Assertions.assertEquals("Button was clicked" ,
                            po.notification().getText());
  }
}
