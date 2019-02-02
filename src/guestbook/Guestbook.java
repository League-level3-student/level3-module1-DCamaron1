package guestbook;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Guestbook implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JTextField input = new JTextField(20);
	JButton showList = new JButton();
	JButton addVIPButton = new JButton();
	JButton addRegularButton = new JButton();
	ArrayList<Guest> list = new ArrayList<>();

	public void CreateUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 100);
		frame.setTitle("Hotel Java Guestbook");
		panel.add(input);
		panel.add(showList);
		showList.setText("See all");
		showList.addActionListener(this);
		panel.add(addVIPButton);
		addVIPButton.setText("Add VIP");
		addVIPButton.addActionListener(this);
		panel.add(addRegularButton);
		addRegularButton.setText("Add");
		addRegularButton.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Guestbook user = new Guestbook();
		user.CreateUI();
	}

	public String prettyList() {
		String fullList = "";
		for (int i = 0; i < list.size(); i++) {
			fullList = fullList + list.get(i) + "\n";
		}
		return fullList;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == showList) {
			JOptionPane.showMessageDialog(null, prettyList());
		}

		if (buttonPressed == addVIPButton) {
			String name = input.getText();
			list.add(new VIP(name));
		}

		if (buttonPressed == addRegularButton) {
			String name = input.getText();
			list.add(new Regular(name));

		}

	}
}
