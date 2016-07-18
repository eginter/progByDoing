import java.util.Scanner;

public class SpaceBoxing {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your current earth weight (lbs): ");
		double weight = keyboard.nextDouble();

		System.out.println("\nI have information for the following planets: ");
		System.out.println("\t1.Venus \t2.Mars \t\t3.Jupiter");
		System.out.println("\t4.Saturn \t5.Uranus \t6.Neptune");
		System.out.print("\nWhich planet are you visiting? ");
		int choice = keyboard.nextInt();

		if (choice == 1) 
			System.out.println("Your weight would be " + (weight * 0.78));
		if (choice == 2) 
			System.out.println("Your weight would be " + (weight * 0.39));
		if (choice == 3) 
			System.out.println("Your weight would be " + (weight * 2.65));
		if (choice == 4) 
			System.out.println("Your weight would be " + (weight * 1.17));
		if (choice == 5) 
			System.out.println("Your weight would be " + (weight * 1.05));
		if (choice == 6) 
			System.out.println("Your weight would be " + (weight * 1.23));
		else
			System.out.println("Invalid number entered ");

	}
}