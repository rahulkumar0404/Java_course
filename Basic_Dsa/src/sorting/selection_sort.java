package sorting;
import java.util.*;
public class selection_sort {
	public static void print(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String []args) {
		int []arr = {1,2,3,4,5};
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int min_val = i;
			for(int j=i+1; j<n; j++) {
				if(arr[min_val]>arr[j]) {
					min_val = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_val];
			arr[min_val] = temp;
		}
		print(arr);
	}
}
