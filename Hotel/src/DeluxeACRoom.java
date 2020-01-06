
public class DeluxeACRoom extends DeluxeRoom {
	private static boolean haswifi;
	private static int ratepersqclaw;
	private static int noofsqclaw;
	private static String name;
	private int ratepersqclaw1;
	private int noofsqclaw1;
	private boolean hasac;
	
	
	public DeluxeACRoom(String name, int ratepersqclaw, int noofsqclaw,
			boolean haswifi) {
		super(name, ratepersqclaw, noofsqclaw, haswifi);
		this.ratepersqclaw1 = ratepersqclaw1;
		this.noofsqclaw1 = noofsqclaw1;
		this.hasac = hasac;
	}


	public boolean isHaswifi() {
		return haswifi;
	}


	public void setHaswifi(boolean haswifi) {
		DeluxeACRoom.haswifi = haswifi;
	}


	public int getRatepersqclaw() {
		return ratepersqclaw;
	}


	public void setRatepersqclaw(int ratepersqclaw) {
		DeluxeACRoom.ratepersqclaw = ratepersqclaw;
	}


	public int getNoofsqclaw() {
		return noofsqclaw;
	}


	public void setNoofsqclaw(int noofsqclaw) {
		DeluxeACRoom.noofsqclaw = noofsqclaw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		DeluxeACRoom.name = name;
	}


	public int getRatepersqclaw1() {
		return ratepersqclaw1;
	}


	public void setRatepersqclaw1(int ratepersqclaw1) {
		this.ratepersqclaw1 = ratepersqclaw1;
	}


	public int getNoofsqclaw1() {
		return noofsqclaw1;
	}


	public void setNoofsqclaw1(int noofsqclaw1) {
		this.noofsqclaw1 = noofsqclaw1;
	}


	public boolean isHasac() {
		return hasac;
	}


	public void setHasac(boolean hasac) {
		this.hasac = hasac;
	}
	public void calculatetariff()
	{
	System.out.println("Hotel pteradise");
	boolean a=true;
	if(Boolean.compare(hasac,a)==0)
	{
	int tot=ratepersqclaw1+50;
	System.out.println("Amount:"+tot);
	
	}
	else if(Boolean.compare(haswifi,a)==1)
	{
	System.out.println("Amount:"+ratepersqclaw1);
	}
	}
}


