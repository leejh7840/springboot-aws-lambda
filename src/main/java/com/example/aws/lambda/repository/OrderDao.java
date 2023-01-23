package com.example.aws.lambda.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.aws.lambda.model.Order;

@Repository
public class OrderDao {
	public List<Order> buildOrders(){
		return Stream.of(
				new Order(101, "mobile", 20000, 1),
				new Order(201, "book", 10000, 2),
				new Order(301, "book", 50000, 4),
				new Order(401, "jean", 20000, 1)
				).collect(Collectors.toList());
	}
}
