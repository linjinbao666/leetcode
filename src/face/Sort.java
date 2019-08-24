package face;

public class Sort {

    /**
     * 冒泡排序
     * @param nums
     */
    public static void bubbleSort(int[] nums){
        if (nums==null || nums.length==1) return;
        for (int i=0; i<nums.length; i++){        //第i次循环找出第i小的元素0<=i<=length-1
            boolean flag = false;
            for (int j=0; j<nums.length-1-i; j++){
                if (nums[j+1]<nums[j]){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    flag = true;
                }
                for (int num : nums) System.out.print(num+"\t");
                System.out.println();
            }
            if (!flag) break;
        }
    }

    /**
     * 选择排序
     * @param nums
     */
    public static void selectSort(int[] nums){
        int len = nums.length;
        if (len==0 || len==1) return;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                if (nums[j] < nums[i]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    /**
     * 插入排序
     * @param nums
     */
    public static int[] insertSort(int[] nums, int index){
        if (index == nums.length) return nums;
        for (int i=0; i<index; i++){
            if (nums[index]<nums[i]){
                int tmp = nums[index];
                nums[index] = nums[i];
                nums[i] = tmp;
            }
        }
        return insertSort(nums, index+1);
    }


    /**
     * 堆排序
     * @param nums
     */
    public static void heapSort(int[] nums){
        initHeap(nums);
        int count = nums.length;
        while (count>1){
            int tmp = nums[count-1];
            nums[count-1] = nums[0];
            nums[0] = tmp;
            count--;
            adjustHeap(nums,count,0);
        }
    }
    public static void initHeap(int[] nums){
        for (int root=nums.length/2-1; root>=0; root--){
            adjustHeap(nums,nums.length, root);
        }
    }
    public static void adjustHeap(int[] nums, int count, int root){
        int maxChildIndex;
        while (root<=count/2-1){
            if (root==count/2-1 && count%2==0){
                maxChildIndex = 2*root+1;
            }else {
                int leftChildIndex = 2 * root + 1;
                int rightChildIndex = 2 * root + 2;
                maxChildIndex = nums[leftChildIndex] > nums[rightChildIndex]?leftChildIndex:rightChildIndex;
            }
            if (nums[root] < nums[maxChildIndex]){
                int tmp = nums[root];
                nums[root] = nums[maxChildIndex];
                nums[maxChildIndex] = tmp;
                root = maxChildIndex;
            }else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,3,1,2,5};
        heapSort(nums);

        for (int num : nums){
            System.out.println(num);
        }

    }




}
