public class LoyaltyAccount {
	String memberId;
	long rewardPoints;

	void display() {
		System.out.println("Loyalty Account Details: ");
		System.out.print("Member Id: ");
		System.out.println(memberId);
		System.out.print("Points: ");
		System.out.println(rewardPoints);
		System.out.println();
	}
}