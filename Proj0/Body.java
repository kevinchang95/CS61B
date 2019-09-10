 public class Body{
	public double xxPos;						//Its current x position
	public double yyPos;						//Its current y position
	public double xxVel;						//Its current velocity in x direction
	public double yyVel;						//Its current velocity in y direction
	public double mass;							//Its mass
	public String imgFileName;					//The name of the file that corresponds to the image that depicts the body
	public static double G = 6.67 * Math.pow(10,-11);	//Cavendish gravitational constant
	
	public Body(double xP, double yP,double xV, 
				double yV, double m, String img){
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass  = m;
		imgFileName = img;	
	}
	
	
	public Body(Body b){
		
		xxPos = b.xxPos;
		yyPos = b.yyPos;
		xxVel = b.xxVel;
		yyVel = b.yyVel;
		mass  = b.mass;
		imgFileName = b.imgFileName;			
		
		
	}
 
 
 
	public double calcDistance(Body b){
		double xxPos1 = b.xxPos;
		double yyPos1 = b.yyPos;
		
		double d = Math.sqrt((xxPos1-xxPos)*(xxPos1-xxPos)+(yyPos1-yyPos)*(yyPos1-yyPos));
		
		
		
		return d;
		
	}
 
	public double calcForceExertedBy(Body b){
		double xxPos1 = b.xxPos;
		double yyPos1 = b.yyPos;
		double xxVel = b.xxVel;
		double yyVel = b.yyVel;
		double mass1  = b.mass;
		double d ;
		
		d = this.calcDistance(b);		
		
		double Force = G * mass * mass1 /d/d;
		
		
		
		return Force;
		
	}
 
 
 
 
 
 
 
 }
 