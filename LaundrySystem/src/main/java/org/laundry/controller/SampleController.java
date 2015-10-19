package org.laundry.controller;

import org.laundry.model.User;
import org.laundry.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@Autowired
	SampleService service;

	@RequestMapping(value = "/", method = RequestMethod.POST
			,consumes = {"application/xml", "application/json"})
	public @ResponseBody void processCreationForm(@RequestBody User user) {
		System.out.println("ASDFASDFASDFASDFASDFASDF");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET
			,consumes = {"application/xml", "application/json"})
	public @ResponseBody void processCreationForm2() {
		System.out.println("ASDFASDFASDFASDFASDFASDF");
	}
}
