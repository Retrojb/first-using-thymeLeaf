package com.bridgeproject.javacourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	JavaCourseRepository javaCoursesRepo;
	
	@RequestMapping("/CourseHome")
	public String home(Model model) {
		model.addAttribute("CourseHome", javaCoursesRepo.findAll());
		return "CourseHome";
	}
	
	@RequestMapping("/courses/{id}")
	public String getCourses(@PathVariable(name="id") Long id, Model model) {
		model.addAttribute("courses", javaCoursesRepo.findById(id));
		return "courses";
		
	}
}
