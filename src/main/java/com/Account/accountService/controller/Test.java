package com.Account.accountService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/test/marks")
	public int getMarks(){
		return 100;

	}
	
}
