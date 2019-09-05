public class Triangle {
	
	public static void drawTriangle(int N){

		int i = 1 ;

		int j = 1;

		while(i < N+1){

			j=1;

			while(j <= i){

				System.out.print("*");

				j = j + 1;

			}

			System.out.println();

			i = i + 1;

		}

	}

	public static void main(String[] args){

		drawTriangle(10);
	}
}
