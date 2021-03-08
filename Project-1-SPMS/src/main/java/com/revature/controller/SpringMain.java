
  package com.revature.controller;
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RequestParam;
  import org.springframework.web.bind.annotation.RestController;

import com.revature.services.PersonService;
  
  @SpringBootApplication
  @RestController
  public class SpringMain {
    
      
      public static void main(String[] args) {
      SpringApplication.run(SpringMain.class, args);
      }
      
      @GetMapping("/hello")
      public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
      }
      
      @GetMapping("/login")
      public String login(@RequestParam(value = "name", defaultValue = "0") String name) {
    	  
    	  String returnValue = "";
    	  PersonService persServVere = new PersonService();
    	  try {
    		  Integer userId =  Integer.valueOf(name);
    		  returnValue = ((persServVere.getPersonById(userId)).getFirstName());
    	  }catch(Exception e) {
    		  
    	  }
    	  return String.format("Hello %s!", returnValue);
    	  
      }
      
      //@GetMapping("/submit-a-book")
  }
            
