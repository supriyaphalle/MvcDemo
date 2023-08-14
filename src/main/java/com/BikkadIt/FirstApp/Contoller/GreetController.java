package com.BikkadIt.FirstApp.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetController")
public class GreetController {

	@GetMapping("/wel")
	public ResponseEntity<String> greet() {
		String msg= "Good Morning";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet1")
	public ResponseEntity<String>  greet1() {
		String msg = "Good Evening";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
