public class OffByN implements CharacterComparator{

    int N;

    public OffByN(int n){

        N = n;
    }

    @Override
    public boolean equalChars(char a, char b){

        if(Math.abs(a-b) == N){
            return true;
        }

        return false;
    }





}
