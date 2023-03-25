import java.util.Scanner;

public class Program_4_Double_Literal {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String Input;

		System.out.print("Please enter a valid (4 character) double literal  : ");
		Input = stdIn.nextLine();

		if (Input.length() == 4 && (Input.charAt(0) >= '0' && Input.charAt(0) < '9') || Input.charAt(0) == '.'
				|| Input.charAt(0) == '+' || Input.charAt(0) == '-') {
			{
				if ((Input.charAt(1) >= '0' && Input.charAt(1) <= '9') || Input.charAt(1) == '.') {

					if ((Input.charAt(2) >= '0' && Input.charAt(2) <= '9') || Input.charAt(2) == '.') {

						if (Input.charAt(0) == '.' && Input.charAt(1) == '.'
								|| (Input.charAt(0) == '.' && (Input.charAt(2) == '.')
										|| (Input.charAt(0) == '.' && Input.charAt(3) == '.'))
								|| (Input.charAt(1) == '.' && Input.charAt(2) == '.'
										|| (Input.charAt(1) == '.' && Input.charAt(3) == '.'
												|| (Input.charAt(2) == '.' && Input.charAt(3) == '.'))))

							System.out.println(Input + " is not a valid (4 character) double literal");

						else {
							if (Input.charAt(2) == '.' && (Input.charAt(3) >= '0' && Input.charAt(3) <= '9'))
								System.out.println(Input + " is a valid (4 character) double literal");
							else {
								if (Input.charAt(1) == '.' && (Input.charAt(3) >= '0' && Input.charAt(3) <= '9'))
									System.out.println(Input + " is a valid (4 character) double literal");
								else {
									if (Input.charAt(0) == '.' && (Input.charAt(3) >= '0' && Input.charAt(3) <= '9'))
										System.out.println(Input + " is a valid (4 character) double literal");
									else {
										if (Input.charAt(3) == '.'
												&& (Input.charAt(2) >= '0' && Input.charAt(2) <= '9'))
											System.out.println(Input + " is a valid (4 character) double literal");
										else
											System.out.println(Input + " is not a valid (4 character) double literal");
									}
								}
							}
						}
					}

					else
						System.out.println(Input + " is not a valid (4 character) double literal");

				}

				else {
					System.out.println(Input + " is not a valid (4 character) double literal");
				}
			}

		} else {

			System.out.println(Input + " is not a valid (4 character) double literal");
		}

	}
}