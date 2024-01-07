package javaRefresher;

import java.util.Scanner;

public class JavaConditions {
	public static void main(String[] args) {
		// < > == >= <= !=
		// && (and), || (or), ! (not)
		
		int a, b, c;
		a = 1;
		b = 2;
		c = 100;
				
		boolean bool = b == c && a >= b; 
		
		System.out.println(bool);
		
		if (bool) {
			System.out.println('A');
			if (c > 0) { System.out.println('A'); }
		} else if (bool || c > a) {
			System.out.println('B');
		} else {
			System.out.println('C');
		}
	}
}
