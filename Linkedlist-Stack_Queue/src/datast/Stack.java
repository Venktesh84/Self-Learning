package datast;

public class Stack {

	Node head;
	
	public static void push(Stack st,int data) {
		Node nnode = new Node(data);
		nnode.next=null;
		
		if(st.head==null) {
			st.head = nnode;
		}
		else {
			Node curnode = st.head;
			st.head = nnode;
			nnode.next=curnode;
		}
	}
	
	public static void pop(Stack st) {
		Node curnode = st.head;
		
		if(curnode==null) {
			System.out.println("Stack is empty");
		}
		else {
			curnode = curnode.next;
			st.head=curnode;
		}
	}
	
	public static void print(Stack st) {
		Node curnode = st.head;
		
		while(curnode!=null) {
			System.out.println(curnode.data);
			curnode=curnode.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		
		push(st, 2);
		push(st, 5);
		push(st, 9);
		push(st, 14);
		print(st);
		pop(st);
		print(st);
		pop(st);
		print(st);
	}

}
