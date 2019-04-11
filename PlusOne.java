package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
	public int[] plusOne(int[] digits) {

		for(int i=digits.length-1;i>=0;i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		int[] newNumber = new int[digits.length+1];
		newNumber[0]=1;
		return newNumber;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
