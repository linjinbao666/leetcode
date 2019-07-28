package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * @author linjinbao
 *
 */
public class M3 {
	public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int length = s.length();
		int ans =0, i=0, j=0;
		while(i<length && j<length) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}else {
				set.remove(s.charAt(i++));
			}
		}
        return ans;
    }
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		int out = lengthOfLongestSubstring(s);
		System.out.println(out);
		
	}

}
