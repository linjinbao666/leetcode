package nowcoder;

/**
 * 二进制中1的个数
 */
public class NumberOf1 {
    public int numberOf1(int n){
        int count = 0;
        while(n!=0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}