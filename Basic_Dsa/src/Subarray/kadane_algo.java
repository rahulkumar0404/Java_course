package Subarray;
import java.util.*;
public class kadane_algo {
	public static void main(String []args) {
		int []arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int ans = Integer.MIN_VALUE, prev = 0;
		int n = arr.length;
		for(int i=0; i<n; i++) {
			prev += arr[i];
			ans = Math.max(ans, prev);
			if(prev<0) prev = 0;
		}
		System.out.print(ans);
	}
}
