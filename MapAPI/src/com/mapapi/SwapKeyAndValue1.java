package com.mapapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SwapKeyAndValue1 {
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();
		Map<Integer, String> h = new HashMap<>();
		mp.put("vaibhav", 101);
		mp.put("pranav", 103);
		mp.put("marish", 104);
		mp.put("mukund", 102);
		mp.put("vishawjit", 105);
		System.out.println(mp);
		Set<Entry<String, Integer>> e = mp.entrySet();
		for (Entry<String, Integer> entry : e)
			h.put(entry.getValue(), entry.getKey());
		System.out.println(h);

		System.out.println(h.get(101));
		System.out.println(h.containsValue("vaibhav"));

	}

}
