import java.util.Scanner;

public class Basic1_36 {
	public void main() {
		double lat1, lat2, long1, long2, distance, radius;

		Scanner input = new Scanner(System.in);
		System.out.print("Latitude 1: ");
		lat1 = Math.toRadians(input.nextDouble());
		System.out.print("Longitude 1: ");
		long1 = Math.toRadians(input.nextDouble());
		System.out.print("Latitude 2: ");
		lat2 = Math.toRadians(input.nextDouble());
		System.out.print("Longitude 2: ");
		long2 = Math.toRadians(input.nextDouble());

		radius = 6371.01;

		distance = radius
				* Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));

		System.out.println("The distance between those points is " + distance + " km.");
	}
}