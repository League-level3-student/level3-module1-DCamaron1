package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		int greaterNum;
		int lesserNum;

		Stack<Double> testStack = new Stack<>();
		for (int i = 0; i < 100; i++) {
			testStack.push(new Random().nextDouble() * 100);
		}
		String userAnswer = JOptionPane.showInputDialog("Enter a number between 0 and 100 \n(you can include 0 and 100)");
		String userAnswer2 = JOptionPane.showInputDialog("Enter another number between 0 and 100");
		int userAnswerNum = Integer.parseInt(userAnswer);
		int userAnswer2Num = Integer.parseInt(userAnswer2);

		if (userAnswerNum > userAnswer2Num) {
			greaterNum = userAnswerNum;
			lesserNum = userAnswer2Num;
		} else {
			greaterNum = userAnswer2Num;
			lesserNum = userAnswerNum;
		}
		System.out.println("Popping elements off stack... \nElements between " + lesserNum + " and " + greaterNum);
		for (int i = 0; i < 100; i++) {
			double currentValue = testStack.pop();
			if (currentValue > lesserNum && currentValue < greaterNum) {
				System.out.println(currentValue);
			}
		}

	}
}
