package com.csu.assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Maps {
	
	
	
	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("map", "HashMap");
		hm = addValues(hm);
		displayMapValues(hm);

		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("map", "TreeMap");

		tm = (TreeMap<String, String>) addValues(tm);
		displayMapValues(tm);
		
		LinkedHashMap<String, String> lm = new LinkedHashMap<String, String>();
		lm.put("map", "LinkedHashMap");
		
		lm = (LinkedHashMap<String, String>) addValues(lm);
		displayMapValues(lm);
		
	}
	
	private static Map<String, String>  addValues(Map<String,String> mp) {
		 
		for(int i=1;i<100;i++) {
			
			mp.put(mp.get("map")+"key"+i,"value"+i);
		}
		return mp;
	}
	private static void displayMapValues(Map<String, String> mp) {
		System.err.println("\n"+mp.get("map"));
		for(int i=1;i<100;i++) {
			
			System.out.println(mp.get(mp.get("map")+"key"+i));
		}
		System.out.println("********************************\n");
	}
}
