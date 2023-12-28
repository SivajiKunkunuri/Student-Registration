package in.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.laptop.entities.Student;
import in.laptop.repos.CourseRepo;
import in.laptop.repos.StudentRepo;
import in.laptop.repos.TimingsRepo;
import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private TimingsRepo timingsRepo;
	
	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping("/show")
	public String showRegistrationForm(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", courseRepo.findAll());
		model.addAttribute("timings", timingsRepo.findAll());
		return "index";
	}
	
	@PostMapping("/register")
	public String submitRegistration(Model model, @ModelAttribute("student") @Valid Student student, BindingResult br) {
		if(br.hasErrors()) {
			return "index";
		}
		studentRepo.save(student);
		model.addAttribute("msg", "Registration complted successfully");
		return "success";
	}

}
