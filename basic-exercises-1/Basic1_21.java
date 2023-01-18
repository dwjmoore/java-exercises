import java.util.Scanner;

public class Basic1_21 {
	public void main() {
		long decimalNum, octalNum = 0;
		int factor = 1;

		Scanner input = new Scanner(System.in);
		System.out.print("Decimal #: ");
		decimalNum = input.nextLong();

		while (decimalNum != 0) {
			octalNum += (decimalNum % 8) * factor;
			decimalNum /= 8;
			factor *= 10;
		}

		System.out.println("Octal #: " + octalNum);
	}
}