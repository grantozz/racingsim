package carGame;

public class CarPath {
	private static Stop[] stops;
	public static int pathNum = 4;
	public CarPath() {
		stops = generatePath();
	}
	
	public Stop getStartPosition() {
		return stops[0];
	}

	public static Stop[] generatePath() {
		Stop stopa = new Stop("A", 7000);
		Stop stopb = new Stop("B", 8000);
		Stop stopc = new Stop("C", 9000);
		Stop stopd = new Stop("D", 10000);
		Stop[] stops = new Stop[CarPath.pathNum];
		stopa.setNext(stopb);
		stopb.setNext(stopc);
		stopc.setNext(stopd);
		stopd.setNext(stopa);
		stops[0] = stopa;
		stops[1] = stopb;
		stops[2] = stopc;
		stops[3] = stopd;
		return stops;
	}
	public Stop[] getStops(){
		return stops;
	}
}
