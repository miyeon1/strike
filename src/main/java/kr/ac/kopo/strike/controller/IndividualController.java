package kr.ac.kopo.strike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.strike.model.Individual;
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
	public String add() {
		
		return path + "add";
	}
	
	@PostMapping("/add")
	public String add(Individual item) {		
		service.add(item);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete/{individual_code}")
	public String delete(@PathVariable int individual_code, Individual item) {
		service.delete(individual_code);
		
		return "redirect:../list";
	}
}
