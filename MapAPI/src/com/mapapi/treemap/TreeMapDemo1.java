package com.mapapi.treemap;

import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm=new TreeMap<>(new SortKeyByDescending());
		tm.put("marish", 101);
		tm.put("vaibhav",102);
		tm.put("pranav", 104);
		tm.put("mukund", 103);
		tm.put("vishwajit",105);
		System.out.println(tm);
	}

}
