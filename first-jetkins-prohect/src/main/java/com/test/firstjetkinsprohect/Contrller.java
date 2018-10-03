package com.test.firstjetkinsprohect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contrller {

	@GetMapping("/getHello")
	public String SayHello()
	{
		System.out.println("Test Print");
		return "hello shubham";
	}
	
}
