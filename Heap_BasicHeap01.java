package heap;

import java.util.Arrays;
import java.util.Scanner;

public class Heap_BasicHeap01 {

		static int heapSize;
		static void initializeHeapSize(int[] a)
		{
			heapSize = a.length; 
		}
		static int heapParent(int[] a,int i) 
		{
			if(i>=0 & i<=a.length-1)
				return i/2;
			return -1;
		}
		static int heapLeft(int[] a,int i) 
		{
			int t = 2*i+1;
			if( (i>=0 & i<=a.length-1)&&(t>=0 & t<=a.length-1) )
				return t;
			return -1;
		}
		static int heapRight(int[] a,int i) 
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
		static int[] maxHeapify(int[] a,int i) 
		{
			if(i<0 || i>a.length-1)
				return a;
			int left = heapLeft(a,i);
			int right = heapRight(a,i);
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
				return maxHeapify(a,largest);
			}
			else
				return a;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] a = {23,10,12,45,36,8,27,18,-6,15};
			int i = sc.nextInt();
			System.out.println(Arrays.toString(a));
			initializeHeapSize(a);
			maxHeapify(a,3);
			System.out.println( Arrays.toString(maxHeapify(a,i)) );
			System.out.println(heapSize - 7);
	}
}
