import java.util.Scanner;

public class Program_5_Bit_Calculator {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String bitString = "";        // Starts BitString off at "       "
		int resultsSoFar = 0;
		int Input;

		do {
			System.out.println("----------------------------");
			System.out.println("0 -> Shift Left, Add 0 ");
			System.out.println("1 -> Shift Left, Add 1");
			System.out.println("2 -> Exit, Evaluate");
			System.out.print("Choose an operator from the menu above : ");
			Input = stdIn.nextInt(); // Asks for Input 

			if (Input == 1) {  // Only works if Input is 1 continues to ask if anything else 

				bitString = bitString + "1";
				System.out.println("----------------------------");
				System.out.println(bitString);
				resultsSoFar = (2 * resultsSoFar + 1);           // Calculation to covert BitString to Bit 
			}

			else if (Input == 0) { // Only works if Input is 0 continues to ask if anything else 

				bitString = bitString + "0";
				System.out.println("----------------------------");
				System.out.println(bitString);
				resultsSoFar = (2 * resultsSoFar + 0);  // Calculation to covert BitString to Bit 
			}

		}

		while (Input != 2); // continues to ask if anything else 


		if (Input == 2)
		System.out.println("----------------------------");
		System.out.println(bitString + " = " + resultsSoFar);
		System.out.println("----------------------------");

		
	stdIn.close();
	}
}