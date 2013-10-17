package com.mkyong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.model.Result;
import com.mkyong.service.SchoolResultService;

@Controller
public class ResultController {

	@Autowired
	private SchoolResultService resultService;
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	//@RequestMapping(value = "/result", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	@ResponseBody
	public List<Result> getSchoolResults(HttpServletRequest request) {
		String re = request.getParameter("id");
		System.out.println("*****************" + re);
		//model.addAttribute("message",
		//		"Maven Web Project + Spring 3 MVC - welcome()");
		return resultService.getResultsBySubject();
	}
}
