package com.mapapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class ConvertHashMapToArrayList {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("vaibhav", 10);
		hm.put("mukund", 20);
		hm.put("vishwajit", 30);
		hm.put("pranav", 40);

		System.out.println(hm);

		Set<String> keyset = hm.keySet();
		ArrayList<String> al = new ArrayList<String>(keyset);
		System.out.println(al);
		Collection<Integer> values = hm.values();
		ArrayList<Integer> al1 = new ArrayList<Integer>(values);
		System.out.println(al1);

	}

}
