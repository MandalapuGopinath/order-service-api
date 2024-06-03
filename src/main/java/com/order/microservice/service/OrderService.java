package com.order.microservice.service;

import java.util.List;

import com.order.microservice.dto.OrderDto;

public interface OrderService {

	void createOrder(OrderDto orderDto);
	
	void createOrders(List<OrderDto> orderDto);

}
