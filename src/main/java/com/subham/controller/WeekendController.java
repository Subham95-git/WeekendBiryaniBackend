package com.subham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subham.entity.OrderDetails;
import com.subham.service.OrderDetailsService;

@RestController
@RequestMapping("/v1")
public class WeekendController {

	@Autowired
	private OrderDetailsService orderDetailsService;


	@GetMapping("/getdata")
	public List<OrderDetails> getData() {
		return orderDetailsService.getOrder();
	}

	@PostMapping("/saveorder")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public String saveOrderDetails(@RequestParam("name")String name, @RequestParam("mobile")int mobile,
			@RequestParam("village")String village, @RequestParam("menu")String menuitem, 
			@RequestParam("plate")int platecount) {


		OrderDetails orderDetails = new OrderDetails();

		orderDetails.setName(name);
		orderDetails.setMobilenumber(String.valueOf(mobile));
		orderDetails.setVillage(village); orderDetails.setMenuitem(menuitem);
		orderDetails.setPlatecount(platecount);

		System.out.println(orderDetails.toString());

		System.out.println("----  "+name+" "+mobile+" "+village+" "+menuitem+" "
				+platecount+" -------");


		String message = orderDetailsService.saveOrderDetails(orderDetails);

		return message;


	}
}
