package homework4;

public class EightInts {
	
	public static void main(String[] args)
	{
		final int intagerNum = 8;
		int[] intagers = {3, 6, 1, 4, 7, 9, 2, 8};
		
		for (int i = 0 ; i < intagerNum-1; ++i)
			for (int s=0 ; s < intagerNum-1; ++s)
				if (intagers[s] > intagers[s+1])
				{
					int med = intagers[s];
					intagers[s]= intagers [s+1];
					intagers[s+1]=med;
				}
		System.out.println("Intagers in ascending order:");
		for (int x=0; x<= intagerNum-1; x++ )
			System.out.println(intagers[x]);
		System.out.println("Intagers in descending order:");
		for (int n=0; n<= intagerNum-1; n++ )
			System.out.println(intagers[intagerNum-(1+n)]);
					
	}

}
