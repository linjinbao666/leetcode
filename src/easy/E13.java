package easy;

import org.junit.Test;

import java.util.*;

/**
 * 罗马数字转整数
 */
public class E13 {
    public static int romanToInt(String s) {
        int sum =0;
        while (s.length()>0){
            if (s.contains("IV")){
                sum+=4;
                s = s.replace("IV","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("IX")){
                sum+=9;
                s = s.replace("IX","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("III")) {
                sum+=3;
                s = s.replace("III","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("II")){
                sum+=2;
                s = s.replace("II","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("I")){
                sum+=1;
                s = s.replace("I","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("V")){
                sum+=5;
                s = s.replace("V","");
                if (s.length()==0) return sum;
            }
            if (s.contains("XL")){
                sum+=40;
                s = s.replace("XL","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("XC")){
                sum+=90;
                s = s.replace("XC","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("XXX")){
                sum+=30;
                s = s.replace("XXX","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("XX")){
                sum+=20;
                s = s.replace("XX","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("X")){
                sum+=10;
                s = s.replace("X","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("L")){
                sum+=50;
                s = s.replace("L","");
                if (s.length()==0) return sum;
            }
            //100- 900
            if (s.contains("CD")){
                sum+=400;
                s = s.replace("CD","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("CM")){
                sum+=900;
                s = s.replace("CM","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("CCC")){
                sum+=300;
                s = s.replace("CCC","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("CC")){
                sum+=200;
                s = s.replace("CC","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("C")){
                sum+=100;
                s = s.replace("C","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("D")){
                sum+=500;
                s = s.replace("D","");
                if (s.length()==0) return sum;
            }
            if (s.contains("MMM")){
                sum+=3000;
                s = s.replace("MMM","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("MM")){
                sum+=2000;
                s = s.replace("MM","");
                if (s.length()==0) return sum;
            }else
            if (s.contains("M")){
                sum+=1000;
                s = s.replace("M","");
                if (s.length()==0) return sum;
            }
        }
        return sum;

    }

    public static void main(String[] agrs){
        String s = "MDCXCV";
        int out = romanToInt(s);
        System.out.println(out);

    }
}
