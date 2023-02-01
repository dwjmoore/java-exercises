import java.util.Scanner;

public class Basic1_110 {
	public void main() {
		System.out.println(
				"Write a Java program to check whether a given integer is a power of 4 or not.");

		Scanner input = new Scanner(System.in);

		System.out.print("Integer: ");
		int userInt = input.nextInt();

		while (userInt < 1) {
			System.out.println("The integer must be greater than 0.");
			System.out.print("Integer: ");
			userInt = input.nextInt();
		}

		checkPowerOf4(userInt);
	}

	public void checkPowerOf4(int num) {
		for (int i = 1; i*i*i*i <= num; i++) {
			if (i*i*i*i == num) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}
}