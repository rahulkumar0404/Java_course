package sorting;

public class Insertion_sort {
	public static void print(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int []arr = {8,9,4,2,10,1,11};
		int n = arr.length;
		for(int i=1; i<n; i++) {
			int min_ele = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>min_ele) {
				arr[j+1] = arr[j];
				j--;
			}
			j++;
			arr[j] = min_ele;
		}
		print(arr);
	}
}
