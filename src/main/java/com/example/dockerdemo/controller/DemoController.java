package com.example.dockerdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/demo")
public class DemoController {
	@GetMapping("/book")
	public ResponseEntity<String> getMessage(){
		try {
		
			
			return ResponseEntity.ok("Welcome to book store , No books are added");
			
			
		}catch(RuntimeException e) {
			return new ResponseEntity("Not Found",HttpStatus.NOT_FOUND);
		}
	}
}
