public class testSort {
    public static void testsort(){

        String[] input = {"i","have","an","egg"};
        String[] expected = {"an","egg","have","i"};

        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(expected,input);

    }

    public static void testfindSmallest() {
        String[] input = {"i","have","an","egg"};
        int expected = 2;

        int cmp = Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expected,cmp);


    }

    public static void testswap(){
        String[] input = {"i", "have","an","egg"};
        String[] expected = {"have","i","an","egg"};

        input = Sort.swap(input,0,1);

        org.junit.Assert.assertArrayEquals(input,expected);
    }

    public static void main(String[] args) {
        testsort();
//        testfindSmallest();
//        testswap();
    }


}
