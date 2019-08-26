package com.spring.ms1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MS1")
public class Ms1Controller {
	
	@GetMapping("/simpledata/{data}")
	public String getSimpleData(@PathVariable String data) {
		return data;
	}

}
