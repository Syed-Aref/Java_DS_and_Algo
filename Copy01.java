package datastructureworkshop;
import java.util.*;
public class Copy01 {
	public static void main(String[] args) {
			Integer[] arrI = new Integer[] {23,56,1,23,5,67};
			
			List<Integer> listI = Arrays.asList(arrI);
			HashSet<Integer> setI = new HashSet<Integer>(Arrays.asList(arrI));
			
			System.out.println(listI); // [23, 56, 1, 23, 5, 67]
			System.out.println(setI); //[1, 67, 5, 23, 56]
			
			Integer[] arrI1 = new Integer[] {34,100,23,56,1,23,5,67,56,2123};
			
			listI = Arrays.asList(arrI1);
			
			System.out.println(listI); //[34, 100, 23, 56, 1, 23, 5, 67, 56, 2123]
			
			
			
			
	}
}
