package psudocode;

//filename: Test2.java

//Class 1
//Helper class
class Test6 {

	// Constructor of this class
	Test6(int x)
	{

		// Print statement whenever this constructor is
		// called
		System.out.println("Constructor called " + x);
	}
}

//Class 2
//Class contains an instance of Test1
//Main class
class Test5 {

	// Creating instance(object) of class1 in this class
	Test6 t1 = new Test6(10);

	// Constructor of this class
	Test5(int i) { t1 = new Test6(i); }

	// Main driver method
	public static void main(String[] args)
	{
		// Creating instance of this class inside main()
		Test5 t2 = new Test5(5);
	}
}
