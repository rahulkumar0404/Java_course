package sorting;
import java.util.*;

public class bubble_sort {
	public static void swap(int a, int b) {
		int temp = b;
		b = a;
		a = temp;
	}
	public static void print(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String []args) {
		int []arr= {1,2,3,4,5};
		int arlen = arr.length;
		for(int i=arlen-1; i>=1; i--) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j]>arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]= temp;
				}
			}
		}
		print(arr);
	}
}
