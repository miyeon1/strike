package kr.ac.kopo.strike.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import kr.ac.kopo.strike.model.Individual;
import kr.ac.kopo.strike.model.User_User;
import kr.ac.kopo.strike.service.IndividualService;

@Controller
@RequestMapping("/individual")
public class IndividualController {
	final String path = "individual/";
	
	@Autowired
	IndividualService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Individual> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@GetMapping("/add")
	public String add(@SessionAttribute User_User user, Individual individual) {
		
		individual.setClan("클랜없음");
		individual.setTier("아이언");
		individual.setUser_user_code(user.getUser_code()); 
		individual.setUser_user_name(user.getName());
		
		service.add(individual);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete/{individual_code}")
	public String delete(@PathVariable int individual_code, Individual item) {
		service.delete(individual_code);
		
		return "redirect:../list";
	}
}
