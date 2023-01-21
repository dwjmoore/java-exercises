import java.util.Scanner;

public class Basic1_59 {
	public void main() {
		System.out.println("Write a Java program to convert a given string into lowercase.");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();

		str = str.toLowerCase();
		System.out.println(str);
	}
}