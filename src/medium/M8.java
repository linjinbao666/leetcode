package medium;

/**
 * ×Ö·û´®×ªÕûÊý
 * 
 * @author linjinbao
 *
 */
public class M8 {
	public static int myAtoi(String str) {
		int len = str.length();
		if(len==0) return 0;
		int begin = 0;
		if(len==1 && str.charAt(0)=='+') return 0;
		if(len==1 && str.charAt(0)=='-') return 0;
		for(int i=0; i<len; i++) {
			int tmp = str.charAt(i);
			if(tmp==' ') continue;
			begin = i;
			break;
		}
		char beginChar = str.charAt(begin);
		if(beginChar=='+' || beginChar=='-') {
			long sum = 0;
			for(int j=begin+1; j<len; j++) {
				if(str.charAt(j)<48 || str.charAt(j)>57) break;
				sum=sum*10+str.charAt(j)-48;
				if(sum>Integer.MAX_VALUE) return beginChar=='+' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			if(sum>Integer.MAX_VALUE) return beginChar=='+' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			return (int) (beginChar=='+' ?sum:(-sum));
		}else if(beginChar>47 && beginChar<58){
			long sum=0;
			for(int j=begin; j<len; j++) {
				if(str.charAt(j)<48 || str.charAt(j)>57) break;
				sum=sum*10+str.charAt(j)-48;
				if(sum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
			}
			if(sum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
			return (int)sum;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		String str = "9223372036854775808";
		int out = myAtoi(str);
		System.out.println(out);
	}
}
