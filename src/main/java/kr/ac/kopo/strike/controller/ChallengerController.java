package kr.ac.kopo.strike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.strike.model.Challenger;
import kr.ac.kopo.strike.service.ChallengerService;

@Controller
@RequestMapping("/challenger")
public class ChallengerController {
	final String path = "/challenger/";
	
	@Autowired
	ChallengerService service;
	
	@GetMapping("/list/{game_code}")
	public String enter(@PathVariable int game_code, Model model) {
		
		List<Challenger> list = service.list(game_code);
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
}
