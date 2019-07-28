package easy;

/**
 * 有效的完全平方数
 * @author linjinbao
 *
 */
public class E367 {
	public static boolean isPerfectSquare(int num) {
		long sum =0;
		int i=1;
		while(sum <= num) {
			sum = sum+i;
			if(sum==num) return true;
			i+=2;
		}
		return false;
	}
    public static void main(String[] args) {
		int num = 14;
		boolean b = isPerfectSquare(num);
		System.out.println(b);
	}
}
