package homework4;

import java.util.Scanner;
public class Schedule {
	
	public static void main(String[] args)
	{
		String name;
		boolean i=false;
		String[][] courses = new String[5][2];
		courses[0][0]= "CIS 110"; courses[1][0]="MAT 150"; courses[2][0]="CIS 250";
		courses[3][0]= "PHY 300"; courses[4][0]= "MAT 300";
		
		courses[0][1]= "TH 3:30"; courses[1][1]="TU 1:30"; courses[2][1]="WED 2:00";
		courses[3][1]= "TH 1:00"; courses[4][1]= "MON 2:00";
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter name of your course to display the meeting time:");
		name = input.nextLine();
		
		while(!i)
		{
		for(int x=0; x<=courses.length; ++x)
		{
			if(name.equals(courses[x][0]))
			{
				i=true;
				
					System.out.println("The meeting is on " + courses[x][1]);
					x= courses.length;
			}
			if(!i)
				System.out.println("Incorrect class name ");
		}			
		}
	}

}
