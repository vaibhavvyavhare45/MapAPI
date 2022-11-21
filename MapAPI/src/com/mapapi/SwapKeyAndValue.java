package com.mapapi;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;

public class SwapKeyAndValue {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>(); 
		map.put("vaibhav", 101);
		map.put("marish", 104);
		map.put("pranav", 102);
		map.put("vishwajit", 103);
		map.put("mukund", 105);
		
		System.out.println(map);
		Map<Integer, String> s=map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));
		
		System.out.println(s);
		
	}

}
