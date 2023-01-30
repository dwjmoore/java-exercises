public class Basic1_99 {
	public void main() {
		System.out.println(
				"Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers.");

		int[] array = { 5, 4, 5, 3, 5, 4, 5, 4, 5 };
		int num = 4;

		boolean result = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != num && array[i + 1] != num) {
				result = false;
				break;
			}
		}

		System.out.println(result);

	}
}