import java.util.Scanner;

public class Basic1_35 {
	public void main() {
		double numSides, side, area;

		Scanner input = new Scanner(System.in);
		System.out.print("# of Sides: ");
		numSides = input.nextDouble();
		System.out.print("Side: ");
		side = input.nextDouble();

		area = (numSides * side * side) / (4 * Math.tan(Math.PI / numSides));

		System.out.println("Area: " + area);
	}
}