package easy;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 验证回文串
 */
public class E125 {
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        s=s.toLowerCase();
        if (s==null) return false;
        int len = s.length();
        if (len==1) return true;
        for (int i=0;i<len;i++){
            char tmp = s.charAt(i);
            if ((tmp>=48&&tmp<=57) || (tmp>=65&&tmp<=90) || (tmp>=97&&tmp<=122)) sb.append(tmp);
        }
        String sc = sb.toString();
        if (sb.reverse().toString().equals(sc)) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean out= isPalindrome(s);
        System.out.println(out);
    }
}
