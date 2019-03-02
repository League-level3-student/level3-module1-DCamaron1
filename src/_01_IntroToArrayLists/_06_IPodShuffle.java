package _01_IntroToArrayLists;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 2. Congratulations on completing the sound check! * Now we want to make an
 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
 * "Surprise Me!" button that will play a random song when it is clicked. * If
 * you're really cool, you can stop all the songs, before playing a new one on
 * subsequent button clicks.
 */
public class _06_IPodShuffle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton shuffleButton = new JButton();
	ArrayList<Song> songList = new ArrayList<>();
	
	public _06_IPodShuffle() {
		
	}

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(shuffleButton);
		panel.setBackground(Color.darkGray);
		shuffleButton.addActionListener(this);
		shuffleButton.setText("Surprise Me!");
		frame.setSize(200, 100);
		createList();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createList() {
		Song demo = new Song("demo.mp3");
		Song blue = new Song("blue.mp3");
		Song axelF = new Song("axelF.mp3");
		Song piano = new Song("piano.mp3");
		songList.add(demo);
		songList.add(axelF);
		songList.add(blue);
		songList.add(piano);
	}

	public static void main(String[] args) {
		_06_IPodShuffle bob = new _06_IPodShuffle();
		bob.createUI();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int numberGen = new Random().nextInt(4);
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == shuffleButton ) {
			songList.get(numberGen).stop();
			songList.get(numberGen).play();
		}
	}
}
