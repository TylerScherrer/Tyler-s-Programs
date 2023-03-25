import java.util.Scanner;

public class Program_2_Room_Area {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		String units = "meters ";
		char space = ' ';

		double FloorSurfaceArea;
		double WallsTotalArea;

		System.out.print("Given a length of ");
		double Length = stdIn.nextDouble();
		System.out.print("a width of ");
		double Width = stdIn.nextDouble();
		System.out.print("and a height of ");
		double Height = stdIn.nextDouble();

		FloorSurfaceArea = (Length * Width);
		WallsTotalArea = (Width + Length) * 2 * Height;

		System.out.println("The room's floor surface area is: " + FloorSurfaceArea + space + units + "squared");
		System.out.println("The Room's total wall surface area is : " + WallsTotalArea + space + units + "squared");

		stdIn.close();

	}
}