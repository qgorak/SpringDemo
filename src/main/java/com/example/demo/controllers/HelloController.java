package com.example.demo.controllers;
import com.example.demo.models.Group;
import com.example.demo.models.Organization;
import com.example.demo.models.User;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
@RequestMapping("/hello")
public @ResponseBody String hello() {
	return "Hello";
}

@RequestMapping("/v/{name}")
public String HelloWithView(@PathVariable String name,ModelMap model) {
	Organization orga=new Organization(name);
	Group group=new Group("BTS2A",orga);
	new User("quentin", group);
	new User("sam", group);
	model.addAttribute("orga",orga);
	return "index";
}
}
