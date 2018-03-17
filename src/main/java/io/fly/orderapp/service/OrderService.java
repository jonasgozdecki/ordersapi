
package io.fly.orderapp.service;


import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;

import io.fly.orderapp.model.Order;

public interface OrderService {

    void create(OrderDto c);

    Order read(String id);

    void update(OrderDto c);

    void delete(String id);

    void addItem(String orderId, String productId);

    void removeItem(String orderId, String productId);
}

