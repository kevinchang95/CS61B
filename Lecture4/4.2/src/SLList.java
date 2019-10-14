 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList<datatype> implements CS61Blist<datatype> {
	private class Node {
		public datatype item;
		public Node next;

		public Node(datatype i, Node n) {
			item = i;
			next = n;

		}
	} 

	/* The first item (if it exists) is at sentinel.next. */
	private Node sentinel;
	private int size;



	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new Node(null, null);
		size = 0;
	}

	public SLList(datatype x) {
		sentinel = new Node(null, null);
		sentinel.next = new Node(x, null);
		size = 1;
	}

	 @Override
 	/** Adds x to the front of the list. */
 	public void AddFirst(datatype x) {
 		sentinel.next = new Node(x, sentinel.next);
 		size = size + 1;
 	}
	 @Override
 	/** Returns the first item in the list. */
 	public datatype getFirst() {

 		return sentinel.next.item;
 	}
	@Override
 	public datatype getLast(){
 		Node p = sentinel;

 		while(p.next!= null){
 			p = p.next;

		}

 		return p.item;
	}


	 @Override
 	/** Adds x to the end of the list. */
 	public void AddLast(datatype x) {
 		size = size + 1; 		

 		Node p = sentinel;

 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new Node(x, null);
 	}

 	@Override
 	public datatype RemoveLast(){
 		size -= 1;
 		if(size < 0){
 			System.out.println("Already an empty list!");
 			size = 0;
 			return null;

		}
 		Node p = sentinel;

 		while(p.next != null){
 			p = p.next;
		}

		Node m = new Node(p.item,null);

 		p = null;

 		return m.item;

	}
	@Override
	public void insert(datatype m, int pos){
		Node p = sentinel;
		Node q = new Node(m,null);
		for (int i = 0; i< pos; i++){
			p = p.next;
		}

		q.next = p.next;
		p.next = q;

	}
	@Override
 	/** Returns the size of the list. */
 	public int size() {

 		return size;
 	}
 	@Override
	public datatype get(int m){
 		Node p = sentinel;
 		for(int i = -1; i < m; i++){
 			p = p.next;

		}
		return p.item;

	}
	@Override
	 public void print(){

 		for(Node p = sentinel.next; p!=null; p = p.next){

 			System.out.print(p.item + " ");
		}
 		System.out.println();
	}


}