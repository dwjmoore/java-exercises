public class Basic1_116 {
	public void main() {
		System.out.println(
				"Write a Java program which iterates the integers from 1 to 100. For multiples of three print 'Fizz' instead of the number and print 'Buzz' for the multiples of five. When number is divided by both three and five, print 'fizz buzz'.");

		fizzBuzz();
	}

	public void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}