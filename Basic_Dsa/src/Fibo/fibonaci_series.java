package Fibo;
import java.util.Scanner;
public class fibonaci_series {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.print(a);
		System.out.print(b);
		for(int i=0; i<n; i++) {
			c = a+ b;
//			System.out.println(a + ' ' +  b + ' ' + c +  ' ');
			System.out.print(c);
			a = b;
			b = c;
		}
	}
}
