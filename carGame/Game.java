package carGame;

public class Game {
	Car[] cars ;
	private static int carNumber = 0;
	public Game() {
		cars = new Car[CarPath.pathNum];
	}
	
	public void addCar(Car car) {
		cars[carNumber++] = car;
	}
	
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
			System.out.println(cars[carNumber].getName() + " is winning the game");
		}
		
	}
}
