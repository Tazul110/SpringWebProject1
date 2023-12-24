package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class mainController {

	@RequestMapping("/home")
	public String homePage()
	{
		return "HomePage.html";
	}
	
	@RequestMapping("/addProgrammer")
	public String addProgrammer(@RequestParam int id,@RequestParam String name,
			@RequestParam String lang, Model model)
	{
		 model.addAttribute("name1",name);
		 model.addAttribute("id1",id);
		 model.addAttribute("lang1",lang);
		
		return "Programmer_info.html";
	}
}
