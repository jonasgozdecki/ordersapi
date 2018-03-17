package io.fly.orderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.fly.orderapp.model.Order;
import io.fly.orderapp.model.Product;
import io.fly.orderapp.serviceImp.OrderServiceImpl;
import io.fly.orderapp.serviceImp.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productService;
	
	@RequestMapping("/Product")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@RequestMapping("/Product/{id}")
	public Product getProduct(@PathVariable int id) {
		return productService.getProduct(id);
	}

}
