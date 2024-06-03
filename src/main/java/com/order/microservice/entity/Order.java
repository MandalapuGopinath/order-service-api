package com.order.microservice.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Order {
	
	@Id
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name = "order_item")
	private String orderItem;
	
	@Column(name = "order_description")
	private String orderDescription;
	
	@Column(name = "order_invoice")
	private Long orderInvoice;
	
	@Column(name = "order_start_date")
	private LocalDateTime orderStartDate;
	
	@Column(name = "order_expiry")
	private LocalDateTime orderExpiry;

}
