public class Stack_Array<Type> implements Stack<Type>{
	
	int DEFAULT_CAPACITY = 10;
	
	Object[] items;
	
	int top;

	public Stack_Array() { 
		items = new Object[DEFAULT_CAPACITY];
		top = -1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<0;
	}

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if (top >= items.length-1)
	      	System.out.println("Stack is full.");
		else {
			top++;
			items[top] = item;
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		}
		else {
			Type retVal=(Type) items[-1];
			top--;
			return (int) retVal;
		}
		
	}

	@Override
	public int top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}
		return (int) items[top];
	}
}