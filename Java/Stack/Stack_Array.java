public class Stack_Array implements Stack_Interface<Integer> {
	int capacity=10;	// We need to define capacity while using arrays
	Object[] items;
	int top;
	
	public Stack_Array() {
		items=new Object[capacity];
		top=-1;		// To control array is empty or not.
	}
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<0;
	}

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if(top>=items.length-1) {
			increaseCapacity();
		}
		top++;
		items[top]=item;
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return 0;
		}
		int retVal=(int)items[top];
		top--;
		return retVal;
	}

	@Override
	public int top() {
		if(isEmpty()) {
			return 0;
		}
		return top;
	}
	void increaseCapacity() {
		capacity*=2;
	}
	
}
