import java.util.*;
class Node
{
	Node prev;
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
class DoublyList
{
	Node head;
	Node tail;
	public void traverse()
	{	
	 	if(head==null) {
			System.out.println("List is empty");
		}
		else
		{
			Node current =head;
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
	public void traverseReverse()
	{
		if(tail==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current=tail;
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.prev;
			}
		}
	}
	public void insertBeg(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			head.prev=node;
			node.next=head;
			head=node;
		}
	}
	public void insertEnd(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
	}
	public void insertSpecific(int data)			
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{

			Node current=head;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the position to enter element");
			int pos= sc.nextInt();
			for(int i=1;i<pos-1;i++)
			{
				current =current.next;
			}
			Node temp=current.next;
			current.next=node;
			node.prev=current;	
			node.next=temp;
			temp.prev=node;
		}	
	}
	public void deleteSpecific()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node current=head;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the position to delete element");
			int pos= sc.nextInt();
			for(int i=1;i<pos-1;i++)
			{
				current=current.next;
			}
			Node temp=current.next.next;
			current.next=temp;

		}
	}
	public void deleteBeg()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			head=head.next;
			head.prev=null;
			temp=null;
		}
	}
	public void deleteEnd()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			
		}
	}
}
public class DoublyLinklist
{
	public static void main(String[] args)
	{
		DoublyList list= new DoublyList();
		list.insertEnd(50);
		list.insertEnd(10);
		list.insertEnd(43);
		list.insertEnd(77);
		list.insertSpecific(60);
		list.traverse();
		list.deleteSpecific();
		list.traverse();
	}
}