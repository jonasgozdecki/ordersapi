package io.fly.orderapp.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

import javax.persistence.Transient;


public class Order {
	
	private int id;
	private String date;
	private int customerId;
	private String deliveryAddress; //*
	private String contact; //*
	private int storeId; //*
	
	private List<OrderItem> orderItems;
	
	//private OrderItems orderItems; //*
	
	private BigDecimal total; 
	private String status; 
	private String lastUpdate;
	
	public Order() {
		
	}
	
	public Order(int id, String date, int customerId, String deliveryAddress, String contact, int storeId, List<OrderItem> orderItems, BigDecimal total, String status, String lastUpdate) {
		super();
		this.id = id;
		this.date = date;
		this.customerId = customerId;
		this.deliveryAddress = deliveryAddress;
		this.contact = contact;
		this.storeId = storeId;
		
		this.orderItems = orderItems;
		
		this.total = total; 
		this.status = status; 
		this.lastUpdate = lastUpdate;
		
	}
	
	private void updateTotalPrice() {
        Function<OrderItem, BigDecimal> totalMapper = OrderItem::getPrice;
        BigDecimal totalPrice = orderItems.stream().map(totalMapper).reduce(BigDecimal.ZERO, BigDecimal::add);
        this.setTotal(totalPrice);
    }


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public BigDecimal getTotal() {
		updateTotalPrice();
		return total;
	}

	public void setTotal(BigDecimal totalPrice) {
		this.total = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
	
	
}
