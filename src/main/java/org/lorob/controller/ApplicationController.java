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
		String testValue="Please Submit Text";
		ModelAndView result = new ModelAndView("myapplication");
        result.getModel().put("myTestValue", testValue);
        return result;
	}
	
	@RequestMapping(method=RequestMethod.POST)
    public ModelAndView updateText(@RequestParam(value="newText") String newText) {
		ModelAndView result = new ModelAndView("myapplication");
        result.getModel().put("myTestValue", newText);
        return result;
	} 
}
