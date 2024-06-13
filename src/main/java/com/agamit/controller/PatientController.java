package com.agamit.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class PatientController {
	
	@GetMapping(value = {"/","/form"})
	public String seeForm() {
		return "seeform";	
	}
	
	
	@PostMapping(value = {"/seeform"})
	public String writeForm(HttpServletRequest req,Model model) {
		String pNm=req.getParameter("pNm");
		System.out.println("PatientName:-"+pNm);
		
		
		String pNo=req.getParameter("pNo");
		System.out.println("PatientNumber::-"+pNo);
		
		String pblm=req.getParameter("pblm");
		System.out.println("PatientProblm:::-"+pblm);
		

		String email=req.getParameter("email");
		System.out.println("Email::-"+email);
		
		
		String pwd=req.getParameter("pwd");
		System.out.println("Password:::-"+pwd);
		
		String succform="Patient Details Summited";
		model.addAttribute("msg",succform);
		
		return "regsuccform";
		
		
	}

}
