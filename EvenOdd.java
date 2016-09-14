import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String number; 
		
		System.out.println("Please enter an integer: ");
		number = input.nextLine();
		int i = Integer.parseInt(number);
		
		if (i % 2 == 0 )
			System.out.println("You entered an even number");
		else
			System.out.println("You entered an odd number");
		input.close();	
	}
}
