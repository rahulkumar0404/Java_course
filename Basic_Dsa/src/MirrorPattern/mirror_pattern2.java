package MirrorPattern;

import java.util.Scanner;

public class mirror_pattern2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, space = n-row;
		while(row<=n) {
			int col = 1;
			while(col<=space) {
				System.out.print("  ");
				col++;
			}
			col = 1;
			while(col<=row) {
				System.out.print("*"+" ");
				col++;
			}
			space--;
			row++;
			System.out.println();
		}
		space = 1; 
		row = 1;
		while(row<n) {
			int col = 1;
			while(col<=space) {
				System.out.print("  ");
				col++;
			}
			col = 1;
			while(col<=n-row) {
				System.out.print("*"+ " ");
				col++;
			}
			row++;
			space++;
			System.out.println();
		}
		System.out.println();
	}
}
