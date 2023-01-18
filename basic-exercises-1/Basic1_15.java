public class Basic1_15 {
	public void main() {
		int a, b, tmp;
		a = 15;
		b = 27;
		System.out.println("Before swapping: a, b = " + a + ", " + b);

		tmp = a;
		a = b;
		b = tmp;
		System.out.println("After swapping: a, b = " + a + ", " + b);
	}
}