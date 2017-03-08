/**
 * 
 * @author Ying Sun
 * The Game class will allow to add Car and then start the game
 *
 */
public class Game {
	Car[] cars ;
	private static int carNumber = 0;
	public Game() {
		cars = new Car[CarPath.pathNum];
	}
	
	//add car to the cars which holds by the game class.
	public void addCar(Car car) {
		cars[carNumber++] = car;
	}
	
	// only start the game if there is and only have 4 cars ready
	public void go() {
		if (carNumber != 4) {
			System.out.println("There is not enough car to run the game");
		} else {
			carNumber = 0;
			double time = cars[0].getTime();
			for (int i = 1; i < cars.length; i++) {
				if (cars[i].getTime() < time) {
					carNumber = i;
					time = cars[i].getTime();
				}
			}
			cars[carNumber].setWinner(true);
			//This will shows on the GUI
			System.out.println(cars[carNumber].getName() + " won the game!!!");
		}
	}
}
