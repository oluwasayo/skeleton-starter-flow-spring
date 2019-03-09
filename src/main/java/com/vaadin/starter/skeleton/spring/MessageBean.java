package com.vaadin.starter.skeleton.spring;

import org.springframework.stereotype.Service;

@Service
public class MessageBean {

  public String getMessage() {
    return "Button was clicked";
  }
}
