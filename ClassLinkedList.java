package datastructureworkshop;
import java.nio.charset.Charset;
import java.util.*;
public class ClassLinkedList {
	public static void main(String[] args) {
		 Charset charset = Charset.forName("ascii");
		 FastIO fio = new FastIO(System.in, System.out, charset);
		 LinkedList<Integer> ill = new LinkedList<Integer>();
		 ill.add(4);
		 ill.add(56);
		 ill.set(3, 69);
		 System.out.println(ill);
		 
	}
}


//removeFirst(): This method removes and returns the first element from this list//
//removeLast(): This method removes and returns the last element from this list//

/*
         Remove object: 
         -->For Integer:		
         LinkedList<Integer> ill = new LinkedList<Integer>();
		 ill.add(4);
		 ill.add(56);
		 System.out.println(ill);
		 ill.remove(new Integer(56));
		 -->For String:
		 LinkedList<String> sll = new LinkedList<String>();
		 sll.add("kdfwk");
		 sll.add("kwsk");
		 sll.add("kwxxk");
		 sll.add("kddwk");
		 sll.remove("kwxxk");
 */
