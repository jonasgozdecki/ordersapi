package io.fly.orderapp.serviceImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import io.fly.orderapp.model.Order;
import io.fly.orderapp.model.Product;
import io.fly.orderapp.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products =  new ArrayList<>(Arrays.asList(
			));
	
	public List<Product> getAllProducts(){
		return products;
	}
	
	public Product getProduct(int id){
		return products.stream()
				.filter(t -> t.getId() == id)
				.findFirst()
				.get();
	}

	public void addOrder(Product product) {
		products.add(product);
		
	}

	@Override
	public void create(OrderDto c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(OrderDto c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItem(String orderId, String productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeItem(String orderId, String productId) {
		// TODO Auto-generated method stub
		
	}
}
