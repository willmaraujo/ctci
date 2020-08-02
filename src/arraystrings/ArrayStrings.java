package arraystrings;

import java.util.HashMap;

public class ArrayStrings {
	
	public static void main(String[] args) {
		Boolean a = uniqueChars("abcdtfgnm");
		System.out.println(a);
	}
	
	private static Boolean uniqueChars(String s) {
		
		HashMap<String, Boolean> mHash = new HashMap<String, Boolean>();
		String[] mArray = s.split("");
		
		for (String mChar : mArray) {
			if(mHash.get(mChar) != null) {
				return false;
			}
			mHash.put(mChar, true);
		}
		
		
		return true;
	}

}