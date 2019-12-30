package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(a);
	byte matches;
	byte Wins;
	byte Losses;
	float avgSpeed;
	float maxSpeed;
	float avgDistance;
	float maxDistance;
	matches=Byte.parseByte(br.readLine());
	Wins=Byte.parseByte(br.readLine());
	Losses=Byte.parseByte(br.readLine());
	avgSpeed=Byte.parseByte(br.readLine());
	maxSpeed=Float.parseFloat(br.readLine());
	avgDistance=Float.parseFloat(br.readLine());
	maxDistance=Float.parseFloat(br.readLine());
	Record r=new Record(matches,Wins,Losses,avgSpeed,maxSpeed,avgDistance,maxDistance);
	r.display();
	
	
	


	}

}
