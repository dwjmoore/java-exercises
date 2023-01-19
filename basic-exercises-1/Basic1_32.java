import java.util.Scanner;

public class Basic1_32 {
	public void main() {
		int int1, int2;

		Scanner input = new Scanner(System.in);
		System.out.print("Integer #1: ");
		int1 = input.nextInt();
		System.out.print("Integer #2: ");
		int2 = input.nextInt();

		if (int1 == int2) {
			System.out.println(int1 + " == " + int2);
		}

		if (int1 != int2) {
			System.out.println(int1 + " != " + int2);
		}

		if (int1 > int2) {
			System.out.println(int1 + " > " + int2);
		}

		if (int1 >= int2) {
			System.out.println(int1 + " >= " + int2);
		}

		if (int1 < int2) {
			System.out.println(int1 + " < " + int2);
		}

		if (int1 <= int2) {
			System.out.println(int1 + " <= " + int2);
		}
	}
}