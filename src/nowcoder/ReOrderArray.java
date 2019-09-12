package nowcoder;

/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class ReOrderArray {
    public static void reOrderArray(int[] array){
        int[] copyArray = new int [array.length];
        int cur = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2!=0) copyArray[cur++] = array[i];

        }
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0) copyArray[cur++] = array[i];
        }
        for (int i=0; i< array.length; i++){
            array[i] = copyArray[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reOrderArray(array);
        for (int i: array){
            System.out.println(i+"\t");

        }

    }
}
