package com.programmingSearch.lynda.java;

import java.util.function.*;
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int variable =10;
		
		for (int i=0;i<=5;i++) {
			Consumer<String> consumer = (a) ->{
				System.out.println("Consuming "+a+" "+variable);
			};
			consumer.accept(consumer.toString());
		}
		
		Supplier<Thread> s1 =Thread::currentThread;
		System.out.println(s1.get());
		
		Lambda lambda = new Lambda();
		Employee emp = lambda.new Employee("Mark", variable);
		
		//Instance Method(instance specified)
		Supplier<Integer> s2= emp::getSalary;
		System.out.println(s2.get());
		
		//Instance Method(instance not specified)
		Function<Employee,Integer> f1 = Employee :: getSalary;
		Integer salary = f1.apply(emp);
		System.out.println(salary);
	}
	
	

	
	class Employee{
		
		public Employee(String name,int salary){
			this.name =name;
			this.salary = salary;
		}
		private int salary;
		private String name;
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
	}
}
