
/**
	Design a program that outputs a frame with any five GUI components in the JSwing package (button, checkbox, list etc.).
	Save the file as FiveGUIObjects.java.
	 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FiveGUIObjects extends JFrame implements ItemListener, ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container con = getContentPane();
	FlowLayout flow = new FlowLayout();
	JLabel heading = new JLabel("From the following answers choose your year");
	JLabel cheering = new JLabel("KEEP IT UP!");
	JButton button = new JButton("Click to continue");
	JCheckBox freshman = new JCheckBox("Freshman", false);
	JCheckBox sophomore = new JCheckBox("Sophomore", false);
	JCheckBox junior = new JCheckBox("Junior", false);
	JCheckBox senior = new JCheckBox("Senior", false);
	JTextField field = new JTextField(20);
	JPanel panel = new JPanel();
	
	
		public FiveGUIObjects(){
		
			super("Five GUI Objects");
			setSize(350, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			con.setLayout(new FlowLayout());
			con.setBackground(Color.BLACK);
			heading.setForeground(Color.WHITE);
			heading.setFont(new Font("Arial", Font.BOLD, 14));
			cheering.setForeground(Color.GREEN);
			cheering.setFont(new Font("Arial", Font.BOLD, 18));
			con.add(heading);
			con.add(freshman);
			con.add(sophomore);
			con.add(junior);
			con.add(senior);
			con.add(button);
			con.add(field);
			field.setForeground(Color.WHITE);
			con.add(panel);
			panel.setBackground(Color.BLUE);
			panel.add(cheering);
			panel.setVisible(false);		
			
			//item listeners
			freshman.addItemListener(this);
			sophomore.addItemListener(this);
			junior.addItemListener(this);
			senior.addItemListener(this);
			
			//action listener
			button.addActionListener(this);
						
	
	}
	public static void main(String[] args){
	
		FiveGUIObjects demo = new FiveGUIObjects();
		demo.setVisible(true);
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		Object source = e.getSource();
		
		if(source == freshman){
			field.setText("This is your first year at college");
			
			}
		else if (source == sophomore){
			field.setText("This is your second year at college");
		}
		else if (source == junior){
			field.setText("You will graduate next year");
		}
		else if (source == senior)
			field.setText("You are graduating this year");
					
	}

	public void actionPerformed(ActionEvent r) {
		
		field.setForeground(Color.BLACK);
		panel.setVisible(true);
			
		}
				
 }
