
public class DeluxeRoom extends HotelRoom {
	protected int ratepersqclaw;
	protected int noofsqclaw;
	protected boolean haswifi;

	public DeluxeRoom(String name, int ratepersqclaw, int noofsqclaw,
			boolean haswifi) {
		super(name);
		this.ratepersqclaw = ratepersqclaw;
		this.noofsqclaw = noofsqclaw;
		this.haswifi = haswifi;
	}
	
	public int getRatepersqclaw() {
		return ratepersqclaw;
	}

	public void setRatepersqclaw(int ratepersqclaw) {
		this.ratepersqclaw = ratepersqclaw;
	}

	public int getNoofsqclaw() {
		return noofsqclaw;
	}

	public void setNoofsqclaw(int noofsqclaw) {
		this.noofsqclaw = noofsqclaw;
	}

	public boolean isHaswifi() {
		return haswifi;
	}

	public void setHaswifi(boolean haswifi) {
		this.haswifi = haswifi;
	}

	public void Calculatetariff()
	{
		System.out.println("Hotel pteradise");
		boolean a=true;
		if(Boolean.compare(haswifi,a)==0)
		{
		int tot=ratepersqclaw+10;
		System.out.println("Amount:"+tot);

		}
		else if(Boolean.compare(haswifi,a)==1)
		{
		System.out.println("Amount:"+ratepersqclaw);
		}

	}
	}


	


