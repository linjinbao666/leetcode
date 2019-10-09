package compete;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 独一无二的出现次数
 * arr = [1,2,2,1,1,3]
 */
public class C5205 {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                int value = map.get(arr[i]).intValue();
                value+=1;
                map.put(arr[i], value);
            }else {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if (set.contains(value)) return false;
            else set.add(value);
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean out = uniqueOccurrences(arr);
        System.out.println(out);


    }
}
