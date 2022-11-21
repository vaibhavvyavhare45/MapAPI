package com.mapapi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class BasicHashMapDemo {
	public static void main(String[] args) {
	LinkedHashMap<String, Integer> h=new LinkedHashMap<>();
	h.put("vaibhav", 101);
	h.put(null,null);
	h.put(null, null);
	h.put("vaibhav",103);
	h.put("ganesh", 10);
	System.out.println(h);
	
	

}
}