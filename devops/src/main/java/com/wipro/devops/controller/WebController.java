package com.wipro.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")

public class WebController {



	@GetMapping("/getall")
	public String getAllDetails() {

		return "Home Page";
	}
	@PostMapping("/create")
	public String create(String details) {
		return "CREATED";
	}

}