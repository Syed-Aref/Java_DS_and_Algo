


class Node {
	int value;
	Node next;
}



class LinkedList {
	Node tail;
	void insertAtEnd(int x) {
		Node n = new Node();
		n.value = x;
		if(tail==null) 
		{
			tail = n;
			tail.next = n;
		}
		else 
		{
			n.next = tail.next;
			tail.next = n;
			tail = tail.next;
		}
	}
	void insertAtBegining(int x) {
		Node n = new Node();
		n.value = x;
		if(tail==null) 
		{
			tail = n;
			tail.next = n;
		}
		else 
		{
			n.next = tail.next;
			tail.next = n;
		}
	}
	void deleteBegining() 
	{
		if(tail==null) 
		{
			System.out.println("Errro");
			return;
		}
		if(tail.next == tail) 
		{
			tail.next = null;
			tail = tail.next;
			return;
		}
		tail.next = tail.next.next;
	}
	void deleteEnd() 
	{
		if(tail==null) 
		{
			System.out.println("Errro");
			return;
		}
		if(tail.next == tail) 
		{
			tail.next = null;
			tail = tail.next;
			return;
		}
		Node temp = tail.next;
		while(temp.next!=tail) {
			temp = temp.next;
		}
		temp.next = tail.next;
		tail.next = null;
		tail = temp;
	}
	void show() 
	{
		if(tail == null) 
		{
			System.out.println("Error");
			return ;
		}
		System.out.println("------>");
		Node temp = tail.next;
		while(temp!=tail)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value + "<--");
		System.out.println("------>");
	}
}


public class MainClassLLManual_singlycircularll {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.insertAtEnd(10);
		l.show();
	
		l.deleteEnd();
		l.show();
		
		l.insertAtEnd(20);
		l.show();
		
		l.deleteBegining();
		l.show();
		
		l.insertAtEnd(1);
		l.show();
		
		l.insertAtEnd(18);
		l.show();
		
		l.insertAtEnd(40);
		l.show();
		
		l.deleteEnd();
		l.show();
		
		l.deleteEnd();
		l.show();
		
		l.deleteBegining();
		l.show();
	}
}
