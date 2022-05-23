public class Queue extends node implements Queue_Interface{	// This ADT(Abstract data type)  is FIFO(First in First Out) mentality.
		Queue(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
		node tail=null;
		node head=null;
		public node Tail() {
			node curr=new node(data);
			while (curr.next!=null) {	//We are doing traversal to the end.
				curr=curr.next;
			}
			return curr;
		}
		public int peek() { // it is used to get the element at the front of the queue without removing it
			return head.data;
		}
		public boolean isEmpty() {
			return head==null;
		}
		public void enqueue(int data) { 
			node el=new node(data);
			if (isEmpty()) {
				head=el;
				tail=el;
			}
			else {
				tail.next=el;
				tail=el;
			}
		}
		public int dequeue() {
			if (isEmpty()) {
				return -1;
			}
			if (head.next==null) {
				int Del=head.data;
				head=null;
				tail=null;
				return Del;
			}
			else {
				int Del=head.data;
				head=head.next;
				return Del;
			}
		}
		public void clear() {
			head=null;
			tail=null;
		}
}

