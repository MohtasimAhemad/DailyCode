package psudocode;

//filename: Test.java

//Main class
public class Test4 {
	// Declaring and initializing integer with custom value
	int x = 2;

	// Constructor of this class
	// Parameterized constructor
	Test4(int i) { x = i; }

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class in main()
		Test4 t = new Test4(5);

		// Printing the value
		System.out.println("x = " + t.x);
	}
}

