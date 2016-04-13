package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import data.State;
@Controller
@SessionAttributes("current")
public class ControllerSessions {
	@Autowired
	private State state; 
	
	
	@ModelAttribute("current")
	public Integer initSessionObject() {
		return 1; 
	}
	@RequestMapping(path="submit.do", params="next")
	public ModelAndView mv = new ModelAndView("current") Integer current) { 
		mv.setViewName("results.jsp");
		mv.addObject("current", ++current); 
		State s = StateDAO.getStateID(current); 
		mv.addObject("state",s); 
		return mv;
	}
	}
}
