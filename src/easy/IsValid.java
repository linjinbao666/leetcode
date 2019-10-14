package easy;

import java.util.Stack;

/**
 * 有效的括号
 */

public class IsValid {
    public boolean isValid(String s) {
        if (s.equals("")) return true;
        while (true){
            int lenTmp = s.length();
            s.replace("()","");
            s.replace("[]","");
            s.replace("{}","");
            if (s.length() == lenTmp) break;
        }
        return s.length()==0;
    }

    public static void main(String[] args){

        String s = "()[]";
        boolean out = new IsValid().isValid(s);

        System.out.println(out);



    }
}
