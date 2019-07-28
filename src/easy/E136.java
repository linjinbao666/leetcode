package easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 只出现一次的数字
 */
public class E136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                System.out.println(nums[i]);
                map.put(nums[i],2);
                continue;
            }
            map.put(nums[i],1);
        }
        for (Map.Entry entry:map.entrySet()){
            if (entry.getValue().equals(1)) return (int) entry.getKey();
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int out = new E136().singleNumber(nums);
        System.out.println(out);
    }
}
