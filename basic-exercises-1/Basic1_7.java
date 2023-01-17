import java.util.Scanner;

public class Basic1_7 {
  public void main() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int times1 = num * 1;
		int times2 = num * 2;
		int times3 = num * 3;
		int times4 = num * 4;
		int times5 = num * 5;
		int times6 = num * 6;
		int times7 = num * 7;
		int times8 = num * 8;
		int times9 = num * 9;
		int times10 = num * 10;
		System.out.println(num + " x 1 = " + times1);
		System.out.println(num + " x 2 = " + times2);
		System.out.println(num + " x 3 = " + times3);
		System.out.println(num + " x 4 = " + times4);
		System.out.println(num + " x 5 = " + times5);
		System.out.println(num + " x 6 = " + times6);
		System.out.println(num + " x 7 = " + times7);
		System.out.println(num + " x 8 = " + times8);
		System.out.println(num + " x 9 = " + times9);
		System.out.println(num + " x 10 = " + times10);
  }
}