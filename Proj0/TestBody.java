public class TestBody{
	public static void main(String[] args){
		Body b1 = new Body (1,1,1,1,10,"Body 1");
		Body b2 = new Body (b1);
		
		
		b2.xxPos = 2;
		b2.yyPos = 2;
		double Force = b1.calcForceExertedBy(b2);
	
		System.out.println("The force exerted on body 1 is "+ Force);
	
	
	
	
	
	}






}