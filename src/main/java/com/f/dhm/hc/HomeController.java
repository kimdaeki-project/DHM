package com.f.dhm.hc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() throws Exception{
		return "index";
	}
	
	@GetMapping("/template/basic")
	public String basic() {
		return "template/basic";
	}
}
	