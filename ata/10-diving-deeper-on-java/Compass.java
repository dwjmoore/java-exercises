import java.util.Scanner;

public class Compass {
	private Scanner scanner;

	public Compass(Scanner scanner) {
		this.scanner = scanner;
	}

	public void executeDirections() {
		printDirections();
		Directions optionSelected = getNextOptionFromUser();
		handleUserSelection(optionSelected);
	}

	private void printDirections() {
		System.out.println("Which direction would you like to go?");
		for (Directions direction : Directions.values()) {
			System.out.printf("%d: %s%n", direction.getOptionNumber(), direction.getDisplayValue());
		}
	}

	private Directions getNextOptionFromUser() {
		return Directions.fromOptionNumber(getNextIntFromUser());
	}

	private int getNextIntFromUser() {
		return scanner.nextInt();
	}

	private void handleUserSelection(Directions option) {
		if (option == Directions.NORTH) System.out.println("You are going north.");
		if (option == Directions.EAST) System.out.println("You are going east.");
		if (option == Directions.SOUTH) System.out.println("You are going south.");
		if (option == Directions.WEST) System.out.println("You are going west.");
	}
}