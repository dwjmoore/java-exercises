import java.util.Scanner;

public class Basic1_38 {
	public void main() {
		String str;

		Scanner input = new Scanner(System.in);
		System.out.print("String: ");
		str = input.nextLine();

		count(str);
	}

	public void count(String str) {
		char[] charArray = str.toCharArray();
		int letter = 0, space = 0, num = 0, other = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(charArray[i])) {
				letter++;
			} else if (Character.isDigit(charArray[i])) {
				num++;
			} else if (Character.isSpaceChar(charArray[i])) {
				space++;
			} else {
				other++;
			}
		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}
}