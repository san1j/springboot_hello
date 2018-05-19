package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class controller {
	
	@Value("${welcome.message}")
	String welcomeMessage;

  @RequestMapping("/")
   public String index(Model model) {
	model.addAttribute("message", welcomeMessage);
    return "hello";
  }

}