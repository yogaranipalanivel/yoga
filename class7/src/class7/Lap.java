package class7;

public class Lap {
	byte LapNo;
	byte Throwsmade;
	String Player;
	float Time;
	
	public Lap(byte lapNo, byte throwsmade, String player, float time) {
		super();
		this.LapNo = lapNo;
		this.Throwsmade = throwsmade;
		this.Player = player;
		this.Time = time;
	}
	public byte getLapNo() {
		return LapNo;
	}
	public void setLapNo(byte lapNo) {
		LapNo = lapNo;
	}
	public byte getThrowsmade() {
		return Throwsmade;
	}
	public void setThrowsmade(byte throwsmade) {
		Throwsmade = throwsmade;
	}
	public String getPlayer() {
		return Player;
	}
	public void setPlayer(String player) {
		Player = player;
	}
	public float getTime() {
		return Time;
	}
	public void setTime(float time) {
		Time = time;
	}
	

}
