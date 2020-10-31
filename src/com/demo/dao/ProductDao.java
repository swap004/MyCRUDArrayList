package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	void addProduct(Product p);

	List<Product> getAllProducts();

	Product searchById(int id);

	boolean deleteProduct(int id);

	Product displayById(int id);

	boolean modifyProduct(int id, String name, int qty);

}
