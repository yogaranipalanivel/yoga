package class7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	

	public static void main(String[] args)throws IOException {
		LapManager lm=new LapManager();
		InputStreamReader a=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(a);
		int n=Integer.parseInt(br.readLine());
		byte LapNo;
		byte Throwsmade;
		String Player;
		float Time;
		Lap l[]=new Lap[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Lap Number:");
			LapNo=Byte.parseByte(br.readLine());
			System.out.println(" Enter Throws:");
	        Throwsmade=Byte.parseByte(br.readLine());	
	        System.out.println("Enter Player Name:");
	        Player=br.readLine();
	        System.out.println("Enter Time:");
	        Time=Float.parseFloat(br.readLine());
	        l[i]=new Lap(LapNo,Throwsmade,Player,Time);
		}
		
		lm.displayAllLaps(l);
		lm.displayFastestInLap(l,(byte)103);
		lm.displayMaximumThrows(l);

		
		
		
		
				
		
		
		

	}

}
