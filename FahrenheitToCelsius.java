import javax.swing.JOptionPane;
public class FahrenheitToCelsius
{
	public static void main (String [] ars)
	{
		
		double celsius;
		String fahrenheit = JOptionPane.showInputDialog(null, "Enter the temperature in Fahrenheit degrees:");
		double i = Integer.parseInt(fahrenheit);
		celsius = ((i -32)*5)/9;
		JOptionPane.showMessageDialog(null,"The temperature of " + fahrenheit + " Fahrenheit degrees, equals " + celsius + " Celsius degrees." );

	}
}