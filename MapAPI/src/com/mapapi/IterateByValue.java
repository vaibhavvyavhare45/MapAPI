package com.mapapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterateByValue {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("marish", 101);
		hm.put("vaibhav", 103);
		hm.put("mukund", 102);
		hm.put("pranav", 104);
		Collection<Integer> s= hm.values();
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			if(itr.next()==(Integer.valueOf(101))) {
				itr.remove();
				
			}
			
		
		
		
		}
		System.out.println(s);
	
		}
	
}

