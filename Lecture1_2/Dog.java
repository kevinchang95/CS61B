public class Dog{
	
	public int WeightInPounds;
	public String dogType;
	
	public Dog(int w){
		WeightInPounds = w;			//This is a constructor!!
	}
	
	
	
	public void makeNoise(){
		if(WeightInPounds<10){
			System.out.println("Yip~");
			dogType = "Tiny dog";
			
		}else if(WeightInPounds<30){
			System.out.println("Bark!");
			dogType = "Mid-size dog";
			
		}else {
			System.out.println("WOOOF!");
			dogType = "Large dog";
		}
		System.out.println("This is a " + dogType);
	}



}