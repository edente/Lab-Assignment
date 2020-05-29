package edu.mum.cs425.demowebapps.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomepageController {
	
 @GetMapping(value= {"/", "/home", "/home/classs"})
    public String myPage() {
	 return "index";
 }
	
	

}
