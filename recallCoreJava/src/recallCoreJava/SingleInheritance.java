package recallCoreJava;

class Single
{  
void singleWay()
{
	System.out.println("single way...");
}  
}  
class Double extends Single
{  
	
void doubleWay()
{
	System.out.println("double way...");
}  
}  
class SingleInheritance{  
public static void main(String args[]){  
	Double d=new Double();  
   d.singleWay();  
   d.doubleWay();  
}}  