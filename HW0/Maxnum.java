public class Maxnum {
	
	public static int max(int[] m){

		int i = 0;

		int n = 0;
		int maxnum = 0;

		while(i < m.length){

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
