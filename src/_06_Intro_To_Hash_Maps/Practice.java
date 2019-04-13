package _06_Intro_To_Hash_Maps;

import java.util.HashMap;

public class Practice {
	public static void main(String[] args) {
		HashMap <String, Boolean> test = new HashMap<>();
		test.put("are cats alive", false);
		System.out.println(test.get("are cats alive"));
		System.out.println(test.get("what"));
	}
}
