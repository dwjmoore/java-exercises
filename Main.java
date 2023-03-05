public class Main {
	public static void main(String[] args) {
		Directions direction = Directions.valueOf("NORTH");
		Compass compass = new Compass();
		compass.setDirection(direction);
		compass.printTravelingDirection();
	}
}
