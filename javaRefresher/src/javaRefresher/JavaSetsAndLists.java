package javaRefresher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class JavaSetsAndLists {

	public static void main(String[] args) {
		// no order
		Set<Integer> mgaNumbers = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		mgaNumbers.add(50);
		mgaNumbers.add(50);
		mgaNumbers.add(80);
		
		System.out.println(mgaNumbers);
		System.out.println(mgaNumbers.contains(50));
		
		// ordered set
		Set<String> mgaSalita = new TreeSet<String>();
		
		mgaSalita.add("lebron");
		mgaSalita.add("aldous");
		mgaSalita.add("steph");
		mgaSalita.add("naruto");
		
		System.out.println(mgaSalita);
		
//		just like hashset but faster
		Set<Double> mgaPresyo = new LinkedHashSet<Double>();
		
		mgaPresyo.add(50.4);
		mgaPresyo.add(52.4);
		
		System.out.println(mgaPresyo);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(20);
		numbers.add(50);
		numbers.add(30);
		
		numbers.set(1, 30);
		
		System.out.println(numbers.get(1));
		System.out.println(numbers.subList(1, 3));
		System.out.println(numbers);
		
		LinkedList<String> strings = new LinkedList<String>();
		
		strings.add("aldous javier");
		strings.add("naruto uzumaki");
		strings.add("sasuke uchiha");
		
		System.out.println(strings);
		System.out.println(strings.get(2));
	}

}
