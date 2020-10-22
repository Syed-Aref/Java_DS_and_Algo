package datastructureworkshop;
import java.util.*;

public class ClassHashMap {
	public static void main(String[] ars) 
	{
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(1,9);
		hm.put(5,8);
		hm.put(2,5);
		System.out.println(hm);
		
		for(Integer i : hm.keySet())
		{
			System.out.println( "Key: "+i+" & Value: "+ hm.get(i));
		}
		/* for( KeyDataType variable : hm.keyset() )
		 * {
		 *   //variable = key;
		 *   //hm.get(variable) returns value
		 * }
		 */
	}
}
