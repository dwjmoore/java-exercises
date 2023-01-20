import java.util.Scanner;

public class Basic1_55 {
	public void main() {
		long minutes, seconds, H, M, S;

		Scanner input = new Scanner(System.in);
		System.out.print("Input seconds: ");
		seconds = input.nextLong();
		minutes = seconds / 60;

		S = seconds % 60;
		M = minutes % 60;
		H = minutes / 60;

		System.out.println(H + ":" + M + ":" + S);
	}
}