package com.demo.bean;

public class Product {
	private int id;
	private String name;
	private int qty;
	
	//default constructor
	public Product() {
		super();
	}
	
	//parameterized constructor
	public Product(int id, String name, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
	}
	
	public boolean equals(Object ob) {
		if(id ==((Product)ob).id) {
			return true;
		}
		return false;
	}
	
	//getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + "]";
	}
	

}
