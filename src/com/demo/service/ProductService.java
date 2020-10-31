package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct();

	List<Product> displayAll();

	Product searchProduct(int id);

	boolean deleteProduct(int id);

	Product displayById(int id);

	boolean modifyProduct(int id);
	
}
