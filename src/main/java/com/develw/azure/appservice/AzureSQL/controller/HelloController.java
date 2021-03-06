package com.develw.azure.appservice.AzureSQL.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/hello")
  public ResponseEntity<String> hello() {
    return new ResponseEntity<String>("Hello", HttpStatus.OK);
  }
}
