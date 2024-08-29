public class HW1_b {

    public static int countPositive(int[] x) {
        int count = 0;
        for(int i = 0;i < x.length;i++)
        {
            /*
             * The problem with this code is inside the if loop. if(x[i]>= 0 includes the zero
             * which should not be included in the count. By changing this to x[i] > 0, it would disclude any xeros
             * and make the count correct
             */
            if(x[i] >= 0) //fault
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //index two enters program into error state
        int[] a = {-1, 2, 0, 2};
        int c = countPositive(a);
        
        System.out.println(c);
    }
}
//Output produces failure due to fault and error state
