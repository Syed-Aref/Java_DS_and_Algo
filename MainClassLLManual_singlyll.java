

class Node {
	int num;
	Node next;
}


class LinkedList {
	Node head;
	void insertAtStart(int x) 
	{
		Node n = new Node();
		n.num = x;
		n.next = null;
		if(head==null)
			head = n;
		else 
		{
			n.next = head;
			head = n;
		}
	}	
	void insertAtEnd(int x)
	{
		Node n = new Node();
		n.num = x;
		n.next = null;
		if(head==null)
			insertAtStart(x);
		else 
		{
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;
			temp.next = n;
		}
	}

	void insertAt(int index,int x) 
	{
		if(index==0)
			insertAtStart(x);	
		else if( (index<0) || (index!=0 && head==null) )
			System.out.println("Error");

		else 
		{
			Node n = new Node();
			n.num = x;
			n.next = null;
			int i = 0;
			Node tempNode = head;
			while(i<=index-2 && tempNode.next!=null)
			{
				tempNode = tempNode.next;
				i++;
			}
			if(i<index-1)
			{
				System.out.println("Error");
				return ;
			}
			if(i==index-1)
			{
			    if(tempNode.next==null)
				{
			    	tempNode.next = n;
				}
			    else
			    {
			    	n.next = tempNode.next;
			    	tempNode.next = n;
			    }
			}

		}
	}
	void deleteAtStart() 
	{
		if(head==null)
		{
			System.out.println("Error");
			return;
		}
		head = head.next;
	}
	void deleteAt(int index) 
	{
		if( (index<0) || (index!=0 && head==null) )
		{
			System.out.println("ERROR");
			return;
		}
		if(index==0) 
		{
			deleteAtStart();
			return ;
		}
		Node tempNode = head;
		int i = 0;
		while(i<=index-2 && tempNode.next!=null) 
		{
			tempNode = tempNode.next;
			i++;
		}
		if(i==index - 1 && tempNode.next!=null)
		{
			tempNode.next = tempNode.next.next;
		}
		else if(i<=index-1 && tempNode.next==null)
		{
			System.out.println("Error");
		}
	}
	void deleteAtEnd() 
	{
		if(head==null) 
		{
			System.out.println("Error");
			return ;
		}
		
		if(head.next==null) 
		{
			head = head.next;
			return ;
		}
		Node tempNode = head;
		while(tempNode.next.next!=null) 
		{
			tempNode = tempNode.next;
		}
		tempNode.next = null;
	}
	void show() 
	{
		System.out.println("--------->");
		if(head==null) 
		{
			System.out.println("Empty");
			System.out.println("--------->");
			return;
		}
		Node temp = head;
		while(temp.next!=null)
		{
			System.out.println(temp.num);
			temp = temp.next;
		}
		System.out.println(temp.num);
		System.out.println("--------->");
	}
}


public class MainClassLLManual_singlyll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.insertAtEnd(7);
		l.insertAtEnd(78);
		l.insertAtEnd(68);
		l.insertAtEnd(57);	
		l.show();
		System.out.println("HEAD: "+l.head.num);
		l.insertAt(3,89);
		l.show();
		l.deleteAtEnd() ;
		l.show();
		l.deleteAt(4) ;
		l.show();
		l.deleteAt(3) ;
		l.show();
		l.deleteAt(2) ;
		l.show();
		l.deleteAt(2) ;
		l.show();
		l.deleteAtEnd() ;
		l.show();
		l.deleteAtEnd() ;
		l.show();
		l.insertAtStart(90);
		l.insertAtStart(45);
		l.insertAtStart(3);
		l.show();
		l.insertAt(2,89);
		l.show();
		l.deleteAt(3);
		l.show();
		l.deleteAtEnd() ;
		l.show();
	}

}
