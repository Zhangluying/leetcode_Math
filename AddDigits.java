package Math;

public class AddDigits {
	public int addDigits(int num) {
		if(num<10) return num;
		int res=0;
		while(num>0) {
			res+=num%10;
			num/=10;
		}
		return addDigits(res);
		
		
		
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
