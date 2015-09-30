package org.laundry.controller;

import org.laundry.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	@Autowired
	SampleService service;
	
	@RequestMapping(value = "/oups", method = RequestMethod.GET)
	void sampleMethod(){
		service.getUserById(1);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	void sampleMethod2(){
		service.getUserById(1);
	}
}
