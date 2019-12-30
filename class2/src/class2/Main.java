package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(a);
	String s1,s2;
	s1=br.readLine();
	s2=br.readLine();
	Player p=new Player(s1,s2);
	}

}
