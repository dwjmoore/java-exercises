import java.util.Scanner;

public class Basic1_33 {
	public void main() {
		long integer, sum = 0;
		
    Scanner input = new Scanner(System.in);
		System.out.print("Integer: ");
		integer = input.nextInt();
		
		while (integer != 0) {
			sum += (int) (integer % 10);
			integer /= 10;
		}

		System.out.println("Sum: " + sum);
	}
}