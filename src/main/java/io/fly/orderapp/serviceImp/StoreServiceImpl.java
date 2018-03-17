package io.fly.orderapp.serviceImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.fly.orderapp.model.Order;
import io.fly.orderapp.model.Product;

@Service
public class StoreServiceImpl {

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
}
