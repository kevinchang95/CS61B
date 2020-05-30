public class Sort {
	/** Sorts strings destructively. */
	public static void sort(String[] x) {


		sort(x,0);


	}

	private static void sort(String[] x, int start){

		if(start == x.length) return;

		int smallestIndex = findSmallest(x,start);
		swap(x,start,smallestIndex);
		sort(x,start + 1);

	}


	public static int findSmallest(String[] x,int start){

		int smallestIndex = start;
		String smallest = x[start];
		for(int i = start; i < x.length; i++){

			int cmp = x[i].compareTo(smallest);
			if(cmp < 0){
				smallest = x[i];
				smallestIndex = i;
			}

		}

		return smallestIndex;
	}

	public static String[] swap(String[] x, int a, int b){

		String buf;
		buf = x[a];
		x[a] = x[b];
		x[b] = buf;

		return x;
	}




	/** Prints out all strings in x. */
	public static void print(String[] x) {

		for(int i = 0; i < x.length; i++){

			System.out.print(x[i] + " ");
			System.out.println();

		}

	}

	/** Outputs the command line arguments
	 * in alphabetical order. */
	public static void main(String[] args) {
	}
}