package recallCoreJava;

public class ParameterizeConstructoer {
	
	String name;
	String number;
	int age;
	ParameterizeConstructoer(String name,String number,int age)
	{
		this.name=name;
		this.number=number;
		this.age=age;
		
	}

	public static void main(String[] args) {

		ParameterizeConstructoer p= new ParameterizeConstructoer("Mohtasim","7507866878",24);
		System.out.println(p.name+" "+p.number+" "+p.age);

	}

}
