package easy;

/**
 * »ØÎÄÊı
 * 
 * @author linjinbao
 *
 */
public class E9 {
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		if(0==x) return true;
		int tmp = x;
		StringBuffer sb = new StringBuffer();
		while(0!=tmp) {
			sb.append(tmp%10);
			tmp = tmp/10;
		}
		long reverse = Long.parseLong(sb.toString());
		if(reverse>Integer.MAX_VALUE) return false;
		if(reverse==x) return true;
		return false;
	}
	
	public static void main(String[] args) {
		int x = 2147483647;
		boolean b = isPalindrome(x);
		System.out.println(b);
	}

}
