package easy;

import java.util.Stack;

/**
 * 二进制求和
 * a = "1010", b = "1011"
 */
public class E67 {

    public static String addBinary(String a, String b) {
        if (a==null&&b==null) return "";
        int len1 = a.length();
        int len2 = b.length();
        Stack<Character> stack1 = new Stack();
        Stack<Character> stack2 = new Stack();
        int i = 0;
        int j = 0;
        while (i<len1){
            stack1.push(a.charAt(i));
        }
        while (j<len2){
            stack2.push(a.charAt(j));
        }
        char carry = '0';
        Stack<Character> stack3 = new Stack<>();
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            char c1 = '0';
            if (!stack1.isEmpty()) c1 = stack1.pop();
            char c2 = '0';
            if (!stack2.isEmpty()) c2 = stack2.pop();
            int tmp = c1+c2+carry;
            switch (tmp){
                case 96:
                    stack3.add('0');
                    carry = '0';
                    break;
                case 97:
                    stack3.add('1');
                    carry = '0';
                    break;
                case 98:
                    stack3.add('0');
                    carry = '1';
                    break;
                default:break;
            }
        }
        if (carry=='1')stack3.add('1');

        return stack3.toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String out = addBinary(a,b);
        System.out.println(out);
    }
}
