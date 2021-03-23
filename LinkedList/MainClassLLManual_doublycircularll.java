

class Node {
	Node prev;
	int value;
	Node next;
}


class LinkedList {
	Node head;
	void insertAtEnd(int x) 
	{
		Node n = new Node();
		n.value = x;
		if( head==null )
		{
			head = n;
			head.prev = n;
			head.next = n;
		}
		else 
		{
			Node temp1 = head.prev;
			head.prev = n;
			n.next = head;
			n.prev = temp1;
			n.prev.next = n;
		}
	}
	void insertAtBegining(int x) 
	{
		Node n = new Node();
		n.value = x;
		if( head==null )
		{
			head = n;
			head.prev = n;
			head.next = n;
		}
		else 
		{
			
			Node temp1 = head.prev;
			n.next = head;
			head.prev =n;
			temp1.next = n;
			head = n;
			head.prev = temp1;
			
		}
	}
	void deleteAtFront() 
	{
		if(head == null) {
			System.out.println("ERROR");
			return;
		}
		if(head.next==head) 
		{
			head.next = null;
			head.prev = null;
			head = head.prev;
			return;
		}
		Node temp = head.prev;
		temp.next = head.next;
		temp.next.prev = temp;
		head.next = null;
		head.prev = null;
		head = head.next;
		head = temp.next;
		
	}
	void deleteAtLast() 
	{
		if(head == null) {
			System.out.println("ERROR");
			return;
		}
		if(head.next==head) 
		{
			head.next = null;
			head.prev = null;
			head = head.prev;
			return;
		}
		Node temp = head.prev;
		head.prev = temp.prev;
		head.prev.next = head;
		
		temp.prev = null;
		temp.next = null;
	}
	void show() 
	{
		if(head == null) 
		{
			System.out.println("Error");
			return ;
		}
		System.out.println("------>");
		
		Node temp = head.next;
		System.out.println(head.value + "<--");
		while(temp!=head)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("------>");
	}
}



public class MainClassLLManual_doublycircularll {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insertAtEnd(34);
		l.insertAtEnd(4);
		l.show();
		
		l.deleteAtFront();
		l.show();		
		
		l.insertAtEnd(65);
		l.insertAtEnd(378);
		l.show();
		
		l.insertAtBegining(100);
		l.show();
		
		l.deleteAtFront();
		l.show();
		
		l.deleteAtLast();
		l.show();
		
		l.deleteAtLast();
		l.show();
	}
}
