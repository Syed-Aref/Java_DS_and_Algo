package datastructureworkshop;
import java.util.*; 
public class BITSET 
{ 
    public static void main(String[] args) 
    { 
        BitSet bs1 = new BitSet(); 
        bs1.set(0);// 0 is true 
        bs1.set(1);//1 is true
        bs1.set(2);//2 is true
        bs1.set(3,false);// 3 is false
        System.out.println("bs1  : " + bs1);  
        System.out.println("Size of bs1 : "+bs1.cardinality());
        
        // bs1  : 0, 1, 2 
        //length = 3
        
        //--------------------------------------------------------//
        bs1.set(5,true);//
        System.out.println("bs1  : " + bs1); 
        System.out.println("Size of bs1 : "+bs1.cardinality());
        
        // bs1  : 0, 1, 2,5
        //length = 4
        
        // so only counts trues and prints their index
        
        //--------------------------------------------------------//
        for(int i = 0;i<=10;i++)
        	System.out.println("At "+i+" : "+bs1.get(i));
        
/*Output:
At 0 : true
At 1 : true
At 2 : true
At 3 : false
At 4 : false
At 5 : true
At 6 : false
At 7 : false
At 8 : false
At 9 : false
At 10 : false
*/    
    } 
} 