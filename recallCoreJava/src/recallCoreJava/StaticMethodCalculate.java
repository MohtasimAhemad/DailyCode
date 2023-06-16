package recallCoreJava;

public class StaticMethodCalculate {
	static int cube(int x)
	{
		return x*x*x;
	}

	public static void main(String[] args) {


		int result = StaticMethodCalculate.cube(5);
		System.out.println(result);
		
	}

}
