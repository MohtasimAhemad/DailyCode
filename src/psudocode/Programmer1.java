package psudocode;

class Writer
{
	public static void write()
	{
		System.out.println("Writing...");
	}
}
class Author extends Writer
{
	public static void write()
	{
		System.out.println("Writing book");
	}
}

public class Programmer1 extends Author
{
	public static void write()
	{
		System.out.println("Writing code");
	}

	public static void main(String[] args)
	{
		Author a = new Programmer1();
		a.write();
	}
}

