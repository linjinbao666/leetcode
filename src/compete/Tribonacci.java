package compete;

import annotation.Unused;

/**
 * 泰博拉切数
 */
public class Tribonacci {

    private static int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(n>37) return 0;

        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for (int i=3; i<n+1; i++){
            array[i] = array[i-1]+array[i-2]+array[i-3];
        }
        return array[n];
    }

    @Unused("没用到")
    private static int option1(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(n>37) return 0;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }


    public static void main(String[] args) {
        int n = 25;
        int out = tribonacci(n);
        System.out.println(out);
    }
}
