package collection.todaycode28feb;

import java.util.Scanner;

class Cls1
{
	void add(int p,int q)
	{
		System.out.println(p+q);
	}
}

class Cls2 extends Cls1
{
	void mul(int p,int q)
	{
		System.out.println(p*q);
	}
	
	void task(int p,int q)
    {
        System.out.println(p*p+q*q);
    }
}

public class Solution1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		Cls2 obj = new Cls2();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		obj.add(a, b);
		obj.mul(a, b);
		obj.task(a, b);
		}
		System.out.println("hi");
	}

}

