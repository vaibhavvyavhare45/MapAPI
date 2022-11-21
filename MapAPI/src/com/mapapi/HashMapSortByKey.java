package com.mapapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortByKey {
	public static void main(String[] args) {
		Map<String, Integer> mp=new HashMap<>();
		mp.put("bbb",45);
		mp.put("aaa",43);
		mp.put("ddd",41);
		mp.put("ccc",40);
		Set<Entry<String,Integer>> s=mp.entrySet();
		 Iterator<Entry<String,Integer>> itr = s.iterator();
         
	        while(itr.hasNext())
	        {
	           Map.Entry m=(Map.Entry)itr.next();
	           System.out.print(m.getKey()+" "+m.getValue());
				System.out.println();
			}
	        }
		
	}


