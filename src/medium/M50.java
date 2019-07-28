package medium;

import annotation.OverHideMethods;

/**
 * Pow(x, n)
 * 
 * @author linjinbao
 *
 */
public class M50 {
	public static double myPow(double x, int n) {
		if(x==1.0) return 1.0;
		if(x==-1.0 && n==Integer.MIN_VALUE) return 1.0;
		long m = n;
		if (m < 0) {
			x = 1 / x;
			m = -m;
		}
		if (m > Integer.MAX_VALUE)return 0;
		double sum = 1;
		double curr = x;
		for (long i = m; i > 0; i /= 2) {
			if ((i % 2) == 1)sum = sum * curr;
			curr = curr * curr;
		}
		return sum;
	}

	@OverHideMethods("时间超过限制")
	private static double myPow2(double x, int n) {
		if (n < 0) {
			x = 1 / x;
			n = -n;
		}
		double sum = 1;
		while (n > 0) {
			sum = sum * x;
			n--;
		}
		return sum;
	}

	public static void main(String[] args) {
		double x = -1.0;
		int n = -2147483648;
		double out = myPow(x, n);
		System.out.println(out);
	}
}
