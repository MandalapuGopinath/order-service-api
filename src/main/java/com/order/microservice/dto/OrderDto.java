package com.order.microservice.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

	private String orderItem;
	private String orderDescription;
	
	private Long orderInvoice;
	private LocalDateTime orderStartTime;
	private LocalDateTime orderExpiry;
}
