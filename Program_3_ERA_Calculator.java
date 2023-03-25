import java.util.Scanner;

public class Program_3_ERA_Calculator {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String firstName;
		String lastName;
		int innings;
		int runs;

		System.out.print("Pitcher's first name: ");
		firstName = stdIn.next();
		System.out.print("Pitcher's last name: ");
		lastName = stdIn.next();
		System.out.print("Number of earned runs: ");
		runs = stdIn.nextInt();
		System.out.print("Number of innings pitched: ");
		innings = stdIn.nextInt();

		double earnedrun = (double) runs / innings * 9;

		String fullName = firstName + " " + lastName;

		System.out.print(fullName + " has an ERA of " + earnedrun);

	}
}
