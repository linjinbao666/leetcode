package medium;

import java.util.Arrays;

/**
 * 合并区间
 */
public class M56 {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length==0) return new int[][]{};
        if (intervals.length ==1) return intervals;
        //处理输入，使得每一个里面的第一个元素递增
        for (int i=0; i<intervals.length-1; i++){
            for (int j=0; j<intervals.length-1-i; j++){
                if (intervals[j][0] > intervals[j+1][0]){
                    int[] tmp = intervals[j];
                    intervals[j] = intervals[j+1];
                    intervals[j+1] = tmp;
                }
            }
        }
        int[][] out = new int[intervals.length][2];
        out[0] = intervals[0];
        int count1 = 0;
        for (int i=1; i<intervals.length; i++){
            if (out[count1][1] < intervals[i][0]) out[++count1]=intervals[i];
            else out[count1] = new int[]{out[count1][0], Math.max(intervals[i][1],out[count1][1])};
        }
        return Arrays.copyOfRange(out,0,count1+1);

    }



}
