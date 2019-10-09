public class testSort {
    public static void testsort(){

        String[] input = {"I","have","an","egg"};
        String[] expected = {"an","egg","have","i"};

        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(expected,input);

    }


    public static void main(String[] args) {
        testsort();

    }


}
