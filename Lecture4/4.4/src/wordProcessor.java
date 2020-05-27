import java.util.*;

public class wordProcessor {

    public static String cleanString(String s){

        return s.toLowerCase().replaceAll("[^a-z]","");
    }


    public static List<String> getWords(String inputFileName){

        In in = new In(inputFileName);
        List<String> words = new ArrayList<>();

        while(!in.isEmpty()){

            String word = cleanString(in.readString());
            words.add(word);

        }

        return words;

    }


    public static int countUniqueWords(List<String> words){
        int count = 0;
        Set<String> uWords = new HashSet<>();
        /*for(int i = 0; i< words.size();i++){

            uWords.add(words.get(i));

        }*/
        /**better implementation for iteration*/

        for(String s: words){
            uWords.add(s);
        }
        count = uWords.size();
        return count;

    }


    public static Map<String,Integer> collectWorldCount(List<String> target, List<String> words){

        Map<String,Integer> counts = new HashMap<>();
        for (String t :target){

            counts.put(t,0);
        }
        for (String w:words){
            if(counts.containsKey(w)){

                counts.put(w, counts.get(w)+1);
            }
        }
        return counts;
    }

    public static void main(String[] args) {

        String inputFileName = "README.md";
        List<String> words = getWords(inputFileName);
        for(int i = 0; i< words.size(); i+= 1){

            System.out.println(words.get(i));
        }
        int count = countUniqueWords(words);
        System.out.println("There are " + count+" unique words");

        Set<String> uWords = new HashSet<>(words);
        System.out.println(uWords.size());

        List<String> targets = new ArrayList<>();
        targets.add("kevin");
        targets.add("horse");
        targets.add("branch");
        System.out.println(collectWorldCount(targets,words));

    }





}
