 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList<T> implements List61B<T>{
	private static class IntNode<T> {
		public T item;
		public IntNode next;

		public IntNode(T i, IntNode n) {
			item = i;
			next = n;
			//System.out.println(this.size);
		}
	} 

	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	private static void lectureQuestion() {
		SLList L = new SLList();
		IntNode n = new IntNode(null, null);
	}

	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new IntNode(null, null);
		size = 0;
	}

	public SLList(T x) {
		sentinel = new IntNode(null, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(T x) {
 		sentinel.next = new IntNode(x, sentinel.next);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public T getFirst() {
 		return (T)sentinel.next.item;
 	}

 	public T getLast(){

		IntNode p = sentinel;

		/*Advance p to the end of the list.*/
		while (p.next != null) {
			p = p.next;
		}

 		return (T)p.item;

 	}

	public void insert(T item, int position){

 		IntNode newNode = new IntNode(item,null);

 		if(position >= size){addLast(item);}

 		IntNode p = sentinel;
 		while(position > 0){

 			p = p.next;
 			position--;
		}

		newNode.next = p.next;
 		p.next = newNode;

	}

	public T get(int index){

 		if(index > size - 1){

 			return null;
		}

 		IntNode p = sentinel;

 		for(int i = 0; i < index + 1; i++){

 			p = p.next;


		}

 		return (T)p.item;

	}

 	/** Adds x to the end of the list. */
 	public void addLast(T x) {
 		size = size + 1; 		

 		IntNode p = sentinel;

 		 /*Advance p to the end of the list.*/
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new IntNode(x, null);
 	}

 	/*public void addLast(int x){
 		if(sentinel.next == null){
 			sentinel.next = x;
		}
		SLList p = sentinel.next;

	}*/

 	public T removeLast(){

 		return null;

	}


 	/** Returns the size of the list. */
 	public int size() {
 		return size;
 	}

 	public void printList(){

 		IntNode p = sentinel.next;

 		while(p != null){

 			System.out.print(p.item + " ");
			p = p.next;
		}

 		System.out.println();

	}

	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
 		SLList<String> L = new SLList<>();
 		L.addFirst("I");
 		L.addLast("have");
 		L.addLast("a");
 		L.addLast("Dog");
 		System.out.println(L.size());
 		L.printList();
 		L.insert("Big",3);
		String Last = L.removeLast();
 		SLList<String> L1 = new SLList<>();

 		String Last1 = L.get(0);
		System.out.println(Last1);
		L.printList();

 	}
}