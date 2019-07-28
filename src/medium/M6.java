package medium;

/**
 * Z字形变换
 * 
 * @author linjinbao
 *
 */
public class M6 {
	public String convert(String s, int numRows) {
		if(null==s || ""==s) return "";
		int len=s.length();
		if(1==len) return s;
		int numCols = 0;
		StringBuffer sb = new StringBuffer();
		if((len+numRows-2)%(2*numRows-2)==0) {
			numCols = (len+numRows-2)/(2*numRows-2);
		}else {
			numCols = len/(2*numRows-2);
		}
		int size = 2*numRows-2;			//间隔
		System.out.println(numCols);
		for(int i=0; i<numRows; i++) {	//控制行
			int tmp1 = s.charAt(i);
			for(int j=0; i<numCols; j++) {	//控制列
				int tmp2 = s.charAt(j);
				if(j-i==1) {
					sb.append(tmp2);
				}else {
					sb.append(s.charAt(j-1)+size);
				}
			}
			
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {
		String s = "LEETCODEISHIRING";
	}
}
