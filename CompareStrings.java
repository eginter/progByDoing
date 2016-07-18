import java.util.Scanner;

public class CompareStrings {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter first string: "); 
		String first = keyboard.nextLine();
		System.out.println("Enter second string: "); 
		String second = keyboard.nextLine();
		int result = first.compareTo(second);
		System.out.println("compareTo() produces: " + result );

	}
}