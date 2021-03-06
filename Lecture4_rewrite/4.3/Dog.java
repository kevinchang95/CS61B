import java.util.Comparator;
//public class Dog implements OurComparable{
public class Dog implements Comparable<Dog>{
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public static class NameComparator implements Comparator<Dog>{


        public int compare(Dog d1, Dog d2){

            return d1.name.compareTo(d2.name);

        }

    }

    public static class SizeComparator implements Comparator<Dog>{


        public int compare(Dog d1, Dog d2){

            return d1.size - d2.size;

        }

    }


    public void bark() {
        System.out.println(name + " says: bark");
    }

    @Override
    public int compareTo(Dog o){
//        Dog dogO = (Dog) o;
        /*if(this.size < dogO.size)return -1;
        else if(this.size == dogO.size)return 0;
        else return 1;*/

//        return this.size - dogO.size;
        return this.size - o.size;
    }





}