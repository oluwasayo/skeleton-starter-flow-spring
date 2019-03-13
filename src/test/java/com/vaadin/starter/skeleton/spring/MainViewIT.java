package com.vaadin.starter.skeleton.spring;

import com.vaadin.testbench.addons.junit5.extensions.container.SpringBootConf;
import com.vaadin.testbench.addons.junit5.extensions.unittest.VaadinWebUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@VaadinWebUnitTest
@SpringBootConf(source = Application.class)
public class MainViewIT {

  @VaadinWebUnitTest
  void testFormSubmission(MainViewPageObject po) {
    po.loadPage();
    po.button().click();

    assertEquals("Button was clicked", po.notification().getText());
  }
}
