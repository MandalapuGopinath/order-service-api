package com.order.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.microservice.constants.OrderConstants;
import com.order.microservice.dto.OrderDto;
import com.order.microservice.dto.ResponseDto;
import com.order.microservice.service.OrderService;

@RestController
@RequestMapping(path = "/api")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDto> createOrder(@RequestBody OrderDto orderDto){
		orderService.createOrder(orderDto);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseDto(OrderConstants.STATUS_201,OrderConstants.MESSAGE_201));
	}
	@PostMapping("/create/group")
	public ResponseEntity<ResponseDto> createOrder(@RequestBody List<OrderDto> orderDto){
		orderService.createOrders(orderDto);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseDto(OrderConstants.STATUS_201,OrderConstants.MESSAGE_201));
	}
}
