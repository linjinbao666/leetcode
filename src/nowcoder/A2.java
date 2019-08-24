package nowcoder;

/**
 * 替换空格
 */
public class A2 {
    public static String replaceSpace(StringBuffer str){
        char[] chars = "%20".toCharArray();
        StringBuffer tmp = new StringBuffer();
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ' ') tmp.append("%20");
            else tmp.append(str.charAt(i));
        }
        return tmp.toString();
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We Are Happy.");
        String out = replaceSpace(stringBuffer);
        System.out.println(out);

    }
}
