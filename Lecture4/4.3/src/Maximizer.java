import java.util.Comparator;
public class Maximizer {

    public static Comparable max(Comparable items[]){
        int maxIndex = 0;

        for(int i = 0; i < items.length;i++){

            if(items[i].compareTo(items[maxIndex]) > 0){

                maxIndex = i;
            }


        }

        return items[maxIndex];

    }

    public static void main(String[] args) {

        Dog[] ds= new Dog[3];
        ds[0] = new Dog("Archilles",5);
        ds[1] = new Dog("Socrates",10);
        ds[2] = new Dog("Plato",15);

        Comparator<Dog> nc = Dog.returnComparator();

        Dog maxDog = (Dog) max(ds);
        if(nc.compare(ds[0],ds[1]) > 0 ){

            ds[0].bark();
        }else{

            ds[1].bark();
        }
//        maxDog.bark();


    }





}
