package recallCoreJava;


class GrandFather  
{  
public void show()  
{  
System.out.println("I am grandfather.");  
}  
}  
class Father extends GrandFather  
{  
public void show()  
{  
System.out.println("I am father.");  
}  
}  
class Son extends Father  
{  
public void show()  
{  
System.out.println("I am son.");  
}  
}  
public class MultilevelInheritance extends Father  
{  
public void show()  
{  
System.out.println("I am a daughter.");  
}  
public static void main(String args[])  
{  
	MultilevelInheritance ml = new MultilevelInheritance();  
	Father m2 = new Son();  
	m2.show();
	ml.show();
					
}  
}  