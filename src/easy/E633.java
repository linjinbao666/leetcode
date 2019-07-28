package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import annotation.OverHideMethods;

/**
 * 平方数之和
 * @author linjinbao
 *
 */
public class E633 {
	public static boolean judgeSquareSum(int c) {
		int i = 0;
		Set<Integer> set = new HashSet<>();
		while(i<=Math.sqrt(c)) {
			if(i*i >= Integer.MAX_VALUE) return false;
			if(set.contains(c-i*i)) return true;
			if(c == i*i*2) return true;
			set.add(i*i);
			i++;
		}
		return false;
	}

	@OverHideMethods("通过")
	private static boolean judgeSquareSum2(int c) {
		int i =0; 
		while(i <= Math.sqrt(c)) {
			if(Math.sqrt(c-i*i) == (int)(Math.sqrt(c-i*i))) return true;
			i++;
		}
		return false;
	}
	
	@OverHideMethods("超时")
	private static boolean judgeSquareSum1(int c) {
		int i =0;
		Map<Integer, Integer> map = new HashMap<>();
		while(i*i<=c) {
			map.put(i, i*i);
			if(map.containsValue(c-map.get(i))) return true;
			i++;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		int c = 2;
		long begin = System.currentTimeMillis();
		boolean out = judgeSquareSum(c);
		long end = System.currentTimeMillis();
		System.out.println(out);
		System.out.println(end -begin);
	}
}
