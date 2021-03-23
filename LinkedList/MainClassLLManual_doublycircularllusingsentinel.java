

class Node {
	Node prev;
	int value;
	Node next;
}

class LinkedList {
	Node nil;
	Node head;
	Node tail;
	void inserAtHead(int x) 
	{
		Node n = new Node();
		n.value = x;
		if(nil==null) 
		{
			Node empty = new Node();
			nil = empty;
		}
		if( (head==tail)&&(head==null) )
		{
			head = n;
			tail = n;
			nil.next = head;
			head.prev = nil;
			head.next = nil;
			nil.prev = tail;
			tail.next = nil;
			tail.prev = nil;
			return ;
		}

		nil.next = n;
		n.next = head;
		n.prev = nil;
		head.prev = n;
		head = n;
	}
	void deleteAtTail() 
	{
		if( (head==tail)&&(head==null) ) 
		{
			System.out.println("Error");
			return;
		}
		if(head!=tail) 
		{
			tail.prev.next = nil;
			nil.prev = tail.prev;
			tail.next = null;
			Node backForDel = tail;
			tail = tail.prev;
			backForDel.prev = null;
			backForDel = backForDel.prev;
			return;
		}
		if( (head==tail)&&(head!=null) ) 
		{
			nil.prev = nil;
			nil.next = nil;
			head.next = null;
			head.prev = null;
			head = head.next;
			tail.next = null;
			tail.prev = null;
			tail = tail.next;
			return;
		}
	}
	void displayList() 
	{
		System.out.println("---------");
		if(head==null) 
		{
			System.out.println("ERROR");
			return ;
		}

		if( (head==tail) && (head!=null) )
		{
			System.out.println(head.value + "**");
			return;
		}
		Node temp = head.next;
		System.out.println(head.value + "*");
		while(temp!=nil) 
		{
			System.out.printf("%d",temp.value);
			if(temp==tail)
				System.out.printf("*");
			System.out.printf("\n");
			temp = temp.next;
		}
	}
}


public class MainClassLLManual_doublycircularllusingsentinel {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.inserAtHead(6);
		l.displayList();
		l.inserAtHead(8);
		l.displayList();
		l.inserAtHead(5);
		l.displayList();
		l.inserAtHead(40);
		l.inserAtHead(78);
		l.displayList();
		l.deleteAtTail();
		l.displayList();
		l.deleteAtTail();
		l.displayList();
		l.deleteAtTail();
		l.displayList();
		l.deleteAtTail();
		l.displayList();
		l.deleteAtTail();
		l.displayList();
		l.inserAtHead(100);
		l.displayList();
	}
}
