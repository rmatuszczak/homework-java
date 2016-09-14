import java.util.Scanner;
public class SecondLargest {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int amount= input.nextInt();
		int list[] = new int[amount];
		System.out.println("Please enter the numbers:");
	
		// loop for user's input	
		for (int i = 0 ; i < list.length; i++ ) 
			{
	           list[i] = input.nextInt();
	        }
		// loop for sorting the list in an ascending order
		for (int i = 0 ; i < list.length-1; ++i)
				for (int s=0 ; s < list.length-1; ++s)
					if (list[s] > list[s+1])
					{
						int med = list[s];
						list[s]= list [s+1];
						list[s+1]=med;
					}
		int b = list.length;
		System.out.println("The second largest number is " + list[b-2]);
	}
}
