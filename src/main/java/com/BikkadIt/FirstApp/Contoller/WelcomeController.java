package com.BikkadIt.FirstApp.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WelcomeController")
public class WelcomeController {

	@GetMapping("/wel")
	public ResponseEntity<String> welcome() {
		String msg= "Welcome to BikkadIt";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping("/wel1")
	public ResponseEntity<String> welcome1() {
		
		String msg =  "Welcome To java developemnt course";
		return new ResponseEntity<String> (msg,HttpStatus.OK);
	}
	
	@GetMapping("/wel/{fname}")
	public ResponseEntity<String>welcomeMsg(@PathVariable String fname){
		String msg = "Hiii  "+ fname+"  welcome to BikkadIT";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	@GetMapping("/wel/{fname}/{lname}")
	public ResponseEntity<String> welcomeMsg(@PathVariable String fname, @PathVariable String lname){
		String msg = "Hii  " + fname+ "  "+lname+ " Welcome to bikkadIT";
		return new ResponseEntity<String> (msg,HttpStatus.OK);
	}
}
