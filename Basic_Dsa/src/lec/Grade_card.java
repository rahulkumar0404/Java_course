package lec;
import java.util.*;
public class Grade_card {
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i =0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j<n-i-1) {
					System.out.print(" ");
				}
				else System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n+i; j++) {
				if(j<2*i) {
					System.out.print(" ");
				}
				else System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			if(i == 0 || i == n-1) {
				for(int j=0; j<n; j++) {
					System.out.print("*" + " ");
				}
				
			}
			else {
				for(int j=0; j<n; j++) {
					if(j==0 || j==n-1) {
						System.out.print("*"+ " ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==i || j == n-i-1) {
					System.out.print("*" + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		int row = 1, space = n-1;
		while(row<=n) {
			int col = 1;
			while(col<=space) {
				System.out.print("  ");
				col++;
			}
			
			col = 1;
			int col2 = 1;
			while(col <= n-space) {
				System.out.print("*" + " ");
				col++;
			}
			while(col2<row) {
				System.out.print("*"+ " ");
				col2++;
			}
			space--;
			row++;			
			System.out.println();
		}
		
		System.out.println();
		row = 1;
		while(row<=n) {
			int col = 1,space1 = 1;
			while(space1<row) {
				System.out.print("  ");
				space1++;
			}
			while(col<=n-row) {
				System.out.print("*" + " ");
				col++;
			}
			col = 1;
			while(col<=n-row) {
				System.out.print("*"+ " ");
				col++;
			}
			row++;
			System.out.println();
		}
		System.out.println();
		int row1 = 1, space1 = n-row1;
		while(row1<=n) {
			int col = 1;
			while(col<=space1) {
				System.out.print("  ");
				col++;
			}
			
			col = 1;
			int col2 = 1;
			boolean spacePresent = false;
			while(col <= row1) {
				if(spacePresent) {
					System.out.print("!"+" ");
					spacePresent = false;
				}
				else {
					System.out.print("*"+ " ");
					spacePresent = true;
				}
				col++;
			}
			while(col2<row1) {
				if(spacePresent) {
					System.out.print("!"+" ");
					spacePresent = false;
				}
				else {
					System.out.print("*"+ " ");
					spacePresent = true;
				}
				col2++;
			}
			space1--;
			row1++;
			spacePresent = false;
			System.out.println();
		}
	}
}
