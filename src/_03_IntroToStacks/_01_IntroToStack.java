package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		
		Stack <Double> testStack = new Stack<>();  
				for (int i = 0; i < 100; i++) {
			testStack.push(new Random().nextDouble()*100);
		}
		String answer = JOptionPane.showInputDialog("Enter a number between 0 and 100 \n(you can include 0 and 100)");
		String answer2 = JOptionPane.showInputDialog("Enter another number between 0 and 100");
		int answerNum = Integer.parseInt(answer);
		int answer2Num = Integer.parseInt(answer2);
		int greaterNum;
		int lesserNum;
		if (answerNum>answer2Num) {
			greaterNum = answerNum;
			lesserNum = answer2Num;
		}
		else {
			greaterNum = answer2Num;
			lesserNum = answerNum;
		}
		
		System.out.println("Popping elements off stack... \nElements between " + lesserNum + " and " + greaterNum);
		for (int i = 0; i < 100; i++) {
			if (i >  lesserNum && i < greaterNum) {
				System.out.println(testStack.pop());
			}
		}
		
	}
}
