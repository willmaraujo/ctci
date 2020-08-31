package misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraysLab {

	public static void main(String[] args) {
		
//		int[] mArray = { 10, -15, 3, 7, 0 };
//		int k = 17;
//
//		System.out.println(myFunction(mArray, k));
		
		int[] mArray = {5, 9, 9, 7 };
		int[] resultArray = myFunction2(mArray);
		
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}

	}
	
	public static Boolean myFunction(int[] mArray, int k) {
		Set<Integer> mSet = new HashSet<Integer>();
		
		for (int i = 0; i < mArray.length; i++) {
			mSet.add(k - mArray[i]);
			
			if (mSet.contains(mArray[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public static int[] myFunction2(int[] mArray) {
		for (int i = mArray.length -1 ; i >= 0; i--) {
			if(mArray[i] == 9 && i == 0) {
				int[] newArray = new int[mArray.length+1];
				newArray[0] = 1;
				return newArray;
			}
			if (mArray[i] == 9) {
				mArray[i] = 0;
			} else
			if (mArray[i] >= 0 && mArray[i] < 9) {
				mArray[i]++;
				return mArray;
			}
		}
		
		return mArray;
	}
	
	

}
