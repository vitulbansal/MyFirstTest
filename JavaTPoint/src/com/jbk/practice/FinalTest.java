package com.jbk.practice;

public class FinalTest {
	public static void main(String[] args) {
		child2 obj = new child2();
		
		
	}

}

class FinalMethod{
	int i = 10;
	//final 
	void m1(){
		System.out.println("we are in final method");
	}
}

class child2 extends FinalMethod{
	void m1(){
		System.out.println("we are in child method");
	}
}