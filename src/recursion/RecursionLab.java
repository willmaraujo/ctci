package recursion;

public class RecursionLab {
	
	public static void main(String [] args) {
		
		System.out.println(factorial(5));
		
	}
	
	public static Integer factorial(Integer n) {
//		if (n > 1) {
//			return n * factorial(n-1);
//		} else
//			return 1;
		
		int mResult = 1;
		
		for (int i = 1; i <= n; i++) {
			mResult *= i;
		}
		
		return mResult;
	}

}
