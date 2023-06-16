package recallCoreJava;

//Is used to initialize the static data member.
//It is executed before the main method at the time of classloading.


class Ab
{
	static {
		System.out.println("hello2");
		System.exit(0);
	}
}
//public class StaticBlockA {
//
//	static {System.out.println("First execute static block");}
//	public static void main(String[] args) {
//
//		System.out.println("Hello");
//	}
//
//}

