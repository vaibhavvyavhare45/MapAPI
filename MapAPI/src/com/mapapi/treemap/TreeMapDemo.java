package com.mapapi.treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<>();
		myMap.put("vaibhav", 120);
		myMap.put("mukund", 102);
		myMap.put("vishwajit", 110);
		myMap.put("pranav", 107);
		myMap.put("marish", 124);
		System.out.println("Before sorting: " + myMap);

		System.out.println("After sorting by value: " + sortMapByVal(myMap));

	}

	public static Map<String, Integer> sortMapByVal(HashMap<String, Integer> unsortedMap) {

		Set<Entry<String, Integer>> setOfEntries = unsortedMap.entrySet();
		Object dummy = new Object();
		Map<Entry<String, Integer>, Object> sorteMap = new TreeMap(new EntryComparator1());
		for (Entry<String, Integer> entry : setOfEntries) {
			sorteMap.put(entry, dummy);
		}
		System.out.println(sorteMap);
		Set<Entry<String, Integer>> ent = sorteMap.keySet();
		Map<String, Integer> result = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> e : ent) {
			result.put(e.getKey(), e.getValue());

		}
		System.out.println("===========>" + result);
		return result;

	}
}
