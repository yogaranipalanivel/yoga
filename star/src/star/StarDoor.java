package star;

public class StarDoor extends Door{
	private int numberOfStar;
	public StarDoor(String doorName, int numberOfStar) {
		super(doorName);
		this.numberOfStar = numberOfStar;
	}

	public int getNumberOfStar() {
		return numberOfStar;
	}

	public void setNumberOfStar(int numberOfStar) {
		this.numberOfStar = numberOfStar;
	}

public void display()
{
	int i,j;
	for(i=1;i<=numberOfStar;i++)
	{
		for(j=numberOfStar;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println("\n");

	}
	for(i=1;i<=numberOfStar;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println("\n");
	}
	
}
}