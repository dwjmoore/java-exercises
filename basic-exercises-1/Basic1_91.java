import java.util.Scanner;

public class Basic1_91 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a Java program to measure how long some code takes to execute in nanoseconds. .");

		System.out.print("Integer: ");
		int n = input.nextInt();

		long startTime = System.nanoTime();

		processInt(n);

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Time in nanaseconds: " + estimatedTime);
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