package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 位1的个数
 */
public class E191 {
    public int hammingWeight(int n) {
        int count = 0;
        if (n==1) return 1;
        for (int i=0; i<32; i++){
            if ((n & 1)!=0){
                count++;
            }
            n>>=1;
        }
        return count;
    }



    public static void main(String[] args) {
        int out =  new E191().hammingWeight(10);
        System.out.println(out);
    }
}
