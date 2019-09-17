public class IntList{
	public int first;
	public IntList rest;
	
	
	public IntList(int f, IntList r){
		first = f;
		rest  = r;
		
	}
	
	public static int size(IntList l){
		int i = 0;					//List Length
		
		if(l!=null){
			l = l.rest;
			i = i + IntList.size(l);
			
		
		}
		else{
			i = 1;
		}
		return i;
	}
	
	
	public static void main(String[] args){
		
		IntList L = new IntList(15,null);
		L = new IntList(10,L);
		L = new IntList(5,L);
		
		
		System.out.println("The length of the List is: "+IntList.size(L));
	}




}