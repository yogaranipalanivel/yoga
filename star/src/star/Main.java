package star;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("1.StarDoor \n 2.GasDoor \n 3.LiquidDoor \n" );
		System.out.println("Enter your choise:");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter Name:");
		   String doorName=s.next();
		   System.out.println("Enter value:");
		   int numberOfStar=s.nextInt();
		   StarDoor sd=new StarDoor(doorName,numberOfStar);
		   sd.display();
			break;
		case 2:
			System.out.println("Enter Name:");
			String doorName1=s.next();
			System.out.println("Enter Gas:");
			String nameOfGas=s.next();
			GasDoor gd=new GasDoor(doorName1,nameOfGas);
			gd.display1();
			break;
		
		case 3: 
			System.out.println("Enter Name:");
			String doorName2=s.next();
			System.out.println("Enter value:");
			float flowQuotient=s.nextFloat();
			LiquidDoor ld=new LiquidDoor(doorName2,flowQuotient);
			ld.display2();
			break;
			 
		default:
			System.out.println("Invalid input");
				
			
		}

	}

}
