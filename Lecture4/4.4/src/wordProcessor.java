import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordProcessor {

    public static List<String> getWords(String inputFileName){

        In in = new In(inputFileName);
        List<String> words = new ArrayList<>();

        while(!in.isEmpty()){

            String word = in.readString();
            words.add(word);

        }

        return words;

    }


    public static int countUniqueWords(List<String> words){
        int count = 0;
        Set<String> uWords = new HashSet<>();
        for(int i = 0; i< words.size();i++){

            uWords.add(words.get(i));

        }

        count = uWords.size();
        return count;

    }

    public static void main(String[] args) {

        String inputFileName = "README.md";
        List<String> words = getWords(inputFileName);
//        for(int i = 0; i< words.size(); i++){
//
//            System.out.println(words.get(i));
//        }
        int count = countUniqueWords(words);
        System.out.println("There are " + count+" unique words");



    }





}
