package easy;

/**
 * 整数反转
 * 
 * @author linjinbao
 *
 */
public class E7 {
	//123 ->321
	public static int reverse(int x) {
		long y = x;
		if(x <0) y = -x;
		long sum = 0;
		while(y>0) {
			long tmp = y%10;
			sum = sum*10+tmp;
			y = y/10;
		}
		if(sum > Integer.MAX_VALUE || sum <Integer.MIN_VALUE) return 0;
		return (int) (x>0 ?sum:-sum); 
	}	
	
	public static void main(String[] args) {
		int x = -1534236469;
		int out = reverse(x);
		System.out.println(out);
	}
}
