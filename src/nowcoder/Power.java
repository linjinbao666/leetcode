package nowcoder;

/**
 * 数值的整数次方
 */
public class Power {
    public double power(double base, int exponent){
        double sum = 1.0;
        if (exponent>0){
            while (exponent>0){
                sum = sum * base;
                exponent--;
            }
        }else {
            while (exponent<0){
                sum = sum *base;
                exponent++;
            }
            sum = 1.0/sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Power p = new Power();
        double out = p.power(2,-3);
        System.out.println(out);
    }
}
