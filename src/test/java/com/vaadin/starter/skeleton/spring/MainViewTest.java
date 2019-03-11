package com.vaadin.starter.skeleton.spring;

import org.junit.jupiter.api.Assertions;
import com.vaadin.testbench.addons.junit5.extensions.unittest.VaadinWebUnitTest;

@VaadinWebUnitTest
public class MainViewTest {

  @VaadinWebUnitTest
  void testFormSubmission(MainViewPageObject po) {
    po.loadPage();
    po.button().click();
    Assertions.assertEquals("Button was clicked" ,
                            po.notification().getText());
  }
}
