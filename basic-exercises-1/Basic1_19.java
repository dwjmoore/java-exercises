import java.util.Scanner;

public class Basic1_19 {
	public void main() {
		long integer, binaryNum = 0, factor = 1;
		int[] binaryArray = new int[20];
		int i = 0, j = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Integer: ");
		integer = input.nextLong();

		while (integer != 0) {
			binaryArray[i++] = (int) (integer % 2);
			integer /= 2;
		}

		while (j < i) {
			binaryNum += binaryArray[j++] * factor;
			factor *= 10;
		}

		System.out.println("Binary: " + binaryNum);
	}
}