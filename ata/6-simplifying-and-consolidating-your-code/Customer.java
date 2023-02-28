public class Customer {
	private String name;
	private String email;
	private int age;
	private char gender;

	public Customer(
			String customerName,
			String customerEmail,
			int customerAge,
			char customerGender) {
		name = customerName;
		email = customerEmail;
		age = customerAge;
		gender = customerGender;
	}

	public void printDetails() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Email: ");
		System.out.println(email);
		System.out.print("Age: ");
		System.out.println(age);
		System.out.print("Gender: ");
		System.out.println(gender);
	}
}