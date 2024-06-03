package com.order.microservice.mapper;

import com.order.microservice.dto.OrderDto;
import com.order.microservice.entity.Order;

public class OrderMapper {

	public static OrderDto mapToOrderDto(Order order, OrderDto orderDto) {
		orderDto.setOrderItem(order.getOrderItem());
		orderDto.setOrderDescription(order.getOrderDescription());
		orderDto.setOrderInvoice(order.getOrderInvoice());
		orderDto.setOrderStartTime(order.getOrderStartDate());
		orderDto.setOrderExpiry(order.getOrderExpiry());
		return orderDto;
		
	}
	
	public static Order mapToOrder(OrderDto orderDto, Order order) {
		order.setOrderItem(orderDto.getOrderItem());
		order.setOrderDescription(orderDto.getOrderDescription());
		order.setOrderInvoice(orderDto.getOrderInvoice());
		order.setOrderStartDate(orderDto.getOrderStartTime());
		order.setOrderExpiry(orderDto.getOrderExpiry());
		
		return order;
	}
}

