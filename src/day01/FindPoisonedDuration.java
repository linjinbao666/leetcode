package day01;

import java.util.Collections;

/**
 * 495. 提莫攻击
 */
public class FindPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries==null || timeSeries.length<1) return 0;
        int sum = 0;
        for (int i =0; i< timeSeries.length-1; i++){
            if (timeSeries[i+1]-timeSeries[i] >= duration){
                sum+=duration;
            }else {
                sum+= timeSeries[i+1]-timeSeries[i];
            }
        }
        return sum ;
    }
}
