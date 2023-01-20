import java.util.Scanner;

public class Basic1_53 {
	public void main() {
		Scanner in = new Scanner(System.in);
		System.out.print("First number : ");
		int x = in.nextInt();
		System.out.print("Second number: ");
		int y = in.nextInt();
		System.out.print("Third number : ");
		int z = in.nextInt();
		System.out.print("The result is: " + test(x, y, z, true));
		System.out.print("\n");
	}

	public static boolean test(int p, int q, int r, boolean abc) {
		if (abc) {
			return (r > q);
		}
		return (q > p && r > q);
	}
}