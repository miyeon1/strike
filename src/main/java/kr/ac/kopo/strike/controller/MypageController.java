package kr.ac.kopo.strike.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.strike.model.Individual;
import kr.ac.kopo.strike.model.Member;
import kr.ac.kopo.strike.service.IndividualService;
import kr.ac.kopo.strike.service.MemberService;

@Controller
@RequestMapping("/mypage")
public class MypageController {
	final String path = "mypage/";
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	IndividualService individualService;
	
	@GetMapping("/mypage/{member_code}")
	public String mypage(Model model, HttpSession session, @PathVariable int member_code) {
		
		Member member = new Member();
		Individual individual = new Individual();
		
		member.setMember_code((Integer) session.getAttribute("code"));
		individual.setIndividual_code((Integer) session.getAttribute("code"));
		
		
		model.addAttribute("member", member);
		model.addAttribute("individual", individual);
		
		return path + "mypage";
	}
	
	@GetMapping("/update/{member_code}")
	public String update(@PathVariable int member_code, Model model) {
		
		Member item = memberService.item(member_code);
		
		model.addAttribute("item", item);
		
		return path + "update";
	}
	
	@PostMapping("/update/{member_code}")
	public String update(@PathVariable int member_code, Member item) {
		memberService.update(item);
		
		return "redirect:../mypage";
	}
	
	@GetMapping("/delete")
	public String delete(@PathVariable int member_code) {
		memberService.delete(member_code);
		return "redirect:../mypage";
	}
}