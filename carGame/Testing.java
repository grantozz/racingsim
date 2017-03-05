package carGame;

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
		System.out.println(car1.getTime());
		System.out.println(car2.getTime());
		System.out.println(car3.getTime());
		System.out.println(car4.getTime());
		game.go();
	}
}
