package io.ankit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ankit.demo.beans.Address;
import io.ankit.demo.service.Display;

@RestController
@RequestMapping("api")
public class DisplayController {
	@Autowired(required = false)
	private Display display;
	
	@GetMapping(path = "/display")
	public Address display() throws Exception {
		return display.display();
	}
}
