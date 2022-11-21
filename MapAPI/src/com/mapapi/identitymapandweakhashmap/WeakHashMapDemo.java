package com.mapapi.identitymapandweakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		Student s1 = new Student("AAA", 10);

		// HashMap<Student, Integer> map = new HashMap<>();// that case garbage
		// collection not remove object
		WeakHashMap<Student, Integer> map = new WeakHashMap<>();
		map.put(s1, 1111);
		System.out.println("Before garbage collection: " + map);

		s1 = null;
		System.gc();
		// Thread.sleep(1000);
		System.out.println("After garbage collection: " + map);
	}
}
