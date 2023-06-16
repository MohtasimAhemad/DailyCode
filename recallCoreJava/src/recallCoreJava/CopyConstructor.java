package recallCoreJava;

public class CopyConstructor {
	
	String s;
	int a;
	
	CopyConstructor(String i,int e)
	{
	
		s=i;
		a=e;
	}
	
	CopyConstructor(CopyConstructor c)
	{
		s=c.s;
		a=c.a;
	}

	public static void main(String[] args) {

		CopyConstructor cc = new CopyConstructor("ss",1);
		CopyConstructor ccc = new CopyConstructor(cc);

		System.out.println(cc.s+" "+cc.a);
		System.out.println(ccc.s+" "+ccc.a);

	}

}

