package easy;

/**
 * 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位
 */
public class A190 {
    public int reverseBits(int n) {
        int sum = 0;
        for (int i=0; i<32; i++){
            int tmp = n>>= 1;
            sum += Math.pow(2,i)*tmp;
        }
        return sum;
    }

    public static void main(String[] args) {
        int out = new A190().reverseBits(43261596);
        System.out.println(out);
    }
}
