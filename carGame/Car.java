package carGame;

public class Car {
	private CarPath carPath;
	private boolean winner;
	private int speed;
	private double time;
	private String name;
	public Car(String name, CarPath carPath) {
		this.name = name;
		this.speed = generateSpeed();
		this.winner = false;
		this.carPath = carPath;
	}
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
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getTime() {
		double time = 0;
		Stop[] stops = carPath.getStops();
		for (int i = 0; i < stops.length; i++) {
			time += stops[i].getDistance() / this.getSpeed();
		}
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public int generateSpeed() {
		return (int) Math.ceil(Math.random() * 1000 + 1); 
	}
	
	public String getName() {
		return name;
	}
	public void go() {
		
	}
	
}
