package class and object5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		InputStreamReader a=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(a);
		Record r=new Record();
		byte lapno;
		String throwsmade;
		String fast;
		float time;
		lapno=Byte.parseByte(br.readLine());
		r.setLapno(lapno);
		throwsmade=br.readLine();
		r.setThrowMade(throwsmade);
		fast=br.readLine();
		r.setFastPlayer(fast);
		time=Float.parseFloat(br.readLine());
		r.setFastTime(time);
		
		System.out.println("LapNo: "+r.getLapno());
		System.out.println("Throwmade: "+r.getThrowMade());
		System.out.println("FastPlayer: "+r.getFastPlayer());
		System.out.println("FastTime: "+r.getFastTime());
		
		}

}
