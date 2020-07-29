package com.azureTest.AzureTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		System.out.print("Hello world !!!! ");
		return "Hi This is First Azure deployement";
	}
}
