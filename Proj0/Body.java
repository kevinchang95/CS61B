 public class Body{
	public double xxPos;				//Its current x position
	public double yyPos;				//Its current y position
	public double xxVel;				//Its current velocity in x direction
	public double yyVel;				//Its current velocity in y direction
	public double mass;					//Its mass
	public String imgFilename;			//The name of the file that corresponds to the image that depicts the body
	
	
	public Body(double xP, double yP,double xV, 
				double yV, double m, String img){
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass  = m;
		imgFilename = img;	
	}
	
	
	public Body(Body b){
		
		xxPos = b.xxPos;
		yyPos = b.yyPos;
		xxVel = b.xxVel;
		yyVel = b.yyVel;
		mass  = b.mass;
		imgFilename = b.imgFilename;			
		
		
	}
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
 