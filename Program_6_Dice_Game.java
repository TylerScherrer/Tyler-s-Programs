import java.util.Scanner;

public class Program_6_Dice_Game {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int rounds = 0;
		int wins = 0;
		int loses = 0;
		System.out.println("       Welcome to Computer Dice!");
		System.out.println("-----------------------------------------");
		System.out.println("  ");
		System.out.println("Next the outcome of your roll will be determined:");
		System.out.println("  ");
		System.out.println("Any Quad and you win");
		System.out.println("Any Triple and you win");
		System.out.println("Any TwoPair and you win");
		System.out.println("Any Highpair (4's) and you win");
		System.out.println("Anything else and you lose!");
		System.out.println("-----------------------------------------");
		System.out.print("Do you wish to play? [Y/N]");
		String Input = stdIn.next();

		if (Input.charAt(0) == 'y' || Input.charAt(0) == 'Y') { // Reads user input, reads if "Y", "y", "yes" or "Yes"
																// are typed in by looking at the first character
			do {
				int D1 = (int) (Math.random() * 4) + 1;
				int D2 = (int) (Math.random() * 4) + 1;
				int D3 = (int) (Math.random() * 4) + 1;
				int D4 = (int) (Math.random() * 4) + 1;
				System.out.println("  Player");
				System.out.println("-----------");
				System.out.println(D1 + "  " + D2 + "  " + D3 + "  " + D4); // Prints Dice Rolls
				System.out.println("   ");
				boolean win = false;

				if (D1 == D2 && D2 == D3 && D3 == D4) // QUAD
				{
					System.out.println("Quad! You win!");
					System.out.println("   ");
					win = true; }

				else if ((D1 == D2) && (D2 == D3) || (D1 == D2) && (D2 == D4) || (D1 == D3) && (D3 == D4)
						|| (D2 == D3) && (D3 == D4)) // TRIPLE
				{
					System.out.println("Triple! You win!");
					System.out.println("   ");
					win = true; }

				else if ((D1 == D2) && (D3 == D4) || (D1 == D3) && (D2 == D4) || (D1 == D4) && (D2 == D3)) // TWO-PAIR
				{
					System.out.println("Two-Pair! You win!");
					System.out.println("   ");
					win = true;}

				else if ((D1 == 4 && D2 == 4) || ((D1 == 4 && D3 == 4)) || ((D1 == 4 && D4 == 4))
						|| ((D2 == 4 && D3 == 4)) || ((D2 == 4 && D4 == 4)) || ((D3 == 4 && D4 == 4))) {
					System.out.println("High Pair 4's! You win!");
					System.out.println("   ");
					win = true;} // HIGH PAIR

				if (win) {
					++wins; // Adds 1 Win every time the user wins a round
					System.out.print("Do you want to play again? [Y/N]");
					System.out.println("   ");
					Input = stdIn.next();}
				else {
					++loses; // Adds 1 Lose every time the user loses a round
					System.out.println("You lose!");
					System.out.println("---------------");
					System.out.print("Do you want to play again? [Y/N]"); // Prompts the user to answer if they'd like to play another round 
					System.out.println("   ");
					Input = stdIn.next();
					System.out.println("   ");}
				
			} while (Input.charAt(0) == 'y' || Input.charAt(0) == 'Y'); // Continues loop as long as the user enters
																		// "Y", "y", "yes" or "Yes"

			if (Input.charAt(0) == 'n' || Input.charAt(0) == 'N') { // Ends the loop with "N", "n", "No" or "no"

				rounds = wins + loses; // Calculates the number of rounds played by adding Wins and Loses
			}

		} else

			System.out.println("---------------------------");
		System.out.println("Game Over! Computer Dice Results: ");
		System.out.println("---------------------------");
		System.out.println("You played " + rounds + " rounds"); // Calculates the number of rounds played by adding Wins and Loses and prints it
		System.out.println("Number of Wins: " + wins); // Number of +Wins added and printed out
		System.out.println("Number of Loses: " + loses); // Number of +Loses added and printed out
		System.out.println("---------------------------");
		stdIn.close();
	}

}