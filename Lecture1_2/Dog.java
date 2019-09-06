public class Dog{
	
	public int WeightInPounds;				//Instance Variable
	public String dogType;
	
	public Dog(int w){
		WeightInPounds = w;					//This is a constructor!!
	}										//Determines how to instantiate the class.
	
	
	
	public void makeNoise(){				//Non-static Method (Instance method)
		if(WeightInPounds<10){				//If the method is going to be invoked by
			System.out.println("Yip~");		//an INSTANCE(!!!) of the class, it should be
			dogType = "Tiny dog";			//NON-static.
			
		}else if(WeightInPounds<30){
			System.out.println("Bark!");
			dogType = "Mid-size dog";
			
		}else {
			System.out.println("WOOOF!");
			dogType = "Large dog";
		}
		//System.out.println("This is a " + dogType);
	}

	public void classification(){
		
        System.out.println("This is a " + dogType);
		
	}		
	
	
	
}