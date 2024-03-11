package Fibo;
import java.util.*;
public class digit_sum {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, rem;
		while(n>0) {
			rem = n%10;
			sum += rem;
			n/=10;
		}
		System.out.println(sum);
	}
}
