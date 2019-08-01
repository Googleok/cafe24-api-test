package com.cafe24.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping({"/","/main"}) //mysite2/ 이렇게 하면 들어오게
	public String main() {
		return "api/index";
	}
	
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		
		return "<h1>안녕하세요!</h1>";
		
	}	

	
	
}
