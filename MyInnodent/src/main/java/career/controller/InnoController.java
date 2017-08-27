package career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InnoController {
@RequestMapping("/")
	public ModelAndView mv()
	{
	ModelAndView mm=new ModelAndView("page");
	return mm;
	}
	
}
