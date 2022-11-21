package com.mapapi.treemap.basic;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		//TreeMap<Integer, String> tm = new TreeMap<>();// TreeMap provide the natural sorting by key and don't allow
														// duplicate
		TreeMap<Student,String> tm=new TreeMap<>(new StudentRollNo() );

		Student s1 = new Student("AAA",10);
		Student s2 = new Student("BBB",20);
		Student s3 = new Student("CCC",30);
		
		
		
		
		
		tm.put(s1, "zzzz");
		tm.put(s3, "yyyy");
		tm.put(s2, "xxxx");
		
		
		System.out.println(tm);
		System.out.println(tm.comparator());

	}

}
