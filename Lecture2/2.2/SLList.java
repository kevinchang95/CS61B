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

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    
	private IntNode addLast(IntNode p, int x){
		if(p.next == null){
			p.next = new IntNode(x,null);
			return p;
		}			
		
		return addLast(p.next,x);
	}
	
	public void addLast(int x) {
        /* Your Code Here! */
	
		IntNode p = first;
		p = addLast(p, x);
		
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
		if(first.next == null){
			return 1;
		}
		return 1;
	}
	
	public static void main(String[] args){
		SLList p = new SLList(10);
		p.addFirst(5);
		p.addLast(15);
		p.addLast(20);
		System.out.println(p.first.next.next.item);
	
	}
	
	

}
