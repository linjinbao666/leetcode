package compete;

import java.util.HashSet;
import java.util.Set;

/**
 * 删除字符串中的所有相邻重复项 II
 */
public class C5206 {

    public String removeDuplicates(String s, int k) {
        if (s==null || s=="") return "";

        Set<Character> set = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }

        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0; i<set.size(); i++){
            while (k>0)stringBuffer.append(set.iterator().next());  //拼接字符串
            System.out.println(stringBuffer.toString());
            String string = stringBuffer.toString();
            s.replace(string,"");
            System.out.println("s=:"+s);

        }

        return "";
    }
}
