package com.order.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.order.microservice.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {

}
