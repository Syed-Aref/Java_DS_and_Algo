package datastructureworkshop;


import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		List<Integer> listI; 
		
		Integer[] arrI1 = new Integer[] {34,100,23,56,1,23,5,67,56,2123};
		
		listI = Arrays.asList(arrI1);
		
		System.out.println(listI); //[34, 100, 23, 56, 1, 23, 5, 67, 56, 2123]
		
		Collections.sort(listI);
		System.out.println(listI); // [1, 5, 23, 23, 34, 56, 56, 67, 100, 2123]
		System.out.println(Collections.binarySearch(listI, 69)); // If found outputs first index value , else -n ;n 1,2,3,...
		
		HashSet<Integer> si = new HashSet<Integer>(listI);
		System.out.println(Collections.binarySearch(listI, 70));
		
	}

}
