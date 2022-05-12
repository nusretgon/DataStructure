
public class Queue {
     
	Eleman head,tail;
	
	public Queue() {
		
		head = null;
		tail = null;
	}
	
	
	public void enqueue(int data) {
		
		Eleman yeni = new Eleman(data);
		
		if(head == null) {	
			head = yeni;
			tail = yeni;
		}
		
		else {
			tail.next = yeni;
			tail = yeni;
		}
	}

	
	public int dequeue() {
		
		if(head == null) {
			head = head.next;
		}
      
		return 0;
	}


	public int front() {
		if(head != null)
		return head.data;
		else
			return Integer.MIN_VALUE;
	}

	
	public boolean isEmpty() {

		return head == null;
	}


	public void show() {

		Eleman temp = head;
		
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}


	public int size() {
		
        Eleman temp = head;
        int count = 0 ;
		
		while(temp != null)
		{
			count ++;
			temp = temp.next;
		}
		return count;
	}

}
