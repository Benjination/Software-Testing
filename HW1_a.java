public class HW1_a {
    
    public static int findLast(int[] x, int y) {
        //if (x == null) {
        //    throw new NullPointerException("Input array is null");
        //}
        /*
         * The problem with the original code is inside the for loop. i>0 won't work
         * It needs to be able to check the element at array 0 when i = 0. By changing
         * this to i>=0, it will only fail when the counter hits -1. 
         */
        for (int i = x.length - 1; i > 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5};
        int b = 2;
        int c = findLast(a, b);
        
        System.out.println(c);
    }
}
