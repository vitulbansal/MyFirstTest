package com.jbk.practice;

class A1{
	int i = 10;
	void m1(){
		System.out.println("we are in class B");
	}
}



public class RunTimePolyTest2 extends A1 {
	int i = 20;
	public static void main(String[] args) {
		A1 a = new RunTimePolyTest2();
		System.out.println(a.i);
	}
	

}
