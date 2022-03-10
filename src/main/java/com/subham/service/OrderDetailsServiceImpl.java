package com.subham.service;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<OrderDetails> getOrder(){
		List<OrderDetails> data = new ArrayList<>();
		
		data = orderDetailsRepository.findAll();
		
		return data;
	}
}
