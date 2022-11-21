package com.mapapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortedMapByValue {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("DDD",1001);
		hm.put("BBB",1004);
		hm.put("AAA",1002);
		hm.put("CCC",1003);
		
		sortedByMapValue(hm);
		
	}

	private static void sortedByMapValue(HashMap<String, Integer> hm) {
		Set<Entry<String,Integer>> sor=hm.entrySet();
		ArrayList<Entry<String,Integer>> al=new ArrayList<>(sor);
		Collections.sort(al,new EntryValueComparator() );
		for (Entry<String, Integer> entry : al) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
