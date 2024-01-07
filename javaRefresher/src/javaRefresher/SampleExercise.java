package javaRefresher;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class SampleExercise {

	public static void main(String[] args) {
		Map<Character, Integer> letters = new HashMap<Character, Integer>();
		String wordPhrase;
		Scanner scan = new Scanner(System.in);
		int activeCount;
		
		System.out.print("Enter a string:");
		wordPhrase = scan.nextLine();
				
		for (char letter:wordPhrase.toCharArray()) {
			if (letter != ' ' && letters.get(letter) == null) {
				letters.put(letter, 1);
			} else if (letter != ' ' && letters.get(letter) != null) {
				activeCount = letters.get(letter);
				letters.replace(letter, activeCount, activeCount + 1);
			}
		}
		
		System.out.println(letters);
	}

}
