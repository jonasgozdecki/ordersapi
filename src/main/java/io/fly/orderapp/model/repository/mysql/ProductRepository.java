package io.fly.orderapp.model.repository.mysql;

import io.fly.orderapp.model.Product;

import java.util.List;

public interface ProductRepository {

    void create(Product p);

    Product read(String id);

    void update(Product p);

    void delete(String id);

    List<Product> readAll();
}
