
public class SuiteACRoom extends HotelRoom{
	private int ratepersqclaw2;
	private int noofsqclaw2;
	private boolean haswifi2;
	private boolean hasac2;

	public SuiteACRoom(String name2, int ratepersqclaw2, int noofsqclaw2, boolean haswifi2,
			boolean hasac2) {
		super(name);
		this.ratepersqclaw2 = ratepersqclaw2;
		this.noofsqclaw2 = noofsqclaw2;
		this.haswifi2 = haswifi2;
		this.hasac2 = hasac2;
	}

	public int getRatepersqclaw2() {
		return ratepersqclaw2;
	}

	public void setRatepersqclaw2(int ratepersqclaw2) {
		this.ratepersqclaw2 = ratepersqclaw2;
	}

	public int getNoofsqclaw2() {
		return noofsqclaw2;
	}

	public void setNoofsqclaw2(int noofsqclaw2) {
		this.noofsqclaw2 = noofsqclaw2;
	}

	public boolean isHaswifi2() {
		return haswifi2;
	}

	public void setHaswifi2(boolean haswifi2) {
		this.haswifi2 = haswifi2;
	}

	public boolean isHasac2() {
		return hasac2;
	}

	public void setHasac2(boolean hasac2) {
		this.hasac2 = hasac2;
	}
	public void calculatetariff()
	{
	System.out.println("Hotel pteradise");
	boolean a=true;
	if(Boolean.compare(haswifi2,a)==0)
	{
	int tot=ratepersqclaw2+75;
	System.out.println("Amount:"+tot);
	
	}
	else if(Boolean.compare(hasac2,a)==0)
	{
	int tot=ratepersqclaw2+50;
	System.out.println("Amount:"+tot);

	}
	else if(Boolean.compare(haswifi2,a)==1)
	{
	System.out.println("Amount:"+ratepersqclaw2);
	}
}
}

		


