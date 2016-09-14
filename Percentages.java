
public class Percentages 
{
	public static void main(String args[])
	{
		double firstNum = 4;
		double secondNum = 8;
		cumputePercent(firstNum, secondNum);
		cumputePercent(secondNum, firstNum);
			
	}
	
	public static void cumputePercent(double firstNum, double secondNum)
	{
		double percent;
		percent = (firstNum/secondNum)*100;
		
		System.out.println(firstNum + " is " + percent + " % of " + secondNum);
	}
	
	
}
