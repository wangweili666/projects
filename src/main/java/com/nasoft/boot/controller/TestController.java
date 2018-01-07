package com.nasoft.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="enterIndex")
	public String enterIndex(){
		System.out.println("进入了webhook controller");
		return "user/index";
	}
}
