package com.mapapi.treemap.basic;

import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {

		TreeMap<String, Integer> myMap = new TreeMap<>();
		myMap.put("BBB", 222);
		myMap.put("DDD", 444);
		myMap.put("CCC", 333);
		myMap.put("AAA", 111);

		System.out.println(myMap);
		// method of TreeMap
		System.out.println(myMap.comparator());
		System.out.println(myMap.subMap("BBB", "DDD"));// this method return specific view of keys segment
		System.out.println(myMap.headMap("BBB")); //to return strictly less than  tokey.
		System.out.println(myMap.tailMap("BBB"));
		System.out.println(myMap.firstKey());
		System.out.println(myMap.lastKey());
		System.out.println(myMap.containsKey("BBB"));
		System.out.println(myMap.ceilingKey("AAA"));
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		System.out.println(myMap.entrySet());
	}

}
