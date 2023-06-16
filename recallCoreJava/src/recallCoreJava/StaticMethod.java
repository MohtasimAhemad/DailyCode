package recallCoreJava;


class Ss
{
	int id;
	String name;
	static String collageName="ABC";
	
	static void change()
	{
		collageName="XYZ";
	}
	
	
	Ss(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+"  "+name+"  "+collageName);
	}
	
	
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ss.change();
		Ss s = new Ss(1,"Ritesh");
		Ss s1 = new Ss(2,"Rohan");
		s.display();
		s1.display();

	}

}
