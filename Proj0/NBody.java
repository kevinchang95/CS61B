public class NBody{
	public static String imageToDraw = "images/starfield.jpg";
	
	public static double readRadius(String fileName){
		
		In in =  new In(fileName);
		int numofBody = in.readInt();
		double Radius = in.readDouble();
		

		return Radius;
	
	}
	


	public static Body[] readBodies(String fileName){
		In in = new In(fileName);
		int numofBody = in.readInt();
		double Radius = in.readDouble();
		Body[] planets = new Body[numofBody];
		
		
		
		// System.out.println(numofBody);
		// System.out.println(Radius);
		
		for(int i = 0;i < numofBody; i = i + 1){
			
			Body b = new Body(0,0,0,0,0," ");
			
			// planets[i].xxPos = in.readDouble(); 
			// planets[i].yyPos = in.readDouble();
			// planets[i].xxVel = in.readDouble();
			// planets[i].yyVel = in.readDouble();
			// planets[i].mass  = in.readDouble();
			// planets[i].imgFileName = in.readString();
			
			b.xxPos = in.readDouble(); 
			b.yyPos = in.readDouble();
			b.xxVel = in.readDouble();
			b.yyVel = in.readDouble();
			b.mass  = in.readDouble();
			b.imgFileName = in.readString();
			
			
			planets[i] = b;
			
						
			// System.out.println(planets[i].xxPos);
			// System.out.println(planets[i].yyPos);
			// System.out.println(planets[i].xxVel);
			// System.out.println(planets[i].yyVel);
			// System.out.println(planets[i].mass);
			// System.out.println(planets[i].imgFileName);
		}
		
		
		return planets;
 
	}


	public static void main(String[] args){
		
		double  T = Double.parseDouble(args[0]);
		double dt = Double.parseDouble(args[1]);
		String fileName = args[2];
		double Radius;
		Body[] Bodies;
		
		
		Radius = NBody.readRadius(fileName);
		Bodies = NBody.readBodies(fileName);
		
		
		// System.out.println("T is "+ T);						//Test passed for fetching data!
		// System.out.println("dt is "+ dt);
		// System.out.println("Radius is " + Radius);
		// System.out.println("First body's image name is "+ Bodies[0].imgFileName);
		
			
		
		StdDraw.enableDoubleBuffering();			//Set scale as (-Radius,Radius)!!
		StdDraw.setScale(-1*Radius, Radius);
		StdDraw.clear();
		// StdDraw.picture(0, 0, imageToDraw, 1, 1);
		StdDraw.picture(0, 0, imageToDraw, 2*Radius, 2*Radius);		//Set image to fill the whole screen!
		StdDraw.show();
	}
	
	
		

}