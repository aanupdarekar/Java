package com.datastructure;

public class Person {

	private String name;

	private String rollno;

	private double cgpa;

	public Person(String name) {
		this.name = name;
		this.rollno = rollno;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name " + name;
	}
}
