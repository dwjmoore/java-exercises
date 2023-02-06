import java.util.LinkedList;
import java.util.Collections;

public class Basic1_121 {
	public void main() {
		System.out.println("Write a Java program to reverse a given linked list.");

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
    list.add(8);
    list.add(6);
    list.add(7);
    System.out.println(list);

		Collections.reverse(list);

		System.out.println(list);
	}
}