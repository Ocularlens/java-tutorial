package javaRefresher;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMaps {

	public static void main(String[] args) {
//		map is a key value pair
		Map map = new HashMap();
		map.put("lebron", 23);
		map.put("steph", 30);
		map.put("jimmy", "test");
		
		System.out.println(map);
		System.out.println(map.get("lebron"));
		
//		sorted order
		Map tMap = new TreeMap();
		
		tMap.put("klay", 23);
		tMap.put("aba", 30);
		tMap.put("poole", "test");
		
		System.out.println(tMap);
		
		Map lMap = new LinkedHashMap();
		
		lMap.put("loonie", 23);
		lMap.put("abra", 30);
		lMap.put("apak", "test");
		
		System.out.println(lMap);
		System.out.println(lMap.containsValue("test"));
		System.out.println(lMap.containsKey("loonie"));
	}

}
