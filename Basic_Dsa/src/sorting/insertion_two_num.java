package sorting;

import java.util.*;
public class insertion_two_num {

	public class Main {

		public static void print(int []arr, int n){
			System.out.print("[");
			for(int i=0; i<n; i++){
				System.out.print(arr[i] + ", ");
			}
			System.out.print("]");
		}
		public static void take_input(int []arr, int n){
			Scanner sc = new Scanner(System.in);
			for(int i=0; i<n; i++){
				int val = sc.nextInt();
				arr[i] = val;
			}
		}
	    public static void main(String args[]) {
	        // Your Code Here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int []arr = new int[n];
			int []arr2 = new int[n]; 
			take_input(arr, n);
			take_input(arr2,n);
			Arrays.sort(arr);
			Arrays.sort(arr2);
			int [] new_arr = new int[n];
			int k = 0;
			for(int i=0; i<n; i++){
				if(arr[i] == arr2[i]){
					new_arr[k] = arr[i];
					k++;
				}
			}
	    }
	}

}
