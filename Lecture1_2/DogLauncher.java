public class DogLauncher{
	public static void main(String[] args){
		//Dog d = new Dog(20) ;
		//d.WeightInPounds = 50;
		
		/**Dog smallDog;				//Declaration of a Dog variable
		new Dog(20);				//Instantiation of the Dog class as a Dog Object!
		smallDog = new Dog(5);		//Instantiation and assignment
		Dog LargeDog = new Dog(150);	//Declaration,Instantiation and assignment
		
		smallDog.makeNoise();
		smallDog.classification();
		LargeDog.makeNoise();
		LargeDog.classification();
		*/
		//d.makeNoise();
		//Dog.makeNoise();
		
		Dog[] dogs= new Dog[2];
		dogs[0] = new Dog(20);
		dogs[1] = new Dog(150);
		dogs[0].makeNoise();
		dogs[0].classification();
		dogs[1].makeNoise();
		dogs[1].classification();
		
		
		
		Dog thatmaxdog = new Dog();
		thatmaxdog = Dog.maxDog(dogs[0],dogs[1]);
		thatmaxdog.makeNoise();
		
		System.out.println(Dog.binomen);
		
		/**
		Dog smallDog = new Dog(5);
		Dog mediumDog = new Dog(25);
		Dog hugeDog = new Dog(150);
		
		Dog[] manyDogs = new Dog[4];
		manyDogs[0] = smallDog;
		manyDogs[1] = hugeDog;
		manyDogs[2] = new Dog(130);
		
		int i = 0;
		while(i < manyDogs.length){
			Dog.maxDog(manyDogs[i],mediumDog).makeNoise();
			i = i + 1;
		}
		*/
		
		
	}
}