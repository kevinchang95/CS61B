public class BreakContinue {

  public static void windowPosSum(int[] a, int n) {

    /** your code here */
	int i,j = 0;
	int sum;
	for (i=0; i<a.length-1; i=i+1){
		if(a[i]>=0){
			sum=0;	
			for(j=i;(j<=i+n) && (j<a.length); j=j+1){		
			sum=sum+a[j];	
			}
			a[i]=sum;
		}
	}
 
  }


  public static void main(String[] args) {

    int[] a = {1, 2, -3, 4, 5, 4};

    int n = 3;

    windowPosSum(a, n);


    // Should print 4, 8, -3, 13, 9, 4

    System.out.println(java.util.Arrays.toString(a));

  }

}