package Mathematics;

import java.util.*;
public class GCD {
	
	public int gcdOfTwoNumber(int a, int b) {
		int minNum = Math.min(a, b);
		while(minNum > 0) {
			if(a%minNum == 0 && b%minNum == 0){
				return minNum;
			}
			minNum --;
		}
		return 0;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		GCD obj = new GCD();
		System.out.println(obj.gcdOfTwoNumber(a, b));
		sc.close();
	}
}
