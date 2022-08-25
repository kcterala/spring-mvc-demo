package com.kcterala.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//Controller method to show form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//Controller method to process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
//	@RequestMapping("/processFormTwo")
//	public String letsShoutDude(HttpServletRequest request, Model model) {
//		String name = request.getParameter("studentName");
//		name = name.toUpperCase();
//		String result = "Yo!!! " + name;
//		model.addAttribute("message",result);
//		return "helloworld";
//	}
//	
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(@RequestParam("studentName") String name, Model model) {
		name = "Yo!!! "+name.toUpperCase();
		model.addAttribute("message",name);
		return "helloworld";
	}
}
