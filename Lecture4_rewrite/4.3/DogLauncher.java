import java.util.Comparator;
public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 9);
        Dog d3 = new Dog("Benjamin", 15);
        Dog[] dogs = new Dog[]{d1, d2, d3};
        System.out.println(Maximizer.max(dogs));
        Dog d = (Dog) Maximizer.max(dogs);

        Comparator<Dog> nameCompare = new Dog.NameComparator();
        if(nameCompare.compare(d1,d2) > 0){

            d1.bark();

        }else d2.bark();

        Comparator<Dog> sizeCompare = new Dog.SizeComparator();
        if(sizeCompare.compare(d1,d2) > 0){

            d1.bark();

        }else d2.bark();


        Dog largestNameDog = (Dog)Maximizer.max(dogs,nameCompare);
        Dog largestSizeDog = (Dog)Maximizer.max(dogs,sizeCompare);

        largestNameDog.bark();
        largestSizeDog.bark();

    }
}
