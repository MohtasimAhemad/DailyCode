import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {

		
		LinkedList<Object> l = new LinkedList<>();
		l.add("mohtasim");
		l.add(75664);
		l.add("Payal");
		l.add(233);
		l.add("priya");
		System.out.println(l);
		
		String s =(String) l.get(0);
		System.out.println(s);
		
		Integer i = (Integer) l.get(1);
		System.out.println(i);
		l.addFirst("maaz");
		System.out.println(l);
		
		
	}

}
