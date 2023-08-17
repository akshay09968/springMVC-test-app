package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
	
	@RequestMapping(value="/p1", method=RequestMethod.GET)
	public String Page1() {
		return "TestPage1";
	}
	
	@RequestMapping(value="/p2", method=RequestMethod.GET)
	public String Page2() {
		return "TestPage2";
	}
}
