public class Maxnum {
	
	public static int max(int[] m){

		int i;

		
		int maxnum = 0;

		for(i = 0; i < m.length; i=i+1){

			if(m[i] > maxnum){
				maxnum=m[i];
			}			
			i = i + 1;
		}

	return maxnum;
	}

	public static void main(String[] args){

		int maxnum = 0;
		int[] numbers = new int[]{9,2,15,2,22,10,6};
		maxnum=max(numbers);
		System.out.println("The max number of array is: " + maxnum);
	}
}
