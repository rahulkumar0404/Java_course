package Fibo;
import java.util.Scanner;
public class GCD {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int divid = sc.nextInt(), divisor = sc.nextInt();
		if(divid<divisor) {
			divid = divid + divisor;
			divisor = divid - divisor;
			divid = divid-divisor;
		}
		while(divid%divisor != 0) {
			int rem = divid % divisor;
			divid = divisor;
			divisor = rem;
		}
		System.out.println("GCD OF TWO NUMBER IS " + divisor);
	}
}
