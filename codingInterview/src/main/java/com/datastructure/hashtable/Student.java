package com.datastructure.hashtable;

public class Student {

	private String name;

	private String rollno;

	private double cgpa;

	public Student(String name, String rollno, double cgpa) {
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
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

	public String toString(){
		return "Name " +name+" Roll no "+rollno+" CGPA "+cgpa;
	}
}
