package app.pack.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.pack.dao.DAO;
import app.pack.model.History;
import app.pack.model.Product;
import app.pack.model.User;

public class Agent {

	Scanner scan = new Scanner(System.in);
	String username,password;
	List<History> history = new ArrayList<History>();
	
	public void checkAgentLogin() {
		System.out.println("Username :");
		username = scan.next();
		System.out.println("Password :");
		password = scan.next();
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		int status = DAO.checkLoginAgent(u);
		if(status != 0) {
			System.out.println("Login Successfull");
			System.out.println("-------------------------------------");
			Agent a = new Agent();
			a.getAgentMenu();
		}
	}
	
	public void getAgentMenu() {
		System.out.println("Agent Menu \n1. Buy/Sell \n2. Show History  \n3. Logout");
		System.out.println();
		System.out.println("Select your option : ");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			Agent a = new Agent();
			a.buyOrSell();
			break;
		case 2:
			showHistory(history);
			break;
		case 3:
			logout();
			break;
		}
	}
	
	private void showHistory(List<History> history) {
		for(History h :history) {
			System.out.println("Product Id		: "+h.getProduct().getId());
			System.out.println("Product Name 	: "+h.getProduct().getName());
			System.out.println("Product Price	: "+h.getProduct().getPrice());
			System.out.println("Buy / Sell		: "+h.getStatus());
			System.out.println("Total Cost 		: "+(h.getQua()*h.getProduct().getPrice()));
			System.out.println("----------------------------------------");
		}
		new Agent().getAgentMenu();
	}

	public void buyOrSell() {
		System.out.println("Enter Product Id : ");
		int id = scan.nextInt();
		System.out.println("Buy/Sell : ");
		String op = scan.next();
		System.out.println("Quantity : ");
		int qua = scan.nextInt();
		Product p = DAO.selectProductById(id);
		if(op.equalsIgnoreCase("buy")) {
			if(p.getMinQua()<qua) {
				System.out.println("Quantity Unavaiable.");
				getAgentMenu();
			}
		}
		else {
			checkout(id,op,qua);
		}
	}

	public void logout() {
		System.out.println("Logout Successfully");
		System.out.println("-----------------------------");
	}
	
	public void checkout(int id,String op,int qua) {
		if(op.equalsIgnoreCase("buy")) {
			int status = DAO.subById(id,qua);
			if(status != 0) {
				System.out.println("Buy Successfull");
				History h = new History();
				h.setProduct(DAO.selectProductById(id));
				h.setQua(qua);
				h.setStatus("BUY");
				history.add(h);
			}else {
				System.out.println("Buy Unsuccessfull");
				History h = new History();
				h.setProduct(DAO.selectProductById(id));
				h.setStatus("SELL");
				h.setQua(qua);
				history.add(h);
			}
			new Agent().getAgentMenu();
		}else if(op.equalsIgnoreCase("sell")) {
			Product p = DAO.selectProductById(id);
			int status = DAO.addById(id,qua,p.getMinQua());
			if(status != 0) {
				System.out.println("Sell Successfull");
				History h = new History();
				h.setProduct(DAO.selectProductById(id));
				h.setQua(qua);
				h.setStatus("BUY");
				history.add(h);
			}else {
				System.out.println("Sell Unsuccessfull");
				History h = new History();
				h.setProduct(DAO.selectProductById(id));
				h.setQua(qua);
				h.setStatus("SELL");
				history.add(h);
			}
			new Agent().getAgentMenu();
		}
	}
	
}



