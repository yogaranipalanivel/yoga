package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
    InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(a);
	String str1,str2;
	str1=br.readLine();
	str2=br.readLine();
	Team t=new Team(str1,str2);
	

	}

}
