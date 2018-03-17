package io.fly.orderapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "product")
public class Store {
	
	private int id;
	private String date;
	private int customerId;
	private String deliveryAddress; //*
	private String contact; //*
	private int storeId; //*
	
	//private OrderItems orderItems; //*
	
	private double total; 
	private String status; 
	private String lastUpdate;
	
	public Store() {
		
	}
	
	public Store(int id, String date, int customerId, String deliveryAddress, String contact, int storeId, double total, String status, String lastUpdate) {
		super();
		this.id = id;
		this.date = date;
		this.customerId = customerId;
		this.deliveryAddress = deliveryAddress;
		this.contact = contact;
		this.storeId = storeId;
		
		//private OrderItems orderItems; //*
		
		this.total = total; 
		this.status = status; 
		this.lastUpdate = lastUpdate;
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
}
