package medium;

/**
 * 整数传罗马数字
 */
public class M12 {

    public String intToRoman(int num) {
        StringBuffer stringBuffer = new StringBuffer();
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        while (index < romans.length){

            while (num >= nums[index]){
                stringBuffer.append(romans[index]);
                num = num - nums[index];
            }
            index++;
        }

        return stringBuffer.toString();
    }
}
