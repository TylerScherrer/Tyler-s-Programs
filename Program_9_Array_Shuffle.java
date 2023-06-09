public class Program_9_Array_Shuffle {

	public static void main(String[] args) {
     
		int [] deck = new int[36]; // Creates the Array "deck". Holds 36 values to give us our 36 needed cards. 
      
      
     initDeck(deck);			// Initiates the deck.
     displayDeck(deck); 		// Displays the deck.
     shuffleDeck(deck);			// Creates another deck and shuffles it.
     displayDeck(deck);			// Dispays our newly created shuffled deck.
     

      
	} // End of Main Method
	
	public static int cardValue(int card) { 	// The Method cardValue takes the Element Value and divides it by 9 and checks for the remainder. It will then take the remainder and add 1 to provide our Card Value.							 
		return card % 9 + 1;			// Example: Element Value = 8; 8 % 9 = 8; 8 + 1 = 9; So we have a card value of 9. Example: Element Value = 0; 0 % 9 = 0; 0 + 1 = 1; So we have a card value of 1.
	} // End of cardValue
	
	public static String cardSuit(int card) {
		int value = card / 9;					// The Method cardSuit takes the Element Value and divides it by 9. If the quotient is between 0-1 it attaches String "C" to the cardValue to provide a suit.
		String[] suit = {"C", "S", "H", "D"};			// If the quotient is between 1-2 it attaches String "S" to the cardValue to provide a suit.
		return suit[value];					// If the quotient is between 2-3 it attaches String "H" to the cardValue to provide a suit.
	} // End of cardSuit						// If the quotient is between 3-4 it attaches String "D" to the cardValue to provide a suit.
	
	public static void shuffleDeck(int[] deck) {			// The Method shuffleDeck creates 2 random generated numbers between 1-36 and puts them into integers random and randomTwo
			System.out.println("***********************");	// The Method will then find Array Index Slots that match the random numbers generated by random and randomTwo
			for (int i = 0; i < 600; i++) {			// It will then have a integer temp hold the value of integer randomTwo, while integer randomTwo's value is swapped with integer random's value.
			int random = (int)(Math.random() * 35 - 1); 	// The value that integer temp was holding onto is then swapped into integer random to complete the full swap between the two variables.
			int randomTwo = (int)(Math.random() * 35 - 1);  // This loop runs 600 times to provide a shuffled look to the Array
			int temp = deck[randomTwo];
			deck[randomTwo] = deck[random];
			deck[random] = temp;
			}	
	} // End of shuffleDeck
	
	public static void displayCard(int card) {   // This Method combines method cardValue and method cardSuit to create an output that turns your Elements into your card values.			
		System.out.println(cardValue(card) + cardSuit(card));

	} // End of displayCard

	public static void initDeck(int[] deck) {   // This Method initiates the deck. By running the loop it fills the Array with its value in the range of 1 -> the Array length.
		for (int i = 0; i < deck.length; i++)
		deck[i] = i;
	} // End of initDeck
	
	public static void displayDeck(int[] deck) {  // This Method runs the displayCard method on every Element inside the Array. This provides you with your complete deck.
		for (int i = 0; i < 36; i++) {
			displayCard(deck[i]);	
		}
	} // End of displayDeck
	 

	
	
} // End of class
