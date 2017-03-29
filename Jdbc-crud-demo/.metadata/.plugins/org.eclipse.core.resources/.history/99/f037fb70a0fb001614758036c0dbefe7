package com.bellinf.batch4.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinf.batch4.mvc.model.Student;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getStudent(Model model){
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-login";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String studentDetails(@Valid @ModelAttribute Student student, BindingResult result, Model model){
		model.addAttribute("message", "Hey...welcome "+student.getName());
		if(result.hasErrors()){
			return "student-login";
		}
		
		return "success";
	}
	
}
