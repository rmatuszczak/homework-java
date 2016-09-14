import javax.swing.JOptionPane;
public class DemoHorses {
	
	public static void main(String[] args)
	{
	
		Horse h = new Horse();
		RaceHorse rh = new RaceHorse();
		
		
		h.setName();
		h.setColor();
		h.setYear();
		
		rh.setRace();
		
		JOptionPane.showMessageDialog(null,"The name of the horse is " + h.getName() + 
				". The horse's color is " + h.getColor()+ ". It was born in " + h.getYear() + 
				". " + h.getName() + " has taken part in " + rh.getRace() + " races");
				
	}
}
