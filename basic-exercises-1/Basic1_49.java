import java.util.Scanner;

public class Basic1_49 {
	public void main() {
		long num;

		Scanner input = new Scanner(System.in);
		System.out.print("Integer: ");
		num = input.nextLong();

		if (num % 2 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}