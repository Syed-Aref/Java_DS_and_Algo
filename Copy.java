package datastructureworkshop;
import java.util.*;
public class Copy {
	public static void main(String[] args) {
		Vector<Integer> vi = new Vector<Integer>(10,99);
		vi.add(4);
		vi.add(6);
		LinkedList<Integer> ill = new LinkedList<Integer>(vi);
		ill.add(56);
		System.out.println("Vector: "+vi);
		System.out.println("List: "+ill);
        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.add(10);
        hs1.add(5);
        hs1.add(10);
        hs1.add(3);
        hs1.add(3);
        hs1.add(1);
        LinkedList<Integer> ill01 = new LinkedList<Integer>(hs1);
        ill01.add(100);
		System.out.println("Set: "+hs1);
		System.out.println("List: "+ill01);
	}
}
