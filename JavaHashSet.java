package datastructureworkshop;
import java.util.*;
public class JavaHashSet {
	public static void main(String[] args)
	{
        HashSet<Integer> hs1 = new HashSet<Integer>();
        
        hs1.add(10);
        hs1.add(5);
        hs1.add(10);
        hs1.add(3);
        hs1.add(3);
        hs1.add(1);
        System.out.println(hs1); 
        
        System.out.println("------------------");
        
        Iterator<Integer> iths1 = hs1.iterator();
        while( iths1.hasNext() )
        	System.out.println( iths1.next() );
        
        
        
	}

}
