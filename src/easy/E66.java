package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一
 * 思路：递归
 */
public class E66 {
    public static int[] plusOne(int[] digits) {
         return plus(digits,1,digits.length-1);
    }

    public static int[] plus(int[] digits, int carry, int endIndex){
        if (carry == 0) return digits;
        if (endIndex==0 && carry==1) {
            if (digits[endIndex] == 9){
                int[] arr = new int[digits.length+1];
                arr[0] = 1;
                digits[endIndex] = 0;
                for (int i=0; i<digits.length; i++){
                    arr[i+1] = digits[i];
                }
                return arr;
            }
            digits[endIndex] +=1;
            return digits;
        }
        if (digits[endIndex] == 9){
            digits[endIndex] = 0;
            endIndex--;
            return plus(digits,1,endIndex);
        }
        digits[endIndex] +=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digsts = {1,9,9};
        int[] out = plusOne(digsts);

        for(int i= 0; i<out.length; i++){
            System.out.println(out[i]);
        }
    }
}
