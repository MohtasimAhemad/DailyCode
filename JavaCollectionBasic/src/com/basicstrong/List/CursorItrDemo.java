package com.basicstrong.List;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorItrDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<>();
		
		data.add(12);
		data.add(33);
		data.add(46);
		
		//creating iterator object equivalent to ArrayList data
		Iterator itr = data.iterator();
		
		//hasNext(): returns true if iterator has next element in it
		while(itr.hasNext())
		{
			//next(): returns element present next to cursor 
			Integer i = (Integer)itr.next();
			
			if(i % 3 == 0)
				System.out.println(i);
			else
				itr.remove();
		}
		
		System.out.println(data);
	}

}