package guestbook;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Guestbook {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame(); 
	JTextField input = new JTextField(20);
	JButton button1 = new JButton(); 
	JButton button2 = new JButton(); 
	JButton button3 = new JButton();
	ArrayList<Guest> list = new ArrayList<>(); 

	
	public void CreateUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 100);
		frame.setTitle("Hotel Java Guestbook");
		panel.add(input);
		panel.add(button1);
		button1.setText("See all");
		panel.add(button2);
		button2.setText("Add VIP");
		panel.add(button3);
		button3.setText("Add");		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Guestbook user = new Guestbook();
		user.CreateUI();
	}
}
