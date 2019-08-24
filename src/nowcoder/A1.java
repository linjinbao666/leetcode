package nowcoder;

/**
 * 二维数组中的查找
 */
public class A1 {
    public static boolean Find(int target, int [][] array) {
        int len1 = array.length;
        if (len1==0) return false;
        int len2 = array[0].length;
        if (len2==0) return false;
        for (int i=0; i<len1; i++){
            int begin = 0;
            int end = len2;
            int count = 0;
            while (count<len2/2+1){
                int index = (begin+end)/2;
                if (target==array[i][index]) return true;
                if (target<array[i][index])end = index;
                if (target>array[i][index])begin = index;
                count++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{}};
        int taget = 16;
        boolean out = Find(taget,array);
        System.out.println(out);
    }


}
