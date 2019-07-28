package medium;

/**
 * 最长回文子串
 * 
 * @author linjinbao
 */
public class M5 {
	public static String longestPalindrome(String s) {
		int length = s.length();
		if (length == 0)return "";
		if (length == 1)return s;
		int maxLen = 1;
		int begin = 0;
		for(int i=0; i<length; i++) {
			int j = i-1, k = i+1;
			while(j>=0 && k<length && s.charAt(j) == s.charAt(k)) {
				if(k-j+1 > maxLen) {
					maxLen = k-j+1;
					begin = j;
				}
				j--;
				k++;
			}
		}
		for(int i = 0; i < length; i++)//求长度为偶数的回文串
	    {
	        int j = i, k = i + 1;
	        while(j >= 0 && k < length && s.charAt(j) == s.charAt(k))
	        {
	            if(k-j+1 > maxLen)
	            {
	            	maxLen = k-j+1;
	                begin = j;
	            }
	            j--;
	            k++;
	        }
	    }
		return s.substring(begin, begin+maxLen);
	}

	public static void main(String[] args) {
		String s = "bab";
		String out = longestPalindrome(s);
		System.out.println(out);
	}
	
	/**
	 * 复杂度O(n^3)
	 * @param s
	 * @return
	 */
	private static String methodOne(String s) {
		int length = s.length();
		if (length == 0)return "";
		if (length == 1)return s;
		int begin = 0;
		int maxLen = 1;
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				int index1 = i, index2 = j;
				while(index1<index2 && s.charAt(index1)==s.charAt(index2)) {
					index1++;
					index2--;
				}
				if(index1>=index2 && j-i+1>maxLen) {
					maxLen = j-i+1;
					begin = i;
				}
			}
			
		}
		return s.substring(begin, begin+maxLen);
	}
}
