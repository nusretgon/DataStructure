
public class LinkedList<Type> implements List<Type> {
	protected Node<Type> head;
	
	LinkedList(){
		this.head=null;
	}
	@Override
	public void Insert(Type item) {
		// TODO Auto-generated method stub
		Node<Type> newNode= new Node<Type>(item,null);
		if(head==null) {
			head=newNode;
		}
		else {
			Node<Type> p=head;
			
			while(p.next!=null)	{	// We are searching last node.
				p=p.next;			// p is our counter node.
			}			
				p.next=newNode;		// p is the last node. p.next our new node.
		}
	}
	
	
	public Node<Type> findhead() {
		return head;
	}

	@Override
	public Node<Type> findprevious(Node<Type> r) {	// We take as a argument r node. We want to find the node before r node.
		// TODO Auto-generated method stub
		Node <Type> temp=head;						// We create controller node.
		while(temp!=null) {
			
			if(temp.next.data==r.data) {			// Comparing next of controller node and r node.
				return temp;
			}
			temp=temp.next;							// Counter process
		}
		return null;
	}
	
	

	@Override
	public boolean search(Type item) {
		// TODO Auto-generated method stub
		Node<Type> p=head;
		
		while(p!=null) {
			if(p.data==item) {
				System.out.println("data is found");
				return true ;
			}
			p=p.next;
		}
		System.out.println("data is not found");
		return false;
	}
	
	

 
	public Node<Type> sort() {
		Node<Type> p=head;
		while(p!=null) {
			Type temp=p.data;
			Node<Type> r=p.next;
			while(r!=null) {
				if((int)r.data < (int) p.data) {
					Type temp2 =p.data;
					p.data=r.data;
					r.data=temp2;
				}
				r=r.next;
			}
			p=p.next;
		}
		return null;

	}
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Node<Type> curr=head;
		
		while(curr!=null) {
			System.out.print(curr.data.toString()+"-->");
			curr=curr.next;
		}
		System.out.println("null");
	}
	@Override
	public void Delete(Type item) {		// We are searching value to delete and we delete node that have unwanted value.
		// TODO Auto-generated method stub
		Node<Type> p=head;
		while (p.next.data==item) {		
			p=p.next;
		}
		p.next=p.next.next;
	}
	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub
		head=null;
	}
	


	
}
