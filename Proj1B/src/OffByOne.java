public class OffByOne implements CharacterComparator {

    @Override
    public boolean equalChars(char a, char b){

        if(Math.abs(a-b) == 1){
            return true;
        }

        return false;
    }


}
