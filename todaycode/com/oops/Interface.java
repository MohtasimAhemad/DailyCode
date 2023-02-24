package com.oops;

interface Flyable
{
	void fly();
}

class Areoplane implements Flyable
{

	@Override
	public void fly() {

		System.out.println("i am also");
	}
	
}

class Bird implements Flyable
{

	@Override
	public void fly() {

		System.out.println("i am flying in the sky");
	}
	
}
public class Interface {

	public static void main(String[] args) {

		Flyable f = new Bird();
		f.fly();
	}

}
