package Math;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		int n=num1.length();
		int m=num2.length();
		int[] pos = new int[m+n];
		for(int i=n-1;i>=0;i--) {
			for(int j=m-1;j>=0;j--) {
				int sum = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int p1=i+j;
				int p2=i+j+1;
				sum+=pos[i+j+1];
				pos[p1]+=sum/10;
				pos[p2]+=sum%10;	
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int p:pos) if(!(sb.length()==0&&p==0)) sb.append(p);
		return sb.length()==0?"0":sb.toString();
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
