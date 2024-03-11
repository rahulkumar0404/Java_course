package String;

public class StringCompression {
	
	public static void RemoveDuplicateCharacter(StringBuilder s1) {
		int i=0, j = 1; 
		for(; j<s1.length(); j++) {
			if(s1.charAt(i) != s1.charAt(j)) {
				s1.setCharAt(i+1, s1.charAt(j));
				i++;
			}
		}
		StringBuilder result = new StringBuilder("");
		for(int k=0; k<=i; k++) {
			result.append(s1.charAt(k));
		}
		System.out.println(result);
	}
	
	public static void compressedString(StringBuilder s1) {
		int cnt = 1; 
		String s = s1.substring(0, 1);
		for(int i=1; i<s1.length(); i++) {
			char curr = s1.charAt(i);
			char prev = s1.charAt(i-1);
			
			if(curr == prev) {
				cnt ++;
			}
			else {
				if(cnt >1) {
					s += cnt;
					cnt = 1;
				}
				s += curr;
			}
		}
		if(cnt > 1) {
			s += cnt;
			cnt = 1;
		}
		
		System.out.println("Resultant compressed String " + s);
	}

	public static void main(String []args) {
		StringBuilder s1 = new StringBuilder("aaabbbccccdddeefaba");
		compressedString(s1);
	}
}
