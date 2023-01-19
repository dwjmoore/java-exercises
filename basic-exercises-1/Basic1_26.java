import java.util.Scanner;

public class Basic1_26 {
	public void main() {
		long octalNum, decimalNum = 0, factor = 1, binaryNum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Octal #: ");
		octalNum = input.nextLong();

		while (octalNum !=0) {
			decimalNum += (octalNum % 10) * factor;
			octalNum /= 10;
			factor *= 8;
		}
		
		factor = 1;
		
		while (decimalNum != 0) {
			binaryNum += (decimalNum % 2) * factor;
			decimalNum /= 2;
			factor *= 10;
		}

		System.out.println("Binary #: " + binaryNum);
	}
}