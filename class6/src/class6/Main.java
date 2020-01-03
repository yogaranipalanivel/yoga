package class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(a);
	Player p=new Player();
	String name,position;
	name=br.readLine();
	p.setPlayername(name);
	position=br.readLine();
	p.setPlayerPosition(position);
	System.out.println("PlayerName: "+p.getPlayername());
	System.out.println("PlayerPosition: "+p.getPlayerPosition());
	
	
	
	

	}

}
