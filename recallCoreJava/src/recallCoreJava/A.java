package recallCoreJava;



//The static method can not use non static data member
public class A {

	
//	int a=40;
	public static void main(String[] args) {
//		Cannot make a static reference to the non-static field a
		int a=40;
		
		System.out.println(a);
	}

}
