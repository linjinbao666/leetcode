package compete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 最小绝对差
 */
public class C5197 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        if (arr.length<2) return null;
        Arrays.sort(arr);
        for (int i : arr){
            System.out.print(i);
        }
        List<List<Integer>> outList = new ArrayList<>();
        int min = arr[1]-arr[0];
        for (int i=0; i<arr.length-1; i++){
            System.out.println(min);
            if (arr[i+1]-arr[i]<min){
                min = arr[i+1]-arr[i];
                outList.clear();
            }
            if(arr[i+1]-arr[i]==min){
                List<Integer> tmpList = new ArrayList();
                tmpList.add(arr[i]);
                tmpList.add(arr[i+1]);
                outList.add(tmpList);
            }
        }
        return outList;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};

        List out = minimumAbsDifference(arr);
        System.out.println(out);


    }
}
