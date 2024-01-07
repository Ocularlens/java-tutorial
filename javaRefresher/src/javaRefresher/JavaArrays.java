package javaRefresher;

import java.util.Scanner;

public class JavaArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String testStr = "";
		
		String[] names = new String[2];
		int[] integers = { 1, 2, 4, 2 };
		
		names[1] = "Aldous";
		names[0] = "TEW";
		
		System.out.println(names);
		
		for (int ctr = 0; ctr < names.length; ctr++) {
			System.out.println(names[ctr]);
		}
		
		// foreach
		for (int element:integers) {
			System.out.println(element);
		}
		
		
		
		while(!testStr.equals("AGIK")) {
			System.out.print("Type agik pls:");
			testStr = sc.next();
		}
		
		do {
			System.out.print("Type agoy pls:");
			testStr = sc.next();
		} while(testStr.equals("AGIK"));
	}

}
