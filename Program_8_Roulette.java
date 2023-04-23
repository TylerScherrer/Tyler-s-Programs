import java.util.Scanner;

public class Program_8_Roulette {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int chipsNow = 100;
		int menu;
		int spinNum = 0;

		welcome(); 	// Uses welcome method to welcome the user to roulette game

		do {
			menu = getMenuChoice(stdIn); // Asks the user for an input on which type of bet they would like to make. 1 for number, 2 for color or 3 to cash out.

			if (menu == 1) { // If the user inputs 1 to make a number bet, it will follow into the If statement 
				int number = getNumber(stdIn); // Since the user wants to make a number bet, the getNumber method will ask which number they want to place a bet on 
				System.out.println("\nYou choose to bet on: " + number);
				if (menu == 1) {
					int chips = getBet(stdIn, chipsNow); // uses getBet method to ask the user for their bet between 1 and current chip count

					if (menu == 1) {

						determineColor(spinNum); // uses determineColor method to determine spin number 
						if (spinNum == number) { // if the number the user bet on equals the spin number, bet is multipled by 35
							chips *= 35;
							chipsNow += chips;
							System.out.println("\nCongrats, you won!");
							System.out.println("You have " + chipsNow + " chips now!");	
						}

						if (spinNum == 1) {
							 if (spinNum == number){
								 chipsNow += chips;
								 System.out.println("Congrats, you won!");
								 System.out.println("You have " + chipsNow + " chips now!");
							 }

						} else {

							System.out.println("Sorry, you lost!");

							chipsNow -= chips; // If the spin number is not which the user bet on, subtracts bet from chip count
							System.out.println("You now have: " + chipsNow + " chips");
						}
					}
				}
			}

			if (menu == 2) { // if the user wanted to make a color bet goes down this If statement tree
				String color = getColor(stdIn);  // uses getColor method to ask the user for the color they wish to bet on 
				int chips = getBet(stdIn, chipsNow); // uses getBet method to ask user for their bet from 1 to current chip count 
				String rolledColor = determineColor(spinNum); // determines the color of the spin 
				if (color.charAt(0) == 'r' || color.charAt(0) == 'R') { // Uses getColor method to check what was returned, if Red was returned for Red goes down this If tree

					if (rolledColor.charAt(0) == 'r' || rolledColor.charAt(0) == 'R') { // uses determineColor method to spin for a color, then checks if the color that was spun matches the color that was bet on 
						chipsNow += chips;												// if you bet on Red and it landed on Red it adds your bet to your chip count 
						System.out.println("Congrats, you won!"); 
						System.out.println("You have " + chipsNow + " chips now!");
					} else if (rolledColor.charAt(0) == 'b' || rolledColor.charAt(0) == 'B') { // if you bet on Red and it landed on Black it subtracts your bet from your chip count
						chipsNow -= chips;
						System.out.println("Sorry, you lost!");
						System.out.println("You have " + chipsNow + " chips now!");
					} else if (rolledColor.charAt(0) == 'G' || rolledColor.charAt(0) == 'g') { // if it lands on 0 and is green, you lose and it subtracts your bet from your chip count 
						chipsNow -= chips;
						System.out.println("Sorry, you lost!");
						System.out.println("You have " + chipsNow + " chips now!");
					}
				}

				else if (color.charAt(0) == 'b' || color.charAt(0) == 'B') { // uses getColor method to check what was returned, if Black was returned for Black goes down this If tree
					if (rolledColor.charAt(0) == 'b' || rolledColor.charAt(0) == 'B') { // uses determineColor method to spin for a color, then checks if the color that was was spun matches that color that was bet on 
						chipsNow += chips;												// if you bet on Red and it landed on Red it adds your bet to your chip count 
						System.out.println("Congrats, you won!");
						System.out.println("You have " + chipsNow + " chips now!");

					} else if (rolledColor.charAt(0) == 'r' || rolledColor.charAt(0) == 'R') { // if you bet Black and it landed on Red it subtracts your bet from your chip count
						chipsNow -= chips;
						System.out.println("Sorry, you lost!");
						System.out.println("You have " + chipsNow + " chips now!");

					} else if (rolledColor.charAt(0) == 'G' || rolledColor.charAt(0) == 'g') { // if it lands on 0 and is green, you lose and it subtracts your bet from your chip count 
						chipsNow -= chips;
						System.out.println("Sorry, you lost!");
						System.out.println("You have " + chipsNow + " chips now!");
					}
				}
			}

			if (menu == 3) { // if user inputs 3, cashes out and applies report method
				report(chipsNow); // Uses the Report method to output final results 
			}

		} while (menu == 2 || menu == 1 || menu != 3);
	}

	public static void welcome() {										// Welcomes the user to the roulette game
		System.out.println("############################");
		System.out.println("#   Welcome to Roulette    #");
		System.out.println("############################");
		System.out.println("# Number Bets Payout: 35:1 #");
		System.out.println("#  Color Bets Payout: 1:1  #");
		System.out.println("############################\n");
		System.out.println("You have 100 chips!");

	}

	public static int getMenuChoice(Scanner stdIn) {					// This method asks the user which type of bet they would like to make.
		System.out.println("\n1. Pick a number to bet on");				// 1 for a number bet
		System.out.println("2. Pick a color to bet on");				// 2 for a color bet
		System.out.println("3. Cash out");								// 3 to cash out
		System.out.println("");											// Runs until correct input is given 
		System.out.print("Enter Choice [1-3] \n");
		int gameType = stdIn.nextInt();
		if (gameType == 1) {
			return gameType;
		}
		if (gameType == 2) {
			return gameType;
		}
		if (gameType == 3) {
			return gameType;
		} else
			return 0;
	}

	public static int getNumber(Scanner stdIn) {						// This method asks for the number the user wishes to bet on.
		System.out.print("Please bet on a number between [1 - 36] ");	// Gives a range of 1-36 to choose from
		int Number = stdIn.nextInt();									// If input is not inside the number range, asks until correct input is given
		if (Number <= 36 && Number >= 1) {
			return Number;
		}
		do {
			System.out.print("Please bet on a number between [1 - 36] ");
			Number = stdIn.nextInt();
		} while (Number > 36 || Number < 1);
		return Number;
	}

	public static String getColor(Scanner stdIn) {						// This method asks the user for the color they wish to bet on.
		System.out.print("Please choose a color. Red or Black ");		// Checks the first character of the input for 'b', 'B', 'r' or 'R' for a Red or Black bet
		String Color = stdIn.next();									// If input is not Red or Black, runs until correct input is given

		if (Color.charAt(0) == 'b' || Color.charAt(0) == 'B') {
			System.out.println("\nYou choose Black!");
			return Color;
		}
		if (Color.charAt(0) == 'r' || Color.charAt(0) == 'R') {
			System.out.println("\nYou choose Red!");
			return Color;
		}
		do {
			System.out.print("Please choose a color. Red or Black ");
			Color = stdIn.next();
		} while (Color.charAt(0) != 'r' && Color.charAt(0) != 'R' && Color.charAt(0) != 'b' && Color.charAt(0) != 'B');

		return Color;
	}
	
	public static int getBet(Scanner stdIn, int chipsNow) {									// This method gets the users bet
		System.out.print("\nHow many chips do you want to bet? [1 - " + chipsNow + "] ");   // Sends a prompt that asks the user for a bet between 1 and their current chip count
		int Chips = stdIn.nextInt();														// If the bet is within 1 and their current chip count, approves the bet.
		if (Chips >= 0 && Chips < chipsNow) {												// If the bet is outside this range, asks until a correction input is given
			System.out.println("\nYou have bet: " + Chips + " chips!");

			return Chips;
		}
		do {
			System.out.print("How many chips do you want to bet? [1 - " + chipsNow + "] ");
			Chips = stdIn.nextInt();
		} while (Chips < 0 || Chips > chipsNow);

		return Chips;
	}

	public static String determineColor(int spinNum) {										// This method determines the color and the number of the roulette spin
																							// Uses the Math.random API to generate a random number
		System.out.println("\nSpinning the wheel....");										// That number is then multiplied by 37 to fit within the 1 - 36 number range
		double spinNumber = Math.random();													// If the number is even by having a remainder of 0 it is considered a red space
		spinNum = (int) (spinNumber * 37) + 0;												// If the number is odd by having a remainder it is considered a black space
																							// If the number generated is 0, it is considered a green space
		if (spinNum % 2 == 0 && spinNum != 0) {
			System.out.println("Spin number : " + spinNum);
			System.out.println("Spin color : Red!\n");
			return "Red";
		}

		else if (spinNum % 2 != 0) {
			System.out.println("Spin number :" + spinNum);
			System.out.println("Spin color : Black!\n");
			String Black = "Black";
			return Black;
		} else if (spinNum == 0) {
			System.out.println("Spin number :" + spinNum);
			System.out.println("Spin color: Green!\n");
			return "Green";
		}

		return "neither";

	}

	public static void report(int chipsNow) {													// This method reports the final results
		if (chipsNow > 100) {																	// Calculates your current chip count to your starting chip count to find your difference gained or lost
			chipsNow -= 100;
			System.out.println("Thanks for playing! You won a total of " + chipsNow + " chips! You ended with "
					+ chipsNow + " chips!");
		} else if (chipsNow < 100) {
			int start = 100;
			start -= chipsNow;
			System.out.println("Thanks for playing! You lost a total of " + start + " chips! You ended with " + chipsNow
					+ " chips!");
		} else if (chipsNow == 100) {
			System.out.println("Thanks for playing! You won 0 chips! You ended with " + chipsNow + " chips!");
		}

	}

}