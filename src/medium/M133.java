package medium;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 克隆图
 */
public class M133 {

    public Node cloneGraph(Node node){
        if (node==null) return node;
        Queue<Node> queue = new LinkedList<>();
        Map<Integer, Node> map = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(node);
        visited.add(node.val);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            Node n = new Node();
            n.val = cur.val;
            n.neighbors = new ArrayList<Node>();
            map.put(n.val, n);
            for (Node temp : cur.neighbors){
                if (visited.contains(temp.val))continue;
                queue.offer(temp);
                visited.add(temp.val);
            }
        }

        queue = new LinkedList<>();
        queue.offer(node);
        visited = new HashSet<>();
        visited.add(node.val);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            for (Node temp : cur.neighbors){
                map.get(cur.val).neighbors.add(map.get(temp.val));
            }
            for (Node temp : cur.neighbors){
                if (visited.contains(temp.val))continue;
                queue.offer(temp);
                visited.add(temp.val);
            }
        }
        return map.get(node.val);
    }


}


/**
 * 图的定义
 */
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
