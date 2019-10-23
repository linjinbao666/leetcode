package easy;

/**
 * 最长公共前缀
 */
public class E14 {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len==0) return "";
        if (len==1) return strs[0];

        String str = strs[0];

        for (int i=1; i < strs.length; i++){
            while (strs[i].indexOf(str)!=0){
                str = str.substring(0,str.length()-1);
                if (str=="") return "";
            }
        }
        return str;

    }
}
