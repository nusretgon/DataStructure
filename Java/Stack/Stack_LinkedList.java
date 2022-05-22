public class Stack_LinkedList implements Stack{
	
	Node<Integer> top;

	public Stack_LinkedList() {
		top=null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}

	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		Node<Integer> newNode = new Node (data, top);
		top=newNode;
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int retVal=top.data;
		top=top.next;
		return retVal;
	}

	@Override
	public int top() {
		// TODO Auto-generated method stub
		return top.data;
	}
	
}
