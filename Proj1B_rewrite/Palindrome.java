public class Palindrome {

    public Deque<Character> wordToDeque(String word){

        char[] letterArray = word.toCharArray();
        Deque d = new ArrayDeque();

        for(int i = 0; i < letterArray.length; i++){

            d.addLast(letterArray[i]);

        }

        return d;
    }

    public boolean isPalindrome(String word){


        Deque d = wordToDeque(word);

        if(d.size() <= 1)return true;

        while(d.removeFirst() == d.removeLast()){

            if(d.size() <= 1)return true;

        }

        return false;

    }


}
