/**Write an application that extends JFrame and that displays 15 nested circles, like those in the figure below.
You may use only one drawOval() statement in the program. Save the file as JNestedCircles.java.
*/
import javax.swing.*;
import java.awt.*;
public class NestedCircles extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container con = getContentPane();
	
	public NestedCircles(){
		con.setBackground(Color.BLUE);
		con.setLayout(new FlowLayout());
	}
	
	public void paint(Graphics cr){
		super.paint(cr);
		
		cr.setColor(Color.BLACK);
		
		int x= 100, y= 100, a= 200, b= 200;
		
		for(int i=1; i<=15; i++)
		{
			cr.drawOval(x, y, a, b);
			x = x+5;
			y = y+5;
			a= a-10;
			b= b-10;
		}			
	}
	
	public static void main (String[] args)
	{
		NestedCircles frame = new NestedCircles();
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}
