public class Palindrome {

    public Deque<Character> wordToDeque(String word){

        char[] letterArray = word.toCharArray();
        Deque d = new ArrayDeque();

        for(int i = 0; i < letterArray.length; i++){

            d.addLast(letterArray[i]);

        }

        return d;
    }

    /*public boolean isPalindrome(String word){


        Deque d = wordToDeque(word);

        if(d.size() <= 1)return true;

        while(d.removeFirst() == d.removeLast()){

            if(d.size() <= 1)return true;

        }

        return false;
    }*/


    public boolean isPalindrome(String word){

        Deque d = wordToDeque(word);
        return isPalindrome(d);

    }

    private boolean isPalindrome(Deque d){

        if(d.size() <= 1)return true;
        while(d.removeFirst() == d.removeLast()) {
            return(isPalindrome(d));
        }
        return false;
    }

    /**isPalidrome,use CharacterComparator and Array (No Deque)*/
   /* public boolean isPalindrome(String word, CharacterComparator cc){

        char[] letterArray = word.toCharArray();
        //Deque d = wordToDeque(word);
        if(letterArray.length <= 1){return true;}

        int front = 0;
        int back = letterArray.length - 1;
        int size = letterArray.length;
        while(cc.equalChars(letterArray[front],letterArray[back]) == true){

            front = front + 1;
            back = back - 1;
            size = size - 2;
            if(size <= 1){return true;}

        }


        return false;

    }*/

    public boolean isPalindrome(String word, CharacterComparator cc) {

        //char[] letterArray = word.toCharArray();
        Deque d = wordToDeque(word);
        if(d.size() <=1){return true;}
        while(cc.equalChars((Character)d.removeFirst(),(Character)d.removeLast())){

            if(d.size() <= 1)return true;

        }

        return false;

    }

}
