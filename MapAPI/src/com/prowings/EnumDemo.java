package com.prowings;

enum Day {
	monday, tuesday, wednesday, thursday, friday, saturday;
}

	public class EnumDemo {
		Day day;

		public EnumDemo(Day day) {
			super();
			this.day = day;
		}

		public EnumDemo() {
			// TODO Auto-generated constructor stub
		}

		public void dayIsLike() {
			switch (day) {
			case monday:
				System.out.println("i am a monday");
				break;
			case tuesday:
				System.out.println("i am a tuesday");
				break;
			case wednesday:
				System.out.println("i am a wednesday");
				break;
			case friday:
				System.out.println("i am a friday");
				break;
			case saturday:
				System.out.println("i am a saturday");

			default:
				System.out.println("i am a sunday");
				break;
			}
		}
		public static void main(String[] args) {
		EnumDemo e=new EnumDemo(Day.friday);
		e.dayIsLike();
	
			
		}
	}

