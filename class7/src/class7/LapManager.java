package class7;

public class LapManager {
	
	public void displayAllLaps(Lap[] lapList)    
	{
	System.out.println("Lap number\tMaxmimum throws\tPlayer Name\tTiming\n");
	for(Lap m:lapList)
	{
	System.out.println(String.format("%-10s\t%-10s\t%-20s\t%-20s",m.LapNo,m.Throwsmade,m.Player,m.Time));

	}
	}
	public void  displayFastestInLap(Lap[] lapList,byte lapNo)

	{
	float max=1000;
	String fperson="";

	for(Lap m:lapList)
	{
	  if((lapNo==m.LapNo)&&(max>m.Time))
	  {
	  max=m.Time;
	 fperson=m.Player;
	  }
	 }
	System.out.println("\nFastest Player :"+fperson+"\nFastest time :"+max+"\n\n");

	}
	 public void displayMaximumThrows(Lap[] laplist)
	    {
	    byte max=0;

	for(Lap m:laplist)
	{
	  if((max<m.Throwsmade))
	  {
	  max=m.Throwsmade;
	  }
	}
	System.out.println("Max throws :"+max);

	} 

}





