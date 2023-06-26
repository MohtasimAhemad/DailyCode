package psudocode;

class A
{
	int i = 10;

	public A(int j)
	{
		System.out.println(i);
		this.i = j * 10;
	}
}

class B1 extends A
{
	public B1(int j)
	{
		super(j);
		System.out.println(i);
		this.i = j * 20;
	}
}

public class MainClass1
{
	public static void main(String[] args)
	{
		B1 n = new B1(20);
		System.out.println(n.i);
	}
}
