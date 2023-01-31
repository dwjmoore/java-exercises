import java.util.Scanner;

public class Basic1_108 {
	public void main() {
		System.out.println(
				"Write a Java program to add all the digits of a given positive integer until the result has a single digit.");

		Scanner input = new Scanner(System.in);

		System.out.print("Integer: ");
		int userInt = input.nextInt();

		while (userInt < 1) {
			System.out.println("The integer must be greater than 0.");
			System.out.print("Integer: ");
			userInt = input.nextInt();
		}

		addDigits(userInt);
	}

	public void addDigits(int num) {
		String strNum;
		char[] strNumArray;
		while (num > 9) {
			strNum = String.valueOf(num);
			strNumArray = strNum.toCharArray();
			num = 0;
			for (int i = 0; i < strNumArray.length; i++) {
				num += Character.getNumericValue(strNumArray[i]);
			}
		}
		System.out.println(num);
	}
}