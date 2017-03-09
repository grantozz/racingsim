import javafx.animation.PathTransition;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * 
 * @author Ying Sun
 * The Car class contains the information of a car required, which including carPath,speed,time,name and winner 
 *
 */
public class Car extends Rectangle{
	PathTransition pathTransition = new PathTransition();
	private CarPath carPath;
	private boolean winner;
	private double time;
	private String name;
	
	//Car's constructor
	public Car(String name) {
		super(40, 20);
		this.carPath = new CarPath();
		this.setX(carPath.getStops()[0].getX());
		this.setY(carPath.getStops()[0].getY());
		this.name = name;
		//generate the time randomly.
		this.time = generateTime();
		this.winner = false;
		setPt();
	}
	
	//set up path Transition
	public final void setPt(){
	    pathTransition.setDuration(Duration.seconds(time));
	    pathTransition.setPath(carPath);
	    pathTransition.setNode(this);
	    pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);               
	}
	
	//cars begin to race
	public void go(){
		pathTransition.play();
	}
	
	//getter and setter method
	public CarPath getPath() {
		return carPath;
	}
	
	public void setCarPath(CarPath carPath) {
		this.carPath = carPath;
	}
	
	public PathTransition getPathTransition(){
        return pathTransition;
    }
	
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
	public boolean getWinner(){
		return winner;
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
	
	public double getTime() {
		return time;
	}
	
	//randomly generate the time
	public double generateTime() {
		return (double)(Math.random() * 10 + 1); 
	}
	
	public String getName() {
		return name;
	}
}
