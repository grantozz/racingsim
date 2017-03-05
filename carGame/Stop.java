package carGame;

public class Stop {
	private String name;
	private int x;
	private int y;
	private Stop next;
	private int Distance;
	public Stop(String name, int distance) {
		this.name = name;
		this.Distance = distance;
	}
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
