package org.laundry.controller;

import java.util.Map;

import javax.validation.Valid;

import org.laundry.model.Order;
import org.laundry.model.User;
import org.laundry.service.OrderService;
import org.laundry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private UserService userService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
		//  dataBinder.setValidator(new OrderValidator());
	}

	@RequestMapping(value = "/user/{userId}/order/new", method = RequestMethod.GET)
	public String initOrderCreationForm(@PathVariable("userId") int userId, Map<String, Object> model) {
		User user = this.userService.getUserDetails(userId);
		Order order = new Order();
		user.addOrder(order);
		model.put("order", order);
		return "laundry/createOrUpdateOrderForm";
	}

	@RequestMapping(value = "/user/{userId}/order/new", method = RequestMethod.POST)
	public String processCreationForm(@Valid Order order, BindingResult result, SessionStatus status) {
		if (result.hasErrors()) {
			return "laundry/createOrUpdateOrderForm";
		} else {
			this.orderService.saveOrder(order);
			status.setComplete();
			return "redirect:/user/{userId}";
		}
	}
}
