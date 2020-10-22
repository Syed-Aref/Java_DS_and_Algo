package datastructureworkshop;
import java.util.*;
public class BasicComparator01 {

	public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(45);
        ali.add(6);
        ali.add(34);
        ali.add(45);
        ali.add(12);
        Collections.sort(ali,new Comparator<Integer>() {
        	public int compare(Integer a,Integer b) 
            {
        	    return b-a;
            }
        });
        System.out.println(ali);
        /* a-b -> ascending
         * b-a -> descending */
	}
}
