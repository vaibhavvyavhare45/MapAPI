package com.mapapi;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		
		hm.put(null, null);
		hm.put("mukund", 1001);
		hm.put("vishwajit", 1003);
		hm.put(null, 1001);
		System.out.println(hm);
	}

}
