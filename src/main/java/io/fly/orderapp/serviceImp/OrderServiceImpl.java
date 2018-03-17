package io.fly.orderapp.serviceImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.food.delivery.dto.CartDto;
import com.food.delivery.dto.CartItemDto;

import io.fly.orderapp.model.Order;
import io.fly.orderapp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private List<Order> orders =  new ArrayList<>(Arrays.asList(
			new Order(1,"10/10/2010", 1, "rua: x, 123", "jaime", 1, 23.35, "ok", "10/10/2010"),
			new Order(2,"11/10/2010", 2, "rua: y, 123", "daniel", 2, 53.23, "ok", "11/10/2010"),
			new Order(3,"12/10/2010", 3, "rua: z, 123", "marcos", 3, 84.98, "ok", "11/10/2010")
			));
	
	public List<Order> getAllOrders(){
		return orders;
	}
	
	public Order getOrder(int id){
		return orders.stream()
				.filter(t -> t.getId() == id)
				.findFirst()
				.get();
	}

	public void addOrder(Order order) {
		orders.add(order);
		
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
		OrderDto order = orderRepository.read(orderId);
        if (cart == null) {
            // Order does not exist, so creates a new order item
            OrderItemDto item = new OrderItemDto(orderId + productId, productId);
            // Creates a new order
            order = new OrderDto(orderId);
            order.addCartItem(item);
            // update database
            create(order);
            return;
        }

        OrderItemDto item = order.getOrderItems().stream().filter(c -> c.getProductId().equals(productId)).findAny().orElse(null);
        if (item == null) {
            order.addCartItem(new OrderItemDto(orderId + productId, productId));
        } else {
            item.setQuantity(item.getQuantity() + 1);
        }
        // update database
        create(cart);
		
	}

	@Override
	public void removeItem(String orderId, String productId) {
		OrderDto cartDto = cartRepository.read(cartId);
        CartItemDto cartItemDto = cartDto.getOrderItems().stream().filter(item -> item.getProductId().equals(productId)).findAny().orElse(null);
        cartDto.getOrderItems().remove(cartItemDto);
        // update database
        create(cartDto);
		
	}
}
