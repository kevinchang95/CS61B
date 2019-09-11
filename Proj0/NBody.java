public class NBody{
	
	
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
		
		System.out.println(numofBody);
		System.out.println(Radius);
		
		for(int i = 0;i < numofBody; i = i + 1){
			
			//planets[i].xxPos = 6; 
			// planets[i].yyPos = in.readDouble();
			// planets[i].xxVel = in.readDouble();
			// planets[i].yyVel = in.readDouble();
			// planets[i].mass  = in.readDouble();
			// planets[i].imgFileName = in.readString();
			
			// System.out.println(planets[i].xxPos);
			// System.out.println(planets[i].yyPos);
			// System.out.println(planets[i].xxVel);
			// System.out.println(planets[i].yyVel);
			// System.out.println(planets[i].mass);
			// System.out.println(planets[i].imgFileName);
		}
		
		
		return planets;
 
	}
















}