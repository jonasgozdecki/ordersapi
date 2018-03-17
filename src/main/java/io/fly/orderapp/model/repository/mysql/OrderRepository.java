package io.fly.orderapp.model.repository.mysql;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;


public interface OrderRepository {

    void create(OrderDto c);

    void update(OrderDto c);

    OrderDto read(String id);

    void delete(String id);
}
