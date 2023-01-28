public class Basic1_90 {
	public void main() {
		System.out.println("Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.");

		// gets the value of the specified environment variable "PATH"
		System.out.println("\nEnvironment variable PATH: ");
		System.out.println(System.getenv("PATH"));

		// gets the value of the specified environment variable "TEMP"
		System.out.println("\nEnvironment variable TEMP: ");
		System.out.println(System.getenv("TEMP"));

		// gets the value of the specified environment variable "USERNAME"
		System.out.println("\nEnvironment variable USERNAME: ");
		System.out.println(System.getenv("USERNAME"));
	}
}