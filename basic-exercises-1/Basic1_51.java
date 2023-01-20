import java.util.*;

public class Basic1_51 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number (string): ");
		String strNum = input.nextLine();

		int num = Integer.valueOf(strNum);

		System.out.println("Integer: " + num);
	}
}