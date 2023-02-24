package com.oops;



class GrandFather
{
	void gf() {
		System.out.println("GrandFather");
	}
}

class  Father extends GrandFather
{
	void f()
	{
		System.out.println("father");
	}
}

class Son extends Father
{
	void s()
	{
		System.out.println("son");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Son s= new Son();
		s.gf();
		s.f();
		s.s();
		
		
	}

}
