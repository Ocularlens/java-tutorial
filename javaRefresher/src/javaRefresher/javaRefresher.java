package javaRefresher;

import java.util.Scanner;

public class javaRefresher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello moda");
		
		// variable and datatypes
		String str = "Aldous";
		int integer = 10;
		double Double = 10.1;
		boolean bool = false;
		char c = '\n';
		
		// input and scanners
		String scanned;
		int inputInt;
		
		Scanner sc = new Scanner(System.in);
		scanned = sc.next();
		
		inputInt = Integer.parseInt(sc.next());
		
		System.out.println(scanned);
	}

}
