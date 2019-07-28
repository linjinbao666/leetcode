package easy;

/**
 * x的平方根
 * @author linjinbao
 *
 */
public class E69 {
	public static int mySqrt(int x) {
		int count = 0;
		long sum =0;
		int i=1;
		while(sum <= x) {
			sum = sum+i;
			if(sum>x) break;
			i+=2;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int x = 2147395600;
		System.out.println(Integer.MAX_VALUE);
		int out = mySqrt(x);
		System.out.println(out);
	}
}
