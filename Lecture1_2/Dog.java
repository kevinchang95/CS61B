public class Dog{
	
	public int WeightInPounds;
	public String dogType;
	
	
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