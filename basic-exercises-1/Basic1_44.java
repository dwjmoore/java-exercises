import java.util.Scanner;

public class Basic1_44 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("Integer: ");
		long userNum = input.nextLong();

		String stringNum = String.valueOf(userNum);

		long sum = Integer.valueOf(stringNum) + Integer.valueOf(stringNum + stringNum)
				+ Integer.valueOf(stringNum + stringNum + stringNum);

		System.out.println("The sum of " + stringNum + " + " + stringNum + stringNum + " + " + stringNum + stringNum
				+ stringNum + " is " + sum + ".");
	}
}