import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("1.DeluxeRoom \n 2.DeluxeACRoom \n 3.SuiteACRoom");
System.out.println("Enter choce:");
int n=s.nextInt(); 
switch(n)
{
case 1:
	System.out.println("Enter Hotel Name: ");
	String name=s.next();
	System.out.println("Enter room area:");
	int noofsqclaw=s.nextInt();
	System.out.println("Enter rate/sq claw:");
	int ratepersqclaw=s.nextInt();
	System.out.println("Hotel has wifi?:");
	boolean haswifi=s.hasNext();
	DeluxeRoom dr=new DeluxeRoom(name,noofsqclaw,ratepersqclaw,haswifi);
	dr.Calculatetariff();
break;
case 2:
	System.out.println("Enter hotel name:");
	String name1=s.next();
	System.out.println("Enter room area:");
	int noofsqclaw1=s.nextInt();
	System.out.println("Enter rate/sq claw:");
	int ratepersqclaw1=s.nextInt();
	System.out.println("Hotel has Ac?:");
	boolean hasac=s.hasNext();
	DeluxeACRoom dar=new DeluxeACRoom(name1,ratepersqclaw1,noofsqclaw1,hasac);
	dar.calculatetariff();
break;
case 3:
	System.out.println("Enter hotel name:");
	String name2=s.next();
	System.out.println("Enter room area:");
	int noofsqclaw2=s.nextInt();
	System.out.println("Enter rate/sq claw:");
	int ratepersqclaw2=s.nextInt();
	System.out.println("Hotel has wifi?:");
	boolean haswifi2=s.hasNext();
	System.out.println("Hotel has Ac?:");
	boolean hasac2=s.hasNext();
	SuiteACRoom sar=new SuiteACRoom(name2,ratepersqclaw2,noofsqclaw2,haswifi2,hasac2);
	sar.calculatetariff();
break;

}

}

	



	}


