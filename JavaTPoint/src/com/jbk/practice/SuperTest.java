package com.jbk.practice;

class parent {
	int i = 10;
	void parent1(){
		System.out.println("we are in parent class" +i);
	}
	
}

class child extends parent{
	int i = 20;
	void child1(){
		//super();
		System.out.println("we are in child class" +i);
		
	}
}


public class SuperTest {
	public static void main(String[] args) {
		System.out.println("Welcome to java");
		child obj = new child();
		obj.child1();
		
	}

}
