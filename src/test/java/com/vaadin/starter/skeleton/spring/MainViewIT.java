package com.vaadin.starter.skeleton.spring;

import com.vaadin.testbench.addons.junit5.extensions.container.SpringBootConf;
import org.junit.jupiter.api.Assertions;
import com.vaadin.testbench.addons.junit5.extensions.unittest.VaadinWebUnitTest;

@SpringBootConf(source = Application.class)
@VaadinWebUnitTest
public class MainViewIT {

  @VaadinWebUnitTest
  void testFormSubmission(MainViewPageObject po) {
    po.loadPage();
    po.button().click();
    Assertions.assertEquals("Button was clicked" ,
                            po.notification().getText());
  }
}
