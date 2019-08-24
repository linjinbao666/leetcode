package compete;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 拼写单词
 */
public class C5048 {
    //words = ["cat","bt","hat","tree"], chars = "atach"
    public static int countCharacters(String[] words, String chars) {
        List<Character> list = new ArrayList<Character>();
        for (int i=0; i<chars.length(); i++){
            list.add(chars.charAt(i));
        }
        int len = 0;
        for (int i=0 ;i<words.length; i++){
            String nowStr = words[i];
            boolean contain = true;
            int nowStrLen = nowStr.length();
            if (nowStrLen > chars.length()) continue;
            List<Character> tmpList = list;
            for (int j=0;j<nowStrLen; j++){
                if(!tmpList.contains(nowStr.charAt(j))) {
                    contain = false;
                    break;
                }
                tmpList.remove(tmpList.indexOf(nowStr.charAt(j)));
            }
            if (contain==true) len+=nowStrLen;
        }
        return len;
    }

    public static void main(String[] args) {

        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int out =countCharacters(words,chars);
        System.out.println(out);
    }
}
