public class OffByN implements CharacterComparator {

    private int N;

    public OffByN(int n){

        N = n;

    }

    @Override
    public boolean equalChars(char a, char b){

        int diff = Math.abs(a - b);

        return (diff == N);


    }






}
