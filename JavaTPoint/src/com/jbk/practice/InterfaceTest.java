package com.jbk.practice;

interface i1{
	void m1();
	int i = 10;
}

interface i2{
	void m2();
	int i = 20;
}

public class InterfaceTest implements i1,i2 {
	
	public void m1(){
		System.out.println("inter of i1 " +i1.i);
		System.out.println("inter of i2 " +i2.i);
		
	}
	
	public void m2(){
		System.out.println("m2 method of i2");
	}
	
	public static void main(String[] args) {
		InterfaceTest obj = new InterfaceTest();
		obj.m1();
		obj.m2();
		
	}

}
