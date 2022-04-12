package kr.ac.kopo.strike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.strike.model.ClanRecord;
import kr.ac.kopo.strike.service.ClanRecordService;

@Controller
@RequestMapping("/clanRecord")
public class ClanRecordController {
final String path = "clanRecord/";
	
	@Autowired
	ClanRecordService service;
	
	@RequestMapping({"/","/list"})
	public String list(Model model) {
		List<ClanRecord> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@GetMapping("/add")
	public String add() {
		return path + "add";
	}
	
	@PostMapping("/add")
	public String add(ClanRecord item) {
		service.add(item);
		
		return "redirect:list";
	}
	
	@GetMapping("/update")
	public String update(ClanRecord item, Model model) {
		ClanRecord Citem = service.item(item);
		
		model.addAttribute("item", item);
		
		return path + "update";
	}
	
	@PostMapping("/update")
	public String update(ClanRecord item) {
		service.update(item);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(ClanRecord item) {
		service.delete(item);
		return "redirect:list";
	}
}
