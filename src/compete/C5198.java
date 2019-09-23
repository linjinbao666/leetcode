package compete;

import annotation.OverHideMethods;

/**
 * 丑数III
 */
public class C5198 {

    @OverHideMethods("超时")
    public static int nthUglyNumber1(int n, int a, int b, int c) {
        int i = 1;
        while (n>0){
            if (i%a==0 || i%b==0 || i%c==0) n--;
            i++;
        }
        return i-1;
    }

    public static int nthUglyNumber(int n, int a, int b, int c){
        int i=1, j=1, k=1;
        int tmpA=0,tmpB=0,tmpC=0;
        while (n>0){
            tmpA = a*i;
            tmpB = b*j;
            tmpC = c*k;
            if (tmpA <= Math.min(tmpB,tmpC)) i++;
            if (tmpB <= Math.min(tmpA,tmpC)) j++;
            if (tmpC <= Math.min(tmpA,tmpB)) k++;
            n--;
            System.out.print("tmpA = "+tmpA +" i = "+i + "\t"+"\t"
                    + " tmpB = "+tmpB +" j = "+ j +"\t"+"\t"
                    + " tmpC = "+tmpC +" k = "+k + "\t");
            System.out.println();
        }
        return Math.min(tmpA,Math.min(tmpB, tmpC));
    }


    public static void main(String[] args) {
        int n = 1000000000, a = 2, b = 217983653, c = 336916467;
//        int n = 5, a = 2, b = 11, c = 13;
//        int n = 9, a = 2, b = 3, c = 4;
        int out = nthUglyNumber(n,a,b,c);




        System.out.println(out);
    }
}
