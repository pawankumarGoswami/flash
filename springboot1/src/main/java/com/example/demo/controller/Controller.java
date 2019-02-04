package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

@RequestMapping(value="/pawan")	
	public String hello(){
		return "hello pawan goswami";
	}
}
