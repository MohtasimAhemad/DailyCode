package recallCoreJava;

//If local variables(formal arguments) and instance variables are different,
//there is no need to use this keyword like in the following program.

//ThisWay(int r,String n,float f)
//{
//	rollno=r;  
//	name=n;  
//	fee=f;  
//}




//parameters and instance variables are same.
//So, we are using this keyword to distinguish local variable and instance variable.
//ThisWay(int rllno,String name,float fee)
//{
//	rollno=rollno;  
//	name=name;  
//	fee=fee;  
//}


class ThisWay
{
	int rollno;
	String name;
	float fee;
//	parameters and instance variables are same.
//	So, we are using this keyword to distinguish local variable and instance variable.
	ThisWay(int rollno,String name,float fee)
	{
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
		}  
}  


public class ThisWithVariable {

	public static void main(String[] args) {

		ThisWay s1=new ThisWay(111,"ankit",5000f);  
		ThisWay s2=new ThisWay(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		
	}

}
