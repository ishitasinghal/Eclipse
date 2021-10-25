package com.training.First.pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.First.service.AdditionService;

@Controller
public class AddController {
	

	@Autowired
	AdditionService additionService;
	
	@RequestMapping(value="/add")
	
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mv= new ModelAndView();
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int c=additionService.add(num1,num2);
		
		mv.addObject("result ",c);
		mv.setViewName("addResult");
		return mv;
		
	}

	@RequestMapping(value="/sub")
	public ModelAndView sub(HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mvs= new ModelAndView();
		int numb1 = Integer.parseInt(req.getParameter("nn1"));
		int numb2 = Integer.parseInt(req.getParameter("nn2"));
		
		int cc=additionService.sub(numb1,numb2);
		
		mvs.addObject("subresult ",cc);
		mvs.setViewName("subResult");
		return mvs;
		
	}
}
