package uncheckedException;

public class DivideTwoNumberException {

	public static void main(String[] args) {

		System.out.println(divide(30,2));
		System.out.println(divide(15,0));
		System.out.println("the job is finished");
	}

	public static int divide(int dividend,int divisor)
	{
		try {
		return dividend/divisor;
		}
		catch(NullPointerException  e)
		{
			System.out.println("NullPointerException is thrown");
			return 0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("the divisor cant be zero");
			return 0;
		}
		finally
		{
			System.out.println("done");
		}
	}
}
