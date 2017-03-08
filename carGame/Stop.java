/**
 * 
 * @author Ying Sun
 * Stop class describes that the stop information which includes name, distance etc
 */
public class Stop {
	private String name;
	private int x;
	private int y;
	//each stop has next stop
	private Stop next;
	private int Distance;
	
	public Stop(String name, int distance) {
		this.name = name;
		this.Distance = distance;
	}
	//getter and setter
	public String getName() {
		return name;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Stop getNext() {
		return next;
	}
	
	public void setNext(Stop next) {
		this.next = next;
	}
	
	public int getDistance() {
		return Distance;
	}
	
	public void setDistance(int distance) {
		Distance = distance;
	}
	
}

