package String;

public class PrintAllSubstring {
	
	public static void main(String []args) {
		String s1 = "hello";
		int n = s1.length();
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<=n; j++) {
				System.out.print(s1.substring(i, j) + " ");
			}
			System.out.println();
		}
	}
}
