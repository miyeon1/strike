package kr.ac.kopo.strike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.strike.model.User_User;
import kr.ac.kopo.strike.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	final String path = "user/";
	
	@Autowired
	UserService service;
	
	@GetMapping("/add")
	public String add() {
		return path + "/add";
	}
	
	@PostMapping("add")
	public String add(User_User user) {
		
		System.out.println(user.getId());
		
		if(service.confirm(user.getId())) {
			
			return "redirect:add";
		}
		
		System.out.println(user.getUser_code());
		
		service.add(user);
		
		return "redirect:..";
	}
	
	@ResponseBody
	@PostMapping("/same")
	public String confirm(String user_id) {
		
		System.out.println("중복확인");
		
		boolean overlap = service.confirm(user_id);
		if(overlap == true) {
			return "overlap";
		} else {
			return "use";
		}
	}
}
