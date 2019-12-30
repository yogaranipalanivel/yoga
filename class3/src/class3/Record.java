package class3;

public class Record {
	byte matchesPlayed;
	byte numOfWins;
	byte numOfLosses;
	float avgLapSpeed;
	float maxLapSpeed;
	float avgThrowDistance;
	float maxThrowDistance;
	
	public Record(byte matchesPlayed, byte numOfWins, byte numOfLosses,
			float avgLapSpeed, float maxLapSpeed, float avgThrowDistance,
			float maxThrowDistance) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.numOfWins = numOfWins;
		this.numOfLosses = numOfLosses;
		this.avgLapSpeed = avgLapSpeed;
		this.maxLapSpeed = maxLapSpeed;
		this.avgThrowDistance = avgThrowDistance;
		this.maxThrowDistance = maxThrowDistance;
	}

	public void display(){
	
		        System.out.println("matchesPlayed "+this.matchesPlayed);
		        System.out.println("numOfWins "+this.numOfWins);
				System.out.println("numOfLosses "+this.numOfLosses);
				System.out.println("avgLapSpeed "+ this.avgLapSpeed);
				System.out.println("maxLapSpeed "+this.maxLapSpeed);
				System.out.println("avgThrowDistance "+this.avgThrowDistance);
				System.out.println("maxThrowDistance "+this.maxThrowDistance);
	
	
	}




	}
   
	
   
   

