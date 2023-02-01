import java.util.Scanner;

public class Basic1_111 {
	public void main() {
		System.out.println(
				"Write a Java program to add two numbers without using any arithmetic operators.");

		Scanner input = new Scanner(System.in);

		System.out.print("Integer 1: ");
		int int1 = input.nextInt();
		System.out.print("Integer 2: ");
		int int2 = input.nextInt();

		while (int1 < 0 || int2 < 0) {
			System.out.println("The integers must be greater than 0.");
			System.out.print("Integer 1: ");
			int1 = input.nextInt();
			System.out.print("Integer 2: ");
			int2 = input.nextInt();
		}

		while (int2 != 0) {
			int carry = int1 & int2; //Bitwise AND
			int1 = int1 ^ int2; //Bitwise XOR
			int2 = carry << 1; //Left shift operator
		}
		System.out.println("Sum: " + int1);
	}
}


// carry = 5 (0101) & 8 (1000)
//  	0101
//	&	1000 => carry = 0 (0000)

// int1 = 5 (0101) ^ 8 (1000)
//		0101
//	^ 1000 => int1 = 13 (1101)

// int2 = 0 (0000) << 1 => int2 = 0 (0000)



// carry = 23 (10111) & 7 (00111)
//   	10111
//	&	00111 => carry = 7 (00111)

// int1 = 23 (10111) ^ 7 (00111)
//		10111
//	&	00111 => int1 = 16 (10000)

// int2 = 7 (00111) << 1 => int2 = 14 (01110)

// carry = 16 (10000) & 14 (01110)
//		10000
//	& 01110 => carry = 0 (00000)

// int1 = 16 (10000) ^ 14 (01110)
//		10000
//	^	01110 => int1 = 30 (11110)

// int2 = 0 (00000) << 1 => int2 = 0 (00000)