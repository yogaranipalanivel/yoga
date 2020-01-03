package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	
	public static void main(String[] args)throws IOException {

		InputStreamReader a=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(a);
		TeamName tn=new TeamName();
		String team,city;
		team= br.readLine();
		 tn.setTeamName(team);
		city=br.readLine();
		 tn.setCity(city);
	
		System.out.println("TeamName: "+tn.getTeamName());
		System.out.println("City: "+tn.getCity());
		

	}

	
}
