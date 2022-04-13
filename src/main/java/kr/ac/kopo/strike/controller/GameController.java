package kr.ac.kopo.strike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.strike.model.Game;
import kr.ac.kopo.strike.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	final String path = "/game/";
	
	@Autowired
	GameService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Game> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
}
