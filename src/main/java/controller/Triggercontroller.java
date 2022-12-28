package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ean.Student;


@Controller
public class Triggercontroller {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String myview() {
		return "index";
		
		
	}
	@RequestMapping(value = "/Student",method = RequestMethod.POST)
	public String Studenttrail(@ModelAttribute("student") @Validated Student stu,Model md) {
		md.addAttribute("name",stu.getName());
		md.addAttribute("id",stu.getId());
		
		return "resourcere" ;
	}

}
