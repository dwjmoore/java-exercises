public class Compass {
	private Directions direction;

	public void setDirection(Directions direction) {
		this.direction = direction;
	}

	public void printTravelingDirection() {
		System.out.print("You are traveling ");
		if (direction == Directions.NORTH) System.out.println("north");
		else if (direction == Directions.EAST) System.out.println("east");
		else if (direction == Directions.SOUTH) System.out.println("south");
		else System.out.println("west");
	}
}