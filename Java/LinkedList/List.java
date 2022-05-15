
public interface List<Type> {
	void Insert (Type item);
	Node<Type>findprevious(Node<Type> r);
	boolean search(Type item);
	void show();
	Node<Type> sort() ;
	void Delete(Type item);
	void DeleteAll();
	

}
