package psudocode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class I 
{
    public static void main (String[] args) 
    {
        Object i = new ArrayList().iterator(); 
        System.out.print((i instanceof List) + ", "); 
        System.out.print((i instanceof Iterator) + ", "); 
        System.out.print(i instanceof ListIterator); 
    } 
}