package com.prowings;

enum Size {
	small("the size is small"), medium("the size is medium"), large("the size is large"),
	extralarge("the size is extralarge");

	private final 
	String pizzaSize;

	private Size(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getSize() {
		return pizzaSize;

	}

}

public class EnumConstructor {
	public static void main(String[] args) {
		Size s = Size.medium;
		System.out.println(s.getSize());
		System.out.println(Size.small.toString());
		System.out.println(Size.large.name());
	}

}
