package recallCoreJava;

public class Student {
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s= new Student(1,"mohtasim");
		System.out.println(s.id+" "+s.name);
	}

}
