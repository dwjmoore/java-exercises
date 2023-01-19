import java.util.Scanner;

public class Basic1_34 {
	public void main() {
		double side, area;

		Scanner input = new Scanner(System.in);
		System.out.print("Side: ");
		side = input.nextDouble();

		area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));

		System.out.println("Area: " + area);
	}
}