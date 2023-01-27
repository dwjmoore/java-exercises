import java.util.Scanner;

public class Basic1_87 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program that takes an integer and calculates the sum of its digits. Then it will write the number of each digit of the sum in English.");

		System.out.print("Integer: ");
		int userInt = input.nextInt();

		int sumDigits = calculateSumDigits(userInt);
		writeDigits(sumDigits);
	}
	
	public int calculateSumDigits(int num) {
		String numString = String.valueOf(num);
		String[] numStringArray = numString.split("");
		int sum = 0;
		for (int i = 0; i < numStringArray.length; i++) {
			sum += Integer.valueOf(numStringArray[i]);
		}
		System.out.println("sum = " + sum);
		return sum;
	}

	public void writeDigits(int num) {
		String numString = String.valueOf(num);
		String[] numStringArray = numString.split("");
		int digit;
		for (int i = 0; i < numStringArray.length; i++) {
			digit = Integer.valueOf(numStringArray[i]);
			switch (digit) {
				case 0:
					System.out.println("zero");
	        break;
	      case 1:
	        System.out.println("one");
	        break;
	      case 2:
	        System.out.println("two");
	        break;
	      case 3:
	        System.out.println("three");
	        break;
	      case 4:
	        System.out.println("four");
	        break;
	      case 5:
	        System.out.println("five");
	        break;
	      case 6:
	        System.out.println("six");
	        break;
	      case 7:
	        System.out.println("seven");
	        break;
				case 8:
	        System.out.println("eight");
	        break;
				case 9:
	        System.out.println("nine");
	        break;
			}
		}	
	}
}