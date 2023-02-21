import java.util.Scanner;

public class Basic1_134 {
	public void main() {
		System.out.println(
				"Write a Java program to find the distinct ways you can climb to the top (n steps to reach to the top) of stairs. Each time you can either climb 1 or 2 steps.");

		Scanner input = new Scanner(System.in);

		System.out.print("Number of Stairs: ");
		int n = input.nextInt();

		waysToClimb(n);
	}

	public void waysToClimb(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
		int[] ways = new int[n + 1];
		ways[0] = 1;
		ways[1] = 1;
		for (int i = 2; i <= n; i++) {
			ways[i] = ways[i - 1] + ways[i - 2];
		}
		System.out.println(ways[n]);
	}
}

/*
n = 2
1, 1
2
ways = 2

n = 3
1, 1, 1
2, 1
1, 2
ways = 3

n = 4
1, 1, 1, 1
1, 1, 2
2, 1, 1
1, 2, 1
2, 2
3, 1
1, 3
ways = 7

n = 5
1, 1, 1, 1, 1
2, 1, 1, 1
1, 1, 1, 2
1, 2, 1, 1
1, 1, 2, 1
2, 1, 2
1, 3, 1
2, 2, 1
1, 2, 2
3, 1, 1
1, 1, 3
3, 2
2, 3

ways = 13

n = 6
1, 1, 1, 1, 1, 1
2, 1, 1, 1, 1
1, 1, 1, 1, 2
1, 2, 1, 1, 1
1, 1, 1, 2, 1
1, 1, 2, 1, 1
2, 2, 1, 1
1, 1, 2, 2
2, 1, 2, 1
1, 2, 1, 2
2, 1, 1, 2
1, 2, 2, 1
3, 1, 1, 1
1, 1, 1, 3
1, 3, 1, 1
1, 1, 3, 1
2, 2, 2
3, 2, 1
3, 1, 2
2, 3, 1
1, 3, 2
1, 2, 3
2, 1, 3
3, 3
ways = 24

n = 7
1, 1, 1, 1, 1, 1, 1
2, 1, 1, 1, 1, 1
1, 1, 1, 1, 1, 2
1, 2, 1, 1, 1, 1
1, 1, 1, 1, 2, 1
1, 1, 2, 1, 1, 1
1, 1, 1, 2, 1, 1
2, 2, 1, 1, 1
1, 1, 1, 2, 2
1, 2, 2, 1, 1
1, 1, 2, 2, 1
2, 1, 2, 1, 1
1, 1, 2, 1, 2
2, 1, 1, 2, 1
1, 2, 1, 1, 2
2, 1, 1, 1, 2
1, 2, 1, 2, 1
3, 1, 1, 1, 1
1, 3, 1, 1, 1
1, 1, 3, 1, 1
1, 1, 1, 3, 1
1, 1, 1, 1, 3
2, 2, 2, 1
2, 2, 1, 2
2, 1, 2, 2
1, 2, 2, 2
3, 2, 1, 1
3, 1, 2, 1
3, 1, 1, 2
2, 3, 1, 1
1, 3, 2, 1
1, 3, 1, 2
1, 2, 3, 1
2, 1, 3, 1
1, 1, 3, 2
1, 1, 2, 3
1, 2, 1, 3
2, 1, 1, 3
3, 3, 1
3, 1, 3
1, 3, 3
3, 2, 2
2, 3, 2
2, 2, 3
ways = 44
*/