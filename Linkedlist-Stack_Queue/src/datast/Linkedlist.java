package datast;

public class Linkedlist {

	Node head;
	
	public static Linkedlist insert(Linkedlist list, int data) {
		Node nnode = new Node(data);
		nnode.next = null;
		
		if(list.head==null) {
			list.head = nnode;
			return list;
		}
		else {
			Node curnode = list.head;
			while(curnode.next!=null) {
				curnode = curnode.next;
			}
			curnode.next = nnode;
			if(curnode.data>nnode.data) {
				int temp;
				temp=curnode.data;
				curnode.data=nnode.data;
				nnode.data=temp;
			}
		}
		return list;
	}
	
	public static void delmid(Linkedlist list) {
		Node curnode = list.head,prev=null;
		int count;
		
		for(count=1; count<list.size(list);count++) {
			prev=curnode;
			curnode = curnode.next;
			
			if(count==list.size(list)/2) {
				System.out.println("mid"+curnode.data);
				prev.next=curnode.next;
				
			}
		}
	}
	
	private static int size(Linkedlist list) {
		Node curnode = list.head;
		int count =0;
		
		while(curnode!=null) {
			count++;
			curnode=curnode.next;
		}
		return count;
	}

	public static void deletelast(Linkedlist list) {
		Node curnode = list.head, prev=null;
		
		while(curnode!=null) {
			prev = curnode;
			curnode = curnode.next;
			if(curnode.next==null) {
				prev.next=null;
				System.out.println("last"+curnode.data);
				break;
			}
		}
	}
	
	public static Linkedlist delete(Linkedlist list, int del) {
		Node curnode = list.head, prev=null;
		
		if(curnode!=null && curnode.data==del) {
			list.head = curnode.next;
			return list;
		}
		while(curnode!=null && curnode.data!=del) {
			prev = curnode;
			curnode = curnode.next;
		}
		if(curnode!=null) {
			prev.next=curnode.next;
		}
		if(curnode==null) {
			System.out.println("List is empty");
		}
		return list;
	}
	
	public static void print(Linkedlist list) {
		Node curnode = list.head;
		
		while(curnode!=null) {
			System.out.println(curnode.data);
			curnode = curnode.next;
		}
	}
	
	public static void search(Linkedlist list, int val) {
		Node curnode = list.head;
		
		while(curnode!=null) {
			if(curnode.data==val) {
				System.out.println("value present");
				return;
			}
			else {
				curnode=curnode.next;
			}
		}System.out.println("Value not found");
	}
	
	
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		
		list = insert(list,22);
		list = insert(list,5);
		list = insert(list,8);
		list = insert(list,25);
		list = insert(list,9);
		print(list);
		delmid(list);
		print(list);
		deletelast(list);
		search(list,5);
		list = delete(list, 5);
		print(list);
		list = delete(list, 2);
		print(list);
		search(list,5);
	}

}
