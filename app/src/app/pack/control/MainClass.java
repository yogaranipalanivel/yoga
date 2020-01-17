package app.pack.control;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("1.Admin Login\n 2.Agent Login \n3.Exit");
	int n=s.nextInt();
	switch(n) {
	case 1:
	
		Admin admin=new Admin();
		admin.checkLogin();
		break;
	case 2:
		break;
	case 3:
	break;

	
	}
	}
	public void exit()
	{
		System.out.println("Application exit");
	}
	

	}


