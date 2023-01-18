import java.util.Scanner;

public class Basic1_22 {
	public void main() {
		long binaryNum, decimalNum = 0, factor = 1;

		Scanner input = new Scanner(System.in);
		System.out.print("Binary #: ");
		binaryNum = input.nextLong();

		while (binaryNum != 0) {
			decimalNum += (binaryNum % 10) * factor;
			binaryNum /= 10;
			factor *= 2;
		}

		System.out.println("Decimal # " + decimalNum);
	}
}