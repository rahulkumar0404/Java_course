package Lec5;
import java.util.*;
public class Pascal_triangle {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0, str= 1;
		while(row<n) {
			int i = 0,  ncr  = 1;
			while(i<str) {
				System.out.print(ncr+ " ");
				ncr = (ncr*(row-i))/(i+1);
				i++;
			}
			row++;
			str++;
			System.out.println();
		}
	}
}
