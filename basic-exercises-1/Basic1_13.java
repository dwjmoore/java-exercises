import java.util.Scanner;

public class Basic1_13 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("Width: ");
		double width = input.nextDouble();
		System.out.print("Height: ");
		double height = input.nextDouble();

		double area = width * height;
		double perimeter = 2 * width + 2 * height;

		System.out.println("Area: " + area);
		System.out.println("Perimter " + perimeter);
	}
}