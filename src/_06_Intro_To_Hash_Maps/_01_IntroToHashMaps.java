package _06_Intro_To_Hash_Maps;

import java.util.HashMap;

public class _01_IntroToHashMaps {
	public static void main(String[] args) {
		HashMap<Integer, Double> roots = new HashMap<Integer, Double>();
		for (int i = 0; i < 500; i++) {
			roots.put(i, Math.sqrt(i));
		}
		for (int i = 0; i < 500; i++) {
			System.out.println("The square root of " + i + " is " + roots.get(i));
		}
	}
}
