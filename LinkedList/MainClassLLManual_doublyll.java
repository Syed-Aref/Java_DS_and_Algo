
class Node {
	Node prev;
	int value;
	Node next;
}


class LinkedList {
	Node head;
	void insertAtStart(int x) 
	{
		Node n = new Node();
		n.prev = null;
		n.next = null;
		n.value = x;
		if(head==null)
			head = n;
		else 
		{
			head.prev = n;
			head.prev.next = head;
			head = n;
		}
	}
	void insertAt(int index,int x) 
	{
		if(index==0)
		{
			insertAtStart(x) ;
			return;
		}
		if( (index<0) || (index!=0 && head==null) )
		{
			System.out.println("Error");
			return;
		}
		Node n = new Node();
		n.prev = null;
		n.next = null;
		n.value = x;
		
		int i = 0;
		Node temp = head;
		while(i<=index - 2 && temp.next!=null)
		{
			temp = temp.next;
			i++;
		}
		if(i==index-1) 
		{
			if(temp.next==null) 
			{
				temp.next = n;
				n.prev = temp;
			}
			else 
			{
				n.next = temp.next;
				temp.next.prev = n;
				temp.next = n;
				temp.next.prev = temp;
			}
		}
		else
		{
			System.out.println("Error");
			return;			
		}
	}
	void insertAtEnd(int x) 
	{
		if(head==null) 
		{
			insertAtStart(x) ;
			return;
		}
		Node n = new Node();
		n.prev = null;
		n.next = null;
		n.value = x;
		
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = n;
		temp.next.prev = temp;		
	}
	void deleteAtStart()
	{
		if(head==null)
		{
			System.out.println("Error");
			return;
		}
		else 
		{
			if(head.next==null) 
			{
				head = head.next;
			}
			else 
			{
				head.next.prev = null;
				head = head.next;
			}
		}
		
	}
	void deleteAt(int index) 
	{
		if(index==0)
		{
			deleteAtStart();
			return ;
		}
		if( (index<0) || (index!=0 && head==null) ) 
		{
			System.out.println("Error");
			return;
		}
	    Node temp = head;
	    int i = 0;
		while(i<=index - 2 && temp.next!=null)
		{
			temp = temp.next;
			i++;
		}
		if( (i<=index-1 && temp.next==null)||(i<index-1) ) 
		{
			System.out.println("Error");
		}
		else if(i==index-1) 
		{
			if(temp.next.next==null)
			{
				temp.next.prev = null;
				temp.next = null;
			}
			else
			{
				temp.next = temp.next.next;
				temp.next.prev = temp;
			}
		}
		
	}
	void deleteAtEnd() 
	{
		if(head==null) 
		{
			System.out.println("Error");
			return;
		}
		if(head.next == null) 
		{
			head = head.next;
			return;
		}
	    Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.prev.next = null;
		
	}
	
	void display() 
	{
		if(head == null) 
		{
			System.out.println("Error");
			return;						
		}
		Node temp = head;
		System.out.println("----->");
		while(temp.next!=null)
		{	
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
		System.out.println("----->");
	}
}


public class MainClassLLManual_doublyll {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insertAtEnd(67);
		l.insertAt(0,787);
		l.insertAt(2,757);
		l.insertAtEnd(47);
		l.insertAt(3,56);
		
		
		
		
		l.display();
		
		l.deleteAt(4);
		
		l.display();
		
		l.deleteAtEnd();
		
		l.display();
		l.insertAt(1,45);
		l.display();
	}
}
