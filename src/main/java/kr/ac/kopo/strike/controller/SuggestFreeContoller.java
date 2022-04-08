package kr.ac.kopo.strike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.strike.model.SuggestFree;
import kr.ac.kopo.strike.service.SuggestFreeService;

@Controller
@RequestMapping("/suggestfree")
public class SuggestFreeContoller {
	final String path = "suggestfree/";
	
	@Autowired
	SuggestFreeService service;
	
	@GetMapping("list")
	public String list(Model model) {
		List<SuggestFree> list = service.list();
				
		model.addAttribute("list", list);
		
		return path + "list";
	}
}
