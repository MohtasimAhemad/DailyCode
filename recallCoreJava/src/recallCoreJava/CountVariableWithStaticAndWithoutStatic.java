package recallCoreJava;

public class CountVariableWithStaticAndWithoutStatic {
	
	static int count=0; 
	CountVariableWithStaticAndWithoutStatic()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountVariableWithStaticAndWithoutStatic c=new CountVariableWithStaticAndWithoutStatic();
		CountVariableWithStaticAndWithoutStatic c1=new CountVariableWithStaticAndWithoutStatic();
		CountVariableWithStaticAndWithoutStatic c2=new CountVariableWithStaticAndWithoutStatic();
	}

}


/* without static output will get 
 * 1
 * 1
 * 1
 * 
 * 
 * And With static variable output will get
 * 
 * 1
 * 2
 * 3
 */
