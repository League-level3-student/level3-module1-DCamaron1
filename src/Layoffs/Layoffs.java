package Layoffs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Layoffs implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JTextField hireBox = new JTextField(15);
	private JTextField layoffBox = new JTextField(15);
	private JButton hireButton = new JButton();
	private JButton layoffButton = new JButton();
	private Stack<String> employees = new Stack<>();

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(300, 100);
		frame.setTitle("Big Business");
		panel.add(hireBox);
		panel.add(hireButton);
		panel.add(layoffBox);
		panel.add(layoffButton);
		hireButton.setText("Hire");
		hireButton.addActionListener(this);
		layoffButton.setText("Lay Off");
		layoffButton.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Layoffs bob = new Layoffs();
		bob.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		String employeeName = hireBox.getText();
		String layoffAmount = layoffBox.getText();
		String layedOffList = "";

		if (buttonPressed == hireButton) {
			employees.push(employeeName);
			hireBox.setText(null);
			System.out.println("This person was employed: " + employeeName);
		}

		else {
			int layoffNum = Integer.parseInt(layoffAmount);
			for (int i = 0; i < layoffNum; i++) {
				layedOffList = layedOffList + employees.pop() + "\n";
			}
			JOptionPane.showMessageDialog(null, "These people were laid off: \n" + layedOffList);
		}
	}
}
