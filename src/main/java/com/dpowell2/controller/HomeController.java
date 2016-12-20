/**
 * HomeController.java 1.0 Dec 19, 2016
 *
 * Copyright (c) 2016 dpowell2
 */
package com.dpowell2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dpowell2
 *
 */
@RestController
public class HomeController {

  @RequestMapping("/")
  public String home() {
    return "Hello, World!";
  }

}
