public class Palindrome {

    public Deque<Character> wordToDeque(String word){
        Deque<Character> q = new ArrayDeque<>();
        for(int i = 0; i < word.length(); i++){
            q.addLast(word.charAt(i));
        }
        return q;
    }

    public boolean isPalindrome(String word){
        Deque<Character> q = wordToDeque(word);
        while(q.size() != 1 && q.size() != 0){
            if(!(q.removeFirst().equals(q.removeLast()))){
                return false;

            }

        }



        return true;
    }


}