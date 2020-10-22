package datastructureworkshop;
import java.util.*;
public class IteratorExample {
	static void printByIterartor_of_String_type(Collection<String> cs1)
	{
		Iterator<String> it = cs1.iterator();
		
		while(it.hasNext())
		{
			System.out.println( it.next() );
		}
	}
	
	
	
	public static void main(String[] args) {
		/* 
		 * Iterator< Any primitive data type > it = new any_collection_type.iterator();
		 * 
		 */
		ArrayList<String> als = new  ArrayList<String>();
		als.add("Dhaka");
		als.add("Sylhet");
		als.add("Comilla");
		als.add("Rajshahi");
		printByIterartor_of_String_type(als);
		System.out.println("--------------------");
		HashSet<String> ss = new HashSet<String>();
		ss.add("BRACU");
		ss.add("BUET");
		ss.add("NSU");
		ss.add("DU");
	    printByIterartor_of_String_type(ss);
		
		
	}
}
