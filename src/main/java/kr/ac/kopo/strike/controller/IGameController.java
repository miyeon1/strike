package kr.ac.kopo.strike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.strike.model.IGame;
import kr.ac.kopo.strike.service.IGameService;

@Controller
@RequestMapping("/iGame")
public class IGameController {
	final String path = "/iGame/";
	
	@Autowired
	IGameService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<IGame> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
}
