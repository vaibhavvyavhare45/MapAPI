package com.mapapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChangeCapacityAndLoadFactorMap {
	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<String,Integer>(5,0.50f);
		mp.put("vaibhav", 101);
		mp.put("mukund", 103);
		mp.put("pranav", 102);
		mp.put("vishwajit", 104);
		Set<Entry<String,Integer>> st=mp.entrySet();
		System.out.println(st);
		st.remove("mukund");
		System.out.println(st);
		
	}

}
