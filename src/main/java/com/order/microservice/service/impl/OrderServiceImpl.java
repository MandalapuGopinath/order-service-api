package com.order.microservice.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.order.microservice.dto.OrderDto;
import com.order.microservice.entity.Order;
import com.order.microservice.mapper.OrderMapper;
import com.order.microservice.repository.OrderRepository;
import com.order.microservice.service.OrderService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

	private OrderRepository orderRepository;
	
	public void createOrder(OrderDto orderDto) {
		Order order = OrderMapper.mapToOrder(orderDto, new Order());
		Long randomInvoice = 1000000000L + new Random().nextInt(900000000);
		order.setOrderInvoice(randomInvoice);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		order.setOrderStartDate(localDateTime);
		order.setOrderExpiry(localDateTime.plusDays(15));
		orderRepository.save(order);
	}

	
	public void createOrders(List<OrderDto> orderDtos) {
        for (OrderDto orderDto : orderDtos) {
            createOrderInternal(orderDto);
        }
    }

    private void createOrderInternal(OrderDto orderDto) {
        Order order = OrderMapper.mapToOrder(orderDto, new Order());
        Long randomInvoice = 1000000000L + new Random().nextInt(900000000);
        order.setOrderInvoice(randomInvoice);

        LocalDateTime now = LocalDateTime.now();
        order.setOrderStartDate(now);
        order.setOrderExpiry(now.plusDays(30)); // Example: set expiry to 30 days from now

        orderRepository.save(order);
    }
}
