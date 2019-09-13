 public class Body{
	public double xxPos;						//Its current x position
	public double yyPos;						//Its current y position
	public double xxVel;						//Its current velocity in x direction
	public double yyVel;						//Its current velocity in y direction
	public double mass;							//Its mass
	public String imgFileName;					//The name of the file that corresponds to the image that depicts the body
	public static double G = 6.67 * Math.pow(10,-11);	//Cavendish gravitational constant
	
	public Body(double xP, double yP,double xV, 		//First constructor, defining all parameters
				double yV, double m, String img){
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass  = m;
		imgFileName = img;	
	}
	
	
	public Body(Body b){								//Second constructor, make a clone for selected bodyf
		
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
 
 
	public double calcForceExertedByX(Body b){
		double Force;
		double ForceX;
		double xxPos1 = b.xxPos;
		double d;
		
		Force = this.calcForceExertedBy(b);
		  d   = this.calcDistance(b);
		
		
		ForceX = Force*(xxPos1-xxPos)/d;
		
		return ForceX;
		
 	}
 
	public double calcForceExertedByY(Body b){
		double Force;
		double ForceY;
		double yyPos1 = b.yyPos;
		double d;
		
		Force = this.calcForceExertedBy(b);
		  d   = this.calcDistance(b);
		
		
		ForceY = Force*(yyPos1-yyPos)/d;
		
		return ForceY;
		
 	}
 
 
	public double calcNetForceExertedByX(Body[] bs){
		double NetForceX = 0;
		double ForceX;
		
		for(Body b : bs){
			
			// if (b == this){
			if (b.equals(this)){				//Try another type of equal
				continue;
			}
			
			ForceX = this.calcForceExertedByX(b);
			NetForceX = NetForceX + ForceX;
	
		}
	
		return NetForceX;
	
	}
 
	public double calcNetForceExertedByY(Body[] bs){
		double NetForceY = 0;
		double ForceY;
		
		for(Body b : bs){
			// if (this == b){
			if(b.equals(this)){
				continue;
			}
			ForceY = this.calcForceExertedByY(b);
			NetForceY = NetForceY + ForceY;
	
		}
	
		return NetForceY;
	
	}
 
	public void update(double dt, double ForceX, double ForceY){
		double accX;
		double accY;
		
		accX = ForceX/mass;
		accY = ForceY/mass;
		
		xxVel = xxVel + accX * dt;
		yyVel = yyVel + accY * dt;
		
		xxPos = xxPos + xxVel * dt;
		yyPos = yyPos + yyVel * dt;
	
	}
 
 
 
	public void draw(){
		String imageToDraw = "images/"+imgFileName;
		
		StdDraw.picture(xxPos,yyPos, imageToDraw);		//Set image to fill the whole screen!
		StdDraw.show();
	
	
	
	
	}
	
	
	
 }
 