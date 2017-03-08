/**
 * 
 * @author Ying Sun
 * This is a testing class before we have the gui ready
 */
public class Testing {
	public static void main(String[] args) {
		CarPath carPath = new CarPath();
		Car car1 = new Car("carA", carPath);
		Car car2 = new Car("carB", carPath);
		Car car3 = new Car("carC", carPath);
		Car car4 = new Car("carD", carPath);
		Game game = new Game();
		game.addCar(car1);
		game.addCar(car2);
		game.addCar(car3);
		game.addCar(car4);
		System.out.println("carA: " + car1.getTime() + "s");
		System.out.println("carB: " + car2.getTime() + "s");
		System.out.println("carC: " + car3.getTime() + "s");
		System.out.println("carD: " + car4.getTime() + "s");
		game.go();
	}
}
