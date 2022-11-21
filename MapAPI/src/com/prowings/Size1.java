package com.prowings;

public enum Size1 {///enum class
	SMALL, MADIUM, LARGE, EXTRALARGE;

	public String getSize() {
		switch (this) {
		case SMALL:
			return "small";
		case LARGE:
			return "large";
		case MADIUM:
			return "madium";
		case EXTRALARGE:
			return "extralarge";

		default:

			return null;
		}
	}
	public static void main(String[] args) {
		System.out.println("the size of the pizza is: "+Size1.SMALL.getSize());
		System.out.println("the size of the pizza is: "+SMALL.ordinal());
		System.out.println("the size of the pizza is: "+Size1.SMALL.compareTo(SMALL));
		System.out.println("the size of the pizza is: "+LARGE.toString());
		System.out.println("the size of the pizza is: "+Size1.SMALL.name());
		//System.out.println("the size of the pizza is: "+Size1.SMALL.valueOf(null, name));
		System.out.println("the size of the pizza is: "+SMALL.values());
	}
}
