package org.lorob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/myapplication")
public class ApplicationController {
	
	@RequestMapping(method=RequestMethod.GET)
    public ModelAndView initialisation() {
		String defaultValue="Please Submit Text";
		String defaultUser="Your Name";
		ModelAndView result = new ModelAndView("myapplication");
        result.getModel().put("enteredText", defaultValue);
        result.getModel().put("username", defaultUser);
        return result;
	}
	
	@RequestMapping(method=RequestMethod.POST)
    public ModelAndView updateText(@RequestParam(value="newText") String newText,
    							   @RequestParam(value="username") String username) {
		ModelAndView result = new ModelAndView("myapplication");
		System.out.println("usernamr="+username);
        result.getModel().put("enteredText", newText);
        result.getModel().put("username", username);
        return result;
	} 
}
