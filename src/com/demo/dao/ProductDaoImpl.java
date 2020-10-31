package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
	

	static List<Product> plist;
	static {
		plist = new ArrayList<>();
		plist.add(new Product(12, "chair", 2000));
		plist.add(new Product(13, "table", 3000));
		
	}
	@Override
	public void addProduct(Product p) {
		plist.add(p);
		
	}
	@Override
	public List<Product> getAllProducts(){		
		return plist;
	}
	@Override
	public Product searchById(int id) {
		int pos = plist.indexOf(new Product(id, null, 0));
		if(pos != -1) {
			return plist.get(pos);
		}
		return null;
	}
	@Override
	public boolean deleteProduct(int id) {
		int pos = plist.indexOf(id);
		boolean flag = plist.remove(new Product(id, null, 0));
		if(flag) {
			return true;
		}
		return false;
	}
	@Override
	public Product displayById(int id) {
		int pos = plist.indexOf(new Product(id, null, 0));
		if(pos != -1) {
			return plist.get(pos);
		}
		return null;
	}
	
	@Override
	public boolean modifyProduct(int id, String name, int qty) {
		int pos = plist.indexOf(new Product(id, null, 0));
		if(pos != -1) {
			Product p = plist.get(pos);
			p.setName(name);
			p.setQty(qty);
			return true;
		}
		return false;
	}

}
