package com.mapapi.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class DisctionaryDemo {

	public static void main(String[] args) {

		Hashtable<String, Integer> myTable = new Hashtable<>();

		myTable.put("vaibhav", 100);
		myTable.put("mukund", 109);
		myTable.put("vishvajit", 102);
		myTable.put("pranav", 103);

		// myTable.put("vaibhav", null);

		// myTable.put(null, 101);

		// System.out.println(myTable);

		Enumeration<String> e = myTable.keys();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}
		System.out.println("--------------------------------");

		Enumeration<Integer> e1 = myTable.elements();

		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());

		}

	}

}
