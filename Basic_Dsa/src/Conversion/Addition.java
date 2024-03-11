package Conversion;

import java.util.*;
public class Addition {
	
	 int addition(int a, int b, int c) {
		int res = 0, carry = 0, p = 1;
		while(a>0 || b>0 || carry >0) {
			int d1 = a%10;
			int d2 = b%10;
			a/=10;
			b/=10;
			int sum = d1 + d2 + carry;
			carry = sum / c;
			sum  = sum % c;
			res += sum *p;
			p *= 10;
		}
		return res;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first value of addition: ");
		int a = sc.nextInt();
		System.out.println("Please Enter the second value of addition: ");
		int b = sc.nextInt();
		System.out.print("Please Enter the base value of addition");
		int c = sc.nextInt();
		Addition obj = new Addition();
		int resultValue = obj.addition(a, b, c);
		System.out.println(resultValue);
		sc.close();
	}
}
