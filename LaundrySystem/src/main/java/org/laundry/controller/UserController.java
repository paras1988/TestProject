package org.laundry.controller;

import org.laundry.model.User;
import org.laundry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	/*	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
		//  dataBinder.setValidator(new UserValidator());
	}
	 */
	/*	@RequestMapping(value = "/users/new", method = RequestMethod.GET)
	public String initCreationForm(Map<String, Object> model) {
		User users = new User();
		model.put("users", users);
		return "users/createOrUpdateOwnerForm";
	}
	 */

	/*	@RequestMapping(value = "/users/new", method = RequestMethod.POST)
	public String processCreationForm(@Valid User user, BindingResult result, SessionStatus status) {
		if (result.hasErrors()) {
			return "users/createOrUpdateOwnerForm";
		} else {
			this.userService.saveUser(user);
			status.setComplete();
			return "redirect:/users/" + user.getId();
		}
	}
	 */

	@RequestMapping(value = "/users/new", method = RequestMethod.POST
			,consumes = {"application/xml", "application/json"})
	public @ResponseBody String processCreationForm2(@RequestBody User user) {
		this.userService.saveUser(user);
		//status.setComplete();
		return "redirect:/users/" + user.getId();

	}

}