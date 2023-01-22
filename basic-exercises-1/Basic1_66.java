import java.util.Scanner;

public class Basic1_66 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a Java program to compute the sum of the first 100 prime numbers.");

		while (true) {

			System.out.println("The sum of the first 100 prime numbers is " + sumOfPrimes() + ".");

			System.out.print("Do you want to play again? Enter Y or N: ");
			char answer = input.next().charAt(0);

			if (answer == 'N' || answer == 'n') {
				break;
			}
		}

		System.out.println("Goodbye!");
	}

	public long sumOfPrimes() {
		long[] primeArray = new long[100];
		primeArray[0] = 2;
		int i = 1, num = 2;
		long sum = 0;

		while (i < 100) {
			num++;
			if (num % 2 != 0) {
				if (checkPrime(num)) {
					primeArray[i++] = num;
				}
			}
		}

		for (int j = 0; j < primeArray.length; j++) {
			System.out.println(primeArray[j]);
			sum += primeArray[j];
		}

		return sum;
	}

	public boolean checkPrime(long num) {
		for (long i = 3; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}