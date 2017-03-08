/**
 * 
 * @author Ying Sun
 * The Car class contains the information of a car required, which including carPath,speed,time,name and winner 
 *
 */
public class Car {
	private CarPath carPath;
	private boolean winner;
	private double speed;
	private int time;
	private String name;
	
	//Car's constructor
	public Car(String name, CarPath carPath) {
		this.name = name;
		//generate the time randomly.
		this.time = generateTime();
		this.winner = false;
		this.carPath = carPath;
	}
	
	//getter and setter method
	public CarPath getCarPath() {
		return carPath;
	}
	
	public void setCarPath(CarPath carPath) {
		this.carPath = carPath;
	}
	
	public boolean isWinner() {
		return winner;
	}
	
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
	//Calucalte the speed based on the time
	public double getSpeed() {
		int totalDistance = 0;
		Stop[] stops = carPath.getStops();
		for (int i = 0; i < stops.length; i++) {
			totalDistance += stops[i].getDistance();
		}
		return totalDistance / this.getTime();
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public double getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	//randomly generate the time
	public int generateTime() {
		return (int) Math.ceil(Math.random() * 100 + 1); 
	}
	
	public String getName() {
		return name;
	}
}
