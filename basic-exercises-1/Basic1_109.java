import java.util.Scanner;

public class Basic1_109 {
	public void main() {
		System.out.println(
				"Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.");

		Scanner input = new Scanner(System.in);

		System.out.print("n: ");
		int n = input.nextInt();

		while (n < 1) {
			System.out.println("N must be greater than 0.");
			System.out.print("n: ");
			n = input.nextInt();
		}

		createCoinCase(n);
	}

	public void createCoinCase(int n) {
		for (int k =1; k < n; k++) {
			for (int i = 1; i < k; i++) {
				System.out.print("$");
			}
			System.out.println("$");
			n -= k;
		}
		if (n > 0) {
			for (int i = 1; i < n; i++) {
				System.out.print("$");
			}
			System.out.println("$");
		}
	}
}