package com.subham.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.entity.OrderDetails;
import com.subham.repository.OrderDetailsRepository;

@Service("orderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;

	@Override
	public String saveOrderDetails(OrderDetails orderDetails) {
		
		orderDetailsRepository.saveAndFlush(orderDetails);
		
		return "Order saved...";
	}

}
