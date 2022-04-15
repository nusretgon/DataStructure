public class LinkedList {
	public class Element{
		int data;
		Element next;
		Element(int data){
			this.data=data;
		}
	}
	Element head;
	public int top() {
		return head.data;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void push(int data) { 		
		Element el=new Element(data);
		if (isEmpty()) {
			head=el;
		}
		else {
			el.next=head; 		// We are adding new element to head.
			head=el;		// Stacks also like that.
		}
	}
	public int pop() {	    // The difference between delete and pop is,
		if (isEmpty()) {    // We take deleted element in pop method.
			return -1;
		}
		else {
			int del=head.data;
			head=head.next;
			return del;
		}
	}
	public void delete() { // I choose first element in the linked list to be deleted.
		head=head.next;
	}
	public void clear() {
		head=null;
	}
}
