package psudocode;

//fix the below program. 
//
//Remove the parameterized constructor.
//Add a constructor without any parameter.
class Main2 {
    protected int x, y;
 
    public Main2(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
//    public Main2()
//    {
//    	
//    };
}
 
public class Point {
    public static void main(String args[])
    {
    	Main2 m = new Main2();
        System.out.println("x = " + m.x + ", y = " + m.y);
    }
}