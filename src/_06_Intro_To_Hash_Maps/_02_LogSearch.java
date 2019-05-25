package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> map = new HashMap<>();
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton addButton = new JButton();
	private JButton searchButton = new JButton();
	private JButton viewButton = new JButton();
	private JButton removeButton = new JButton();

	public void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400, 400);
		panel.add(addButton);
		addButton.setText("Add Entry");
		addButton.addActionListener(this);
		panel.add(searchButton);
		searchButton.setText("Search by ID");
		searchButton.addActionListener(this);
		panel.add(viewButton);
		viewButton.setText("View List");
		viewButton.addActionListener(this);
		panel.add(removeButton);
		removeButton.setText("Remove Entry");
		removeButton.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		_02_LogSearch user = new _02_LogSearch();
		user.createUI();
	}

	public String prettyListing() {
		String fullList = "";
		for (Integer i : map.keySet()) {
			fullList = fullList + "ID: " + i + " Name: " + map.get(i) + "\n";
		}
		return fullList;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == addButton) {
			String userID = JOptionPane.showInputDialog(null, "Enter an ID number (3 digits)");
			String userName = JOptionPane.showInputDialog(null, "Enter a name");
			Integer userIDInteger = Integer.parseInt(userID);
			map.put(userIDInteger, userName);
		}
		if (buttonPressed == searchButton) {
			String userID = JOptionPane.showInputDialog(null, "Enter an ID number (3 digits)");
			Integer userIDInteger = Integer.parseInt(userID);
			if (map.containsKey(userIDInteger)) {
				JOptionPane.showMessageDialog(null, "The user is " + map.get(userIDInteger));
			} else {
				JOptionPane.showMessageDialog(null, "This username does not exist");
			}

		}
		if (buttonPressed == viewButton) {
			JOptionPane.showMessageDialog(null, prettyListing());
		}
		if (buttonPressed == removeButton) {
			String userID = JOptionPane.showInputDialog(null, "Enter an ID to remove (3 digits)");
			Integer userIDInteger = Integer.parseInt(userID);
			if (map.containsKey(userIDInteger)) {
				map.remove(userIDInteger);
			} else {
				JOptionPane.showMessageDialog(null, "\nThis ID does not exist");
			}
		}
	}
}
