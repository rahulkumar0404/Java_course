package MirrorPattern;
import java.util.*;
public class Mirror_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row<=n) {
			int col = 1;
			while(col<=row) {
				System.out.print("*"+ " ");
				col++;
			}
			row++;
			System.out.println();
		}
		row=1;
		while(row<n) {
			int col = 1;
			while(col<=n-row) {
				System.out.print("*"+" ");
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
