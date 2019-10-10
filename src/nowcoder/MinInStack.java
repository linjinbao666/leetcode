package nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinInStack {
    Stack<Integer> dataStack = new Stack();
    List<Integer> minList = new ArrayList<>();
    public void push(int node) {
        dataStack.push(node);
        if (minList.isEmpty() || node < min()) minList.add(node);
        else minList.add( min());
    }
    public void pop() {
        dataStack.pop();
        minList.remove(minList.get(minList.size()-1));
    }
    public int top() {
        return dataStack.peek();
    }
    public int min() {
        return minList.get(minList.size()-1);
    }
}
