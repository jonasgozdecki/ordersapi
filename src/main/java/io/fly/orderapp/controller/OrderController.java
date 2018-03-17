package io.fly.orderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.fly.orderapp.model.Order;
import io.fly.orderapp.serviceImp.OrderServiceImpl;

@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderService;
	
	@RequestMapping("/Order")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@RequestMapping("/Order/{id}")
	public Order getOrder(@PathVariable int id) {
		return orderService.getOrder(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/Order")
	public void addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
	}
}
