package com.jbk.practice;

class A{
	int i = 10;
	void m1(){
		System.out.println("we are in class A");
		System.out.println(i);
	}
}

class B extends A {
	int i = 20;
	void m1(){
		System.out.println("we are in class B");
		System.out.println(i);
	}
}


class C extends B {
	int i = 30;
	void m1(){
		System.out.println("we are in class C");
		System.out.println(i);
	}
}


public class RunTimePolyTest {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new B();
		A obj3 = new C();
		
		obj1.m1();
		obj2.m1();
		obj3.m1();
	}

}
