public class HW1_b {

    public static int countPositive(int[] x) {
        int count = 0;
        for(int i = x.length;i++)
        {
            if(x[i] >= 0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5};
        int c = findLast(a, b);
        
        System.out.println(c);
    }
}
