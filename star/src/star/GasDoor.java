package star;

public class GasDoor extends Door {
	private String nameOfGas;
	public GasDoor(String doorName, String nameOfGas) {
		super(doorName);
		this.nameOfGas = nameOfGas;
	}
	public String getNameOfGas() {
		return nameOfGas;
	}

	public void setNameOfGas(String nameOfGas) {
		this.nameOfGas = nameOfGas;
	}
public void display1()

{
	
	String reverse=" ";
    int length=nameOfGas.length();
    for(int i=length-1;i>=0;i--)
	{
	    reverse = reverse + nameOfGas.charAt(i);
	}
	if(nameOfGas.equals(reverse))
    	System.out.println("Palindrome,Forever");
    	else
    	
        	System.out.println("Not a Palindrome");
}
}
	


