package com.mapapi.identitymapandweakhashmap;

import java.util.Objects;

public class Student {
	String name;
	int rollno;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Student object is garbage collecting...");
		super.finalize();
	}

}
