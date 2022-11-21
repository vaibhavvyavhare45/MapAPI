package com.mapapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BasicHashMapDemo1 {
	public static void main(String[] args) {
		Integer a[]= {1,2,3,5,6,8,10,12,13,14,15,16};
		List <Integer> l=Arrays.asList(a);
		System.out.println(l);
		Set<Integer> s=new HashSet<>(l);
		for (Integer integer : l) {
			s.add(integer);
		}
		for (Integer integer : s) {
			System.out.print(integer+" ");
		}
		
		
	}

}
