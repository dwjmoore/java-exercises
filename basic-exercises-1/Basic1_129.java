public class Basic1_129 {
	public void main() {
		System.out.println(
				"Write a Java program to find a number that appears only once in a given array of integers; all other numbers occur twice.");

		int[] array = {5, 1, 5, 3, 7, 1, 3, 4, 4};
		System.out.print("array = ");
		printArray(array);

		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result ^= array[i];
		}
		System.out.println(result);
	}

	public void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}
}