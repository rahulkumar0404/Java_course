package String;

public class PalindroneStrings {
	
	public static boolean isPalindrone(String s1) {
		int i =0, j = s1.length()-1;
		
		while(i<j) {
			if(s1.charAt(i)!= s1.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static void main(String []args) {
		StringBuilder s1 = new StringBuilder("hello");
//		s1.setCharAt(0, 'd');
//		System.out.println(s1);
		int n = s1.length();
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<=n; j++) {
				String subString = s1.substring(i, j);
				if(isPalindrone(subString)) {
					System.out.print(subString + " ");
				}
			}
			System.out.println();
		}
	}
}
