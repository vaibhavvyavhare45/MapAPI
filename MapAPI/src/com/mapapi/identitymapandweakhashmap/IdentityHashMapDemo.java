package com.mapapi.identitymapandweakhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		Student s1 = new Student("AAA", 10);
		Student s2 = new Student("BBB", 20);
		Student s3 = new Student("AAA", 10);
		Student s4 = new Student("AAA", 10);
		Student s5 = s1;

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);

		// HashMap<Student, Integer> studentMap=new HashMap<>();

		IdentityHashMap<Student, Integer> studentMap = new IdentityHashMap<>();
		studentMap.put(s4, 111);
		studentMap.put(s2, 222);
		studentMap.put(s1, 111);
		studentMap.put(s3, 111);
		studentMap.put(s5, 111);

		System.out.println(studentMap);

	}
}
