public class Palindrome {

    public Deque<Character> wordToDeque(String word){
        Deque<Character> q = new ArrayDeque<>();
        for(int i = 0; i < word.length(); i++){
            q.addLast(word.charAt(i));
        }
        return q;
    }

    /*public boolean isPalindrome(String word){
        Deque<Character> q = wordToDeque(word);
        while(q.size() != 1 && q.size() != 0){
            if(!(q.removeFirst().equals(q.removeLast()))){
                return false;

            }

        }
        return true;
    }*/

    private boolean isPalindrome(Deque q){

        if(q.size() <= 1){
            return true;
        }
            return ((q.removeFirst().equals(q.removeLast())) && isPalindrome(q));


    }

    public boolean isPalindrome(String word){
        Deque<Character> q = wordToDeque(word);
        return isPalindrome(q);
    }


    private boolean isPalindrome(Deque q, CharacterComparator cc){


        if(q.size() <= 1){
            return true;
        }

        return ((cc.equalChars((char)q.removeFirst(), (char)q.removeLast() )) && isPalindrome(q,cc));

    }

    public boolean isPalindrome(String word, CharacterComparator cc){
        Deque<Character> q = wordToDeque(word);
        return isPalindrome(q,cc);
    }

}
