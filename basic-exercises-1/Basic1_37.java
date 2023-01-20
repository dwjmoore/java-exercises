import java.util.Scanner;

public class Basic1_37 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("String: ");
		String str = input.nextLine();
		char[] letters = str.toCharArray();

		String reverseStr = "";
		
		for (int i = letters.length - 1; i >=0; i--) {
			reverseStr += letters[i];
		}

		System.out.println(reverseStr);
	}
}