import java.util.Scanner;

public class Basic1_86 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.");

		System.out.print("Integer: ");
		int n = input.nextInt();

		processInt(n);
	}

	public void processInt(int n) {
		while (n > 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}
			System.out.println(n);
		}
		System.out.println("Done!");
	}
}