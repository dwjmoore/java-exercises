import java.util.Scanner;

public class Basic1_11 {
  public void main() {
		Scanner input = new Scanner (System.in);
		System.out.print("Radius: ");
		double radius = input.nextDouble();

		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
    System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
  }
}