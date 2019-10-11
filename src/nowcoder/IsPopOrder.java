package nowcoder;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 */
public class IsPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
        if (pushA.length==0 || popA.length==0) return false;
        Stack<Integer> stack = new Stack();
        int popIndex = 0;
        for (int i=0; i< pushA.length; i++){
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }

        }
        return stack.isEmpty();
    }
}
