public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 
	private int size;					//compute size at each methods

    public SLList(int x) {
        first = new IntNode(x, null);
		size = 1;
    }
	
	public SLList(){					//Constructor for empty list
		first = null;
		size = 0;
	}
	
	
    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
		size += 1;
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. 
	    This is an recursive method that uses 
		nested method.*/
		
	private IntNode addLast(IntNode p, int x){
		
		if(p.next == null){
			p.next = new IntNode(x,null);
			return p;
		}			
		
		return addLast(p.next,x);
	}
	
	public void addLast(int x) {
        /* Your Code Here! */
		if(first == null){
			first = new IntNode(x,null);
		}else{
			IntNode p = first;
			p = addLast(p, x);
		}
		size += 1;
    }


	 /** Get the size of the SLList through traverse the list. 
	    This is an recursive method that uses 
		nested method.*/
	/**private static int size(IntNode p){
		if(p.next == null){
			return 1;
		}
		
		
		return 1 + size(p.next);
		
	
	}*/
		
    /** Returns the number of items in the list using recursion. */
    // public int size() {
        // /* Your Code Here! */
		
		// return size(first);
	// }
	
	
	public int size(){
	
		return size;
	}
	
	public static void main(String[] args){
		// SLList p = new SLList(10);
		SLList p = new SLList();
		// p.addFirst(5);
		p.addLast(15);
		p.addLast(20);
		System.out.println(p.first.next.item);
		System.out.println(p.size());
	
	
	}
	
	

}
