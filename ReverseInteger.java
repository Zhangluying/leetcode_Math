package Math;

public class ReverseInteger {
	public int reverse(int x) {
		int res=0;
		while(x!=0) {
			int tmp=x%10;
			int newResult = res*10+tmp;
			if((newResult-tmp)/10!=res) return 0;
			res=newResult;
			x=x/10;	
		}
		return res;  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
