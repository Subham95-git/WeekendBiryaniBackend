package com.subham.service;

import java.util.List;

import com.subham.entity.OrderDetails;



public interface OrderDetailsService {

	public String saveOrderDetails(OrderDetails orderDetails);
	public List<OrderDetails> getOrder();
}
