package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	private ProductDao productDao = new ProductDaoImpl();

	@Override
	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter qty");
		int qty = sc.nextInt();
		Product p = new Product(id, name, qty);
		productDao.addProduct(p);
	}

	@Override
	public  List<Product> displayAll() {
		return productDao.getAllProducts();
		
	}

	@Override
	public Product searchProduct(int id) {		
		return productDao.searchById(id);
	}

	@Override
	public boolean deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}

	@Override
	public Product displayById(int id) {
		return productDao.displayById(id);
		
	}

	@Override
	public boolean modifyProduct(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("modify name as: ");
		String name = sc.next();
		System.out.println("modify qty as");
		int qty = sc.nextInt();
		boolean flag = productDao.modifyProduct(id, name, qty);
		if(flag) {
			return true;
		}
		return false;
	}
	

}
