package recallCoreJava;

public class StaticVariable {

	int id;
	String name;
	static String collageName;
	
	
	StaticVariable(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+"  "+name);
	}
	
	public static void main(String[] args) {

		StaticVariable s = new StaticVariable(1,"maaz");
		StaticVariable s1 = new StaticVariable(2,"Sam");
		s.display();
		s1.display();
	}

}
