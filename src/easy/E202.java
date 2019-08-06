package easy;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 快乐数
 */
public class E202 {

    private static Set set = new HashSet();
    public static boolean isHappy(int n) {
        int sum =0;
        while (n>0){
            int tmp = n%10;
            sum+=tmp*tmp;
            n/=10;
        }
        if (sum==1) return true;
        if (set.contains(sum)) return false;
        set.add(sum);
        return isHappy(sum);
    }

    public static void main(String[] args) {
        int n = 2;
        boolean out = isHappy(n);
        System.out.println(out);
    }
}
