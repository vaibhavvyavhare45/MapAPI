package com.mapapi;

import java.util.Comparator;
import java.util.Map.Entry;

public class EntryValueComparator implements Comparator<Entry<String,Integer>>{

	@Override
	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		// TODO Auto-generated method stub
		return e1.getValue().compareTo(e2.getValue());
	}

	
	

}
