public class Dog implements OurComparable{

    String type;
    int size;


    public Dog(String t, int s){
        type = t;
        size = s;

    }


    @Override
    public int compareTo(Object d){
        Dog dd = (Dog) d;
        if(size > dd.size){
            return 1;

        }else if(size == dd.size){
            return 0;

        }else{
            return -1;
        }


    }


    public void bark(){

        System.out.println(type + " says: bark!");


    }




}
