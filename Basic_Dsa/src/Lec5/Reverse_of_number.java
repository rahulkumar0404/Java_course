package Lec5;
import java.util.*;
public class Reverse_of_number {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev_no = 0;
		while(n>0) {
			int rem = n%10;
			rev_no = rev_no*10+rem;
			n/=10;
		}
		System.out.println(rev_no);
	}
}
