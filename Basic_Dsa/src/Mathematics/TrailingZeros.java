package Mathematics;

public class TrailingZeros {
	
	static int trailingZeros(int n) {
		int fact = 1;
		for(int i=2; i<n; i++) {
			fact = fact + fact*i;
		}
		int noOfZeros = 0;
		int lastDigit = fact % 10;
		while(lastDigit == 0) {
			noOfZeros++;
			fact = fact / 10;
			lastDigit = fact % 10; 
		}
		return noOfZeros;
	}
	
	
	static int trailingZerosEfficientWay(int n) {
		
		int powCnt = 1, result = 0;
		
		while(true) {
			int value = n / (int)Math.pow(5,powCnt);
			if(value > 0) {
				result += value;
				powCnt ++;
			}
			else break;
		}
		return result;
	}
	public static void main(String []args) {
		int n = 251;
		System.out.println(trailingZerosEfficientWay(n));
	}
}
