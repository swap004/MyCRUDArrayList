package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestCrudOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int choice = 0;		
		//service class object to call methods of service layer
		ProductService productService = new ProductServiceImpl();
		//switch-case for all options
		do{
			System.out.println("1.add\n2.search\n3.display all\n4.delete\n5.display by id\n6.modify\n7.exit");
			System.out.println("choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				productService.addProduct();
				System.out.println("Product added");
				break;
			case 2:
				System.out.println("enter id");
				int id = sc.nextInt();
				Product p = productService.searchProduct(id);
				if(p != null) {
					System.out.println(p);
				}
				else {
					System.out.println("Product with id: " + id+" not found");
				}
				break;
			case 3:
				List<Product>plist = productService.displayAll();
				for(Product p1:plist) {
					System.out.println(p1);
				}
				break;
			case 4:
				System.out.println("enter id");
				id = sc.nextInt();
				boolean flag = productService.deleteProduct(id);
				if(flag) {
					System.out.println("Product with id: " + id + " is deleted");
				}
				else {
					System.out.println("Product with the id: "+ id+" not found");
				}
				break;
			case 5:
				System.out.println("enter id");
				id = sc.nextInt();
				p = productService.displayById(id);
				if(p != null) {
					System.out.println(p);
				}
				else {
					System.out.println("Product with id: " + id+" not found");
				}
				break;
			case 6:
				System.out.println("enter id");
				id = sc.nextInt();
				flag = productService.modifyProduct(id);
				if(flag) {
					System.out.println("Product with id: " + id + " is modified");
				}
				else {
					System.out.println("Product with the id: "+ id+" not found");
				}
				break;
			case 7:
				sc.close();
				System.exit(0);
				break;

			}
		}while(choice!=7);
	}

}
