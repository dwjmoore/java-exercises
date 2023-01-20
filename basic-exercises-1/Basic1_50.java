public class Basic1_50 {
	public void main() {
		int[] three = new int[40], five = new int[25], threeFive = new int[10];
		int j = 0, k = 0, l = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				three[j++] = i;
			}
			if (i % 5 == 0) {
				five[k++] = i;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				threeFive[l++] = i;
			}
		}

		System.out.println("Divided by 3:");
		for (int m = 0; m < j; m++) {
			System.out.print(three[m] + ", ");
		}
		System.out.println("\n");

		System.out.println("Divided by 5:");
		for (int n = 0; n < k; n++) {
			System.out.print(five[n] + ", ");
		}
		System.out.println("\n");

		System.out.println("Divided by 3 & 5:");
		for (int o = 0; o < l; o++) {
			System.out.print(threeFive[o] + ", ");
		}
		System.out.println("\n");
	}
}