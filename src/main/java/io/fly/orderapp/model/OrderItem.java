package io.fly.orderapp.model;

import java.math.BigDecimal;
import java.util.List;


public class OrderItem {
	
	private int id;
	private int  orderId;
	private int  productId;
	private List<Product> product;
	private BigDecimal  price;
	private int quantity;
	private int  total;
	
	public OrderItem(int orderId, int productId, List<Product> product, BigDecimal price, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}
