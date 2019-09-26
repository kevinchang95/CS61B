public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinal;
	public int size;
	
    public SLList(int x) {
        sentinal = new IntNode(63,null);
		sentinal.next = new IntNode(x, null);
		size = 1;
    }

	public SLList(){
		sentinal = new IntNode(63,null);
		size = 0;
	}
	
	
	
    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        
		sentinal.next = new IntNode(x, sentinal.next);
		size += 1;
		
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return sentinal.next.item;
    }
	
	/**Get ith element of the SLList,
		Using nested methods and recursion.*/
	private int get(IntNode p,int i){
		if(i-- == -1){ 
			return p.item;
		}
		return(get(p.next,i));
		
	}
	
	public int get(int i){
		
		IntNode p = sentinal;
		
		return get(p,i); 
				
	}


    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
		
		size += 1;
		IntNode p = sentinal;
		
		while(p.next != null){
			
			p = p.next;
						
		}
		p.next = new IntNode(x,null);
		
    }
	

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
		return size;
	
	}
	
	public static void main(String args[]){
		SLList l = new SLList();
		l.addFirst(10);
		l.addFirst(5);
		l.addLast(15);
		
		System.out.println(l.size());
		System.out.println(l.get(2));
		
	}
	
}
