package heap;
import java.util.Arrays;
import java.util.Scanner;
public class Heap_MaxHeapBuildClass02 {
	static int[] a = new int[0];
	static int heapSize;
	static void initializeHeapSize()
	{
		heapSize = a.length; 
	}
	static int heapParent(int i) 
	{
		if(i>=0 & i<=a.length-1)
			return i/2;
		return -1;
	}
	static int heapLeft(int i) 
	{
		int t = 2*i+1;
		if( (i>=0 & i<=a.length-1)&&(t>=0 & t<=a.length-1) )
			return t;
		return -1;
	}
	static int heapRight(int i) 
	{
		int t = 2*i+2;
		if( (i>=0 & i<=a.length-1)&&(t>=0 & t<=a.length-1) )
			return t;
		return -1;
	}
	static int lg2(int n) 
	{
		if(n<=1)
			return 0;
		return 1 + (lg2(n/2));
	}
	static void maxHeapify(int i) 
	{
		if(i<0 || i>a.length-1)
			return ;
		int left = heapLeft(i);
		int right = heapRight(i);
		int largest;
		if( (left!=-1)&&(left+1>=1 & left+1<=heapSize)&&(a[left]>a[i]) )
			largest = left;
		else
			largest = i;
		if( (right!=-1)&&(right+1>=1 & right+1<=heapSize)&&(a[right]>a[largest]) )
			largest = right;
		if(largest!=i)
		{
			int temp;
			temp = a[largest];
			a[largest] = a[i];
			a[i] = temp;
			maxHeapify(largest);
			return;
		}
		else
			return ;
	}
	public static void main(String[] args) {
		a = new int[]{1,8,9,17,18,3,7,6,5,20};
		System.out.println( Arrays.toString(a) );
		initializeHeapSize();
		for(int i = (a.length-1)/2;i>=0;i--) 
		{
			maxHeapify(i);
			System.out.println( Arrays.toString(a) );
		}
	}
}
