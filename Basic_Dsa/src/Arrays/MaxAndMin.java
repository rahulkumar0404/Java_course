package Arrays;

import java.util.Scanner;
public class MaxAndMin {
	
	static Scanner sc = new Scanner(System.in);
	public int MaxAndMinDiff(int []arr) {
		int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
		for(int x : arr) {
			maxi = Math.max(maxi, x);
			mini = Math.min(x, mini);
		}
		return maxi-mini;
	}
	public int [] InputArray(int n){
		int [] arr = new int [n];
		for(int i=0; i< n; i++) {
			int val =  sc.nextInt();
			arr[i] = val;
		}
		return arr;
	}
	public static void main(String []args) {
		int n = sc.nextInt();
		MaxAndMin obj = new MaxAndMin();
		int []arr = obj.InputArray(n);
		int resValue = obj.MaxAndMinDiff(arr);
		System.out.println(resValue);
		sc.close();
	}
}
