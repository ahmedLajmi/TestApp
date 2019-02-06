package home;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
public class HomeController{
	
	
	@RequestMapping("/welcome/{name}")
	public ModelAndView handleRequestInternal ( @PathVariable("name") String name ) throws Exception { 
		
		ModelAndView modelandview = new ModelAndView("home");
		modelandview.addObject("welcomeMessage", "Hello "+name);
		return modelandview;
	
	}
}



