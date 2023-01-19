import java.util.Scanner;

public class Basic1_25 {
	public void main() {
		long octalNum, decimalNum = 0, factor = 1;

		Scanner input = new Scanner(System.in);
		System.out.print("Octal #: ");
		octalNum = input.nextLong();

		while (octalNum != 0) {
			decimalNum += (octalNum % 10) * factor;
			octalNum /= 10;
			factor *= 8;
		}

		System.out.println("Decimal #: " + decimalNum);
	}
}