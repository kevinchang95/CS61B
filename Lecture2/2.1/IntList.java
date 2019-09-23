public class IntList{
	public int first;
	public IntList rest;
	
	
	public IntList(int f, IntList r){
		first = f;
		rest  = r;
		
	}
	
	// public static int size(IntList l){
		// int i = 0;					//List Length
		
		// if(l!=null){
			// l = l.rest;
			// i = i + IntList.size(l);
			
		
		// }
		// else{
			// i = 1;
		// }
		// return i;
	// }
	
	
	// public static int size(IntList l){			//Hug's strategy, Chang modified	
		// if(l.rest == null){
			// return 1;
		// }
		// return 1+IntList.size(l.rest);
		
	// }
	
	
	public int size(){				//Hug's recursion for List!!
		if (this.rest == null){
			return 1;				//Base case, the last node will return 1
		}
		return 1 + this.rest.size();
	}
	
	
	public int iterativeSize(){				//Hug's recursion for ListLength!!
		IntList p = this;
		int i = 0;
		while(p!=null){
			p = p.rest;
			i = i + 1;
			
		}
		return i;
	}
	
	public int get(int q){						//Hug's recursion for GetList!!
		if(q == 0){
		
		return first;
	
		}
		return rest.get(q - 1);
	}
	
	
	public int iterativeGet(int q){				//Chang's iterative method for GetList!!
		IntList l = this;
		while(q != 0){
		
		l = l.rest;
		
		q = q - 1;
		
		}
		
		return l.first;
	}
	
	
	public static void main(String[] args){
		
		IntList L = new IntList(15,null);
		L = new IntList(10,L);
		L = new IntList(5,L);
		
		// IntList p = L;
		// System.out.println("The length of the List is: "+L.size());
		// System.out.println("The length of the List is(Iteratively): "+p.iterativeSize());
		
		// p = p.rest;
		
		System.out.println("The length of the List is: "+L.size());
		// System.out.println("The length of the List is(Iteratively): "+ p.iterativeSize());
		
		System.out.println(L.get(2));
		System.out.println(L.iterativeGet(2));
	}




}