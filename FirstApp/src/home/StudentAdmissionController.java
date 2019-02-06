package home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value= "/admissionForm", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView model= new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value= "/SubmitAdmissionForm", method= RequestMethod.POST)
	public ModelAndView SubmitAdmissionForm(@ModelAttribute("student") Student student) {
		
		ModelAndView model= new ModelAndView("AdmissionSuccess");
		return model;
	}
	
	
}
