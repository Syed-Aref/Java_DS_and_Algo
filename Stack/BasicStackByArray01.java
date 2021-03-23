package stack;
import java.util.Scanner;
public class BasicStackByArray01 {
	static int[] arr = new int[15];
	static int top = -1;
	static void push(int x) 
	{
		if( top>=-1 & top<(arr.length-1) )
		{
			++top;
			arr[top] = x;
		}
	}
	static void pop() 
	{
		if(top>=0)
			--top;
	}
	static int Top() 
	{
		if(top>=0 & top<=(arr.length-1))
			return arr[top];
			
		else 
		{
			System.out.println("Stack out of boundary");
			return -1;
		}
		
	}
	static boolean isEmpty() 
	{
		if(top==-1) 
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Push\nPress 2 for pop\nPress 3 for Top\nPress 4 for isEmpty\nPress 0 for ending");
		int command = sc.nextInt();
		while(command!=0) 
		{
			if(command==1) 
			{
				System.out.println("Enter a number to push");
				int x = sc.nextInt();
				push(x);
			}
			if(command==2) 
			{
				pop();
			}
			if(command==3) 
			{
				System.out.println(Top());
			}
			if(command==4) 
			{
				System.out.println(isEmpty());
			}
			System.out.println("Press 1 for Push\nPress 2 for pop\nPress 3 for Top\nPress 4 for isEmpty\nPress 0 for ending");
			command = sc.nextInt();
		}
	}
}
