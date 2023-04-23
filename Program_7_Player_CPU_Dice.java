import java.util.Scanner;

public class Program_7_Player_CPU_Dice {

	public static void main(String[] args) {

		int wins = 0;
		int loses = 0;
		int tie = 0;
		int rounds = 0;
		String Input;

		System.out.println("    	      Welcome to Opponent Dice!");
		System.out.println("---------------------------------------------------------");
		System.out.println("  ");
		System.out.println("High beats low, and same ties");
		System.out.println("Triples beat Pairs and Junk");
		System.out.println("Pairs beat Junk");
		System.out.println("In the case of two identical Pairs - high card decides");
		System.out.println("In the case of two Junks - its a tie");
		System.out.println(" ");
		System.out.println("Woukld you like to play? [Y/N]");
		System.out.println("---------------------------------------------------------");
	
			do {
				Scanner stdIn = new Scanner(System.in);
				Input = stdIn.next();
				
				if (Input.charAt(0) == 'y' || Input.charAt(0) == 'Y') {
				
				int D1 = (int) (Math.random() * 6) + 1;
				int D2 = (int) (Math.random() * 6) + 1;
				int D3 = (int) (Math.random() * 6) + 1;
				int Human = (D1 + D2 + D3);
				System.out.println("Player");
				System.out.println("-------------");
				System.out.println(D1 + "  " + D2 + "  " + D3 + "  ");
				int D4 = (int) (Math.random() * 6) + 1;
				int D5 = (int) (Math.random() * 6) + 1;
				int D6 = (int) (Math.random() * 6) + 1;
				int CPU = (D4 + D5 + D6);
				System.out.println(" ");
				System.out.println("CPU");
				System.out.println("-------------");
				System.out.println(D4 + "  " + D5 + "  " + D6 + "  ");
				System.out.println(" ");

				if (D1 == D2 && D2 == D3) {
						if (D4 == D5 && D5 == D6) {
							if (Human > CPU) {
								System.out.println("Human Wins!");
								System.out.println(" ");
								System.out.println("Would you like to play again? [Y/N]");
								++wins;
							} else if (CPU > Human) {
								System.out.println("CPU Wins");
								System.out.println(" ");
								System.out.println("Would you like to play again? [Y/N]");
								++loses;
							}
						} else if (D4 != D5) {
							System.out.println("Human Wins");
							System.out.println(" ");
							System.out.println("Would you like to play again? [Y/N]");
							++wins;
						}
				 
				}
				else if (D4 == D5 && D5 == D6) {
					System.out.println("CPU Wins");
					System.out.println(" ");
					System.out.println("Would you like to play again? [Y/N]");
					++loses;
				}
				else if (D1 == D2 || D1 == D3 || D2 == D3) {
					if (D4 == D5 || D4 == D6 || D5 == D6) {
						if (Human >CPU) {
							System.out.println("Human Wins");
							System.out.println(" ");
							System.out.println("Would you like to play again? [Y/N]");
							++wins;
						} else if (CPU > Human) {
							System.out.println("CPU Wins");
							System.out.println(" ");
							System.out.println("Would you like to play again? [Y/N]");
							++loses;
						}
					} else if (D4 != D5 || D4 != D6 || D5 != D6) {
						System.out.println("Human Wins");
						System.out.println(" ");
						System.out.println("Would you like to play again? [Y/N]");
						++wins;
					}
				} else if (D4 == D5 || D4 == D6 || D5 == D6) {
					System.out.println("CPU Wins");
					System.out.println(" ");
					System.out.println("Would you like to play again? [Y/N]");
					++loses;
				}
				else if (D1 != D2 && D1 != D3 && D2 != D3 && D4 != D5 && D4 != D6 && D5 != D6) {
					if (Human > CPU) {
						System.out.println("Human Wins");
						System.out.println(" ");
						System.out.println("Would you like to play again? [Y/N]");
						++wins;
					} else if (CPU > Human) {
						System.out.println("CPU Wins");
						System.out.println(" ");
						System.out.println("Would you like to play again? [Y/N]");
						++loses;
				} else if (Human == CPU) {
					System.out.println("Tie");
					System.out.println(" ");
					System.out.println("Would you like to play again? [Y/N]");
					++tie;
				}
				}
				
				rounds = loses + wins + tie;
				
				}
				

				
				
			} while (Input.charAt(0) != 'n' && Input.charAt(0) != 'N');

			if (Input.charAt(0) == 'n' || Input.charAt(0) == 'N'){
			System.out.println("-------------");
			System.out.println("Game Over!");
			System.out.println("-------------");
			System.out.println("You played: " + rounds + " rounds!");
			System.out.println("You won: " + wins + " rounds!");
			System.out.println("You lost: " + loses + " rounds!");
			System.out.println("You tied with the CPU: " + tie + " times!");
			
			
		} 
	}
}