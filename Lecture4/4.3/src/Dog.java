public class Dog implements Comparable<Dog>{

    String type;
    int size;


    public Dog(String t, int s){
        type = t;
        size = s;

    }


    @Override
    public int compareTo(Dog d){
        Dog dd = d;
       /* if(size > dd.size){
            return 1;

        }else if(size == dd.size){
            return 0;

        }else{
            return -1;
        }*/

        return this.size - dd.size;
    }


    public void bark(){

        System.out.println(type + " says: bark!");


    }




}
