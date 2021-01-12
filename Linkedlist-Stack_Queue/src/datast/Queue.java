package datast;

public class Queue {

	Node head;
	
	public static void enqueue(Queue q, int data) {
		Node nnode = new Node(data);
		nnode.next=null;
		
		if(q.head==null) {
			q.head = nnode;
		}
		else {
			Node curnode = q.head;
			while(curnode.next!=null) {
				curnode = curnode.next;
			}
			curnode.next=nnode;
		}
	}
	
	public static void dequeue(Queue q) {
		Node curnode = q.head;
		
		if(curnode==null) {
			System.out.println("Queue empty");
		}
		else {
			curnode=curnode.next;
			q.head= curnode;
		}
	}
	
	public static void print(Queue q) {
		Node curnode = q.head;
		
		while(curnode!=null) {
			System.out.println(curnode.data);
			curnode=curnode.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		enqueue(q, 1);
		enqueue(q, 3);
		enqueue(q, 6);
		enqueue(q, 7);
		enqueue(q, 10);
		print(q);
		dequeue(q);
		dequeue(q);
		print(q);
		dequeue(q);
		print(q);
	}

}
