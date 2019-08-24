package easy;

/**
 * 最长公共前缀
 */
public class E14 {
    public String longestCommonPrefix(String[] strs) {
        int len = 0;
        for (int i = 0; i < strs.length; i++) {
            len = Math.min(len, strs[i].length());
        }
        if (len==0) return "";



        return null;
    }
}
