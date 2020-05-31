public class WordUtils {

    public static String longestString(List61B<String> list){

        String tmp = list.get(0);
        int longest = tmp.length();
        String longestString = null;

        for(int i = 1; i < list.size(); i++){

            tmp = list.get(i);
            if(tmp.length() > longest){
                longestString = tmp;
                longest = tmp.length();

            }

        }

        return longestString;


    }


    public static void main(String[] args){

        SLList<String> L = new SLList<>();
        L.addLast("I");
        L.addLast("have");
        L.addLast("a");
        L.addLast("Dog");

        System.out.println(WordUtils.longestString(L));

    }



}
