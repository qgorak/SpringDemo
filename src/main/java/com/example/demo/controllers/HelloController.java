package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
@RequestMapping("/hello")
public @ResponseBody String hello() {
	return "Hello";
}

@RequestMapping("/v")
public String HelloWithView() {
	return "index";
}
}
