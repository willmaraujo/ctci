package arraystrings;

import java.util.HashMap;

public class ArrayStrings {

	public static void main(String[] args) {
		// Boolean a = isUnique("abcdtfgnm");
		// Boolean a = checkPermutation("abcdwe", "dwceba");
		//Boolean a = palindromePermutation("tact coaffffg");
		//Boolean a = oneWay("pale", "ple");
		//System.out.println(a);
		
		int[][] matrix = {
				{2,1,3},
				{2,3,0},
				{1,1,4}
		};
		
		zeroMatrix(matrix);
		
		
	}

	private static Boolean isUnique(String s) {

		HashMap<String, Boolean> mHash = new HashMap<String, Boolean>();
		String[] mArray = s.split("");

		for (String mChar : mArray) {
			if (mHash.get(mChar) != null) {
				return false;
			}
			mHash.put(mChar, true);
		}

		return true;
	}

	private static Boolean checkPermutation(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		int[] mArray = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			char value = s1.charAt(i);
			mArray[value]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			char value = s2.charAt(i);
			if (mArray[value] == 0)
				return false;

			mArray[value]--;
		}

		return true;
	}

	private static Boolean palindromePermutation(String s) {

		HashMap<Character, Integer> mHashMap = new HashMap<Character, Integer>();
		Integer oddCount = 0;

		s = s.replace(" ", "");
		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			Character mCharacter = s.charAt(i);
			Integer currentValue = mHashMap.get(mCharacter) != null ? mHashMap.get(mCharacter) : 0;
			mHashMap.put(mCharacter, currentValue + 1);
			System.out.println(mHashMap);

		}

		for (int i = 0; i < s.length(); i++) {
			Integer value = mHashMap.get(s.charAt(i));
			if (value % 2 != 0) {
				oddCount++;
			}
			if (oddCount > 1)
				return false;
		}

		return true;
	}

	private static Boolean oneWay(String s1, String s2) {

		int diff = s1.length() - s2.length();

		if (!(-1 <= diff && diff <= 1))
			return false;

		if (diff == 0) {
			Integer differents = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s2.charAt(i) != s1.charAt(i)) {
					differents++;
				}
				if (differents > 1)
					return false;
			}

			return true;
		} else {

			String largestS = s1;
			String s = s2;

			if (diff < 1) {
				largestS = s2;
				s = s1;
			}

			Integer differents = 0;
			for (int i = 0; i < largestS.length(); i++) {
				int j = i;
				if (differents == 1)
					j = i - 1;
				
				
				if (i > s.length() && differents <=1 ) return true;
				
				if (largestS.charAt(i) != s.charAt(j)) {
					differents++;
				}

				if (differents > 1)
					return false;
			}
		}

		return true;
	}
	
	private static void zeroMatrix(int[][] matrix) {
		
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] == 1) {
					matrix[i][j] = 0;
				}
				
				if (col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}

}
