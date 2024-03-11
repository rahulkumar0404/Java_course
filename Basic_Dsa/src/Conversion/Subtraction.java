package Conversion;

import java.util.Scanner;

public class Subtraction {
	
	public int subtraction (int a, int b, int c) {
		int res = 0, carry = 0, p = 1;
		
		while(b>0) {
			int d = 0;
			int d1 = a%10;
			a /=10;
			int d2 = b%10;
			b /=10;
			d2 = d2 + carry;
			if(d2>=d1) {
				carry = 0;
				d = d2 -d1;
			}
			else {
				carry = -1;
				d = d2 + c - d1;
			}
			res += d * p;
			p *= 10;
		}
		return res;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first value of subtraction: ");
		int a = sc.nextInt();
		System.out.println("Please Enter the second value of subtraction: ");
		int b = sc.nextInt();
		System.out.print("Please Enter the base value of subtraction: ");
		int c = sc.nextInt();
		Subtraction obj = new Subtraction();
		int subtractedResult = obj.subtraction(a, b, c);
		System.out.println(subtractedResult);
	}
}
