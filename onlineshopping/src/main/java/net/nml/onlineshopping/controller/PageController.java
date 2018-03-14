package net.nml.onlineshopping.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");//'page' is logical view name
		mv.addObject("greeting","Welcome to spring web MVC");//data
		
		return mv;
	}
	

}
