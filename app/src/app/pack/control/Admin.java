package app.pack.control;

import java.util.List;
import java.util.Scanner;

import app.pack.dao.DAO;
import app.pack.model.Product;
import app.pack.model.User;

public class Admin {
	Scanner s=new Scanner(System.in);
	String username,password;
	
	

	public void checkLogin() {
		System.out.println("UserName:");
		username=s.next();
		System.out.println("Password:");
		password=s.next();
		
	User u=new User();
	u.setUsername(username);
	u.setPassword(password);
	int status=DAO.checkLogin(u);
	if (status!=0)
	{
		System.out.println("Login Successfull");
		System.out.println("--------------");
		Admin a=new Admin();
		a.getAdminMenu();
	}
	
	
		
	}



	private void getAdminMenu() {
		System.out.println("admin Menu \n 1.Add Product \n 2.Display Inventory \n3.LOgout");
		System.out.println();
		System.out.println("Select your option:");
		int option=s.nextInt();
		switch(option)
		{
		case 1:
			Admin a=new Admin();
			a.addProduct();
			break;
		case 2:
			Admin a1=new Admin();
			a1.displayProduct();
			break;
		case 3:
			Admin a2=new Admin();
			a2.logoutAdmin();
			break;
			
			
		}
		
	}



	private void logoutAdmin() {
		System.out.println("Logout Successfully");
		System.out.println("--------");
		
	}



	private void displayProduct() {
	List<Product>list=DAO.getAllProduct();
	System.out.println();
	System.out.println(" Product Detail");
	System.out.println("*************");
	for(Product p:list)
	{
		System.out.println("Product Id  :"+p.getId());
		System.out.println("Product Name  :"+p.getName());
		System.out.println("Product Min Quatity:"+p.getMinQua());
		System.out.println("Product Price :"+p.getPrice());
		
	}
	Admin a=new Admin();
	a.getAdminMenu();
		
	}



	private void addProduct() {
		int id;
		String name;
		int minQua;
		int price = 0;
		Product product=new Product();
		System.out.println("Enter Your ProductId:");
		id=s.nextInt();
		product.setId(id);
		System.out.println("Enter Your ProductName:");
		name=s.next();
		product.setName(name);
		System.out.println("Enter Your MinSellQuantit:");
		minQua=s.nextInt();
		product.setMinQua(minQua);
		System.out.println("Enter Price:");
		product.setPrice(price);
		price=s.nextInt();
		int status=DAO.saveProduct(product);
		if(status!=0)
			System.out.println("Inserted------");
		else
			System.out.println("Not-Inserted");
		Admin a=new Admin();
		a.getAdminMenu();
		
		
		
	}
	


}
