package org.laundry.controller;

import org.laundry.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {
    
	@Autowired
	private OrderService orderService;
	
	
	
	
}
