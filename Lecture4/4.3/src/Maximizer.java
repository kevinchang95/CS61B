public class Maximizer {

    public static OurComparable max(OurComparable items[]){
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

        Dog maxDog = (Dog) max(ds);
        maxDog.bark();


    }





}
