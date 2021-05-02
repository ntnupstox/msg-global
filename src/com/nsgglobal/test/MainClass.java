package com.nsgglobal.test;

public class MainClass {

	public static void main(String args[]) {
	B obj = new D();
	obj.display();
	}
}


interface A {
	
	public void display();
}

interface B {
	
	public void display();
}

class D implements A , B {

	public void display() {
		
		System.out.println("Class D");
	}
}
