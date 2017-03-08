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
	
	public Stop(String name, int x, int y){
            // next line is to make sure this method will work with both versions of the project
            this(name,10000);// replace with this.name=name later 
            this.x=x;
            this.y=y;	
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

