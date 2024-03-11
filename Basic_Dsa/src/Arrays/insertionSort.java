package Arrays;

public class insertionSort {
	
	void sort(int []arr) {
		int n = arr.length;	
		for(int i=1; i<n; i++) {
			int picked = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>picked) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = picked;
		}
	}
	
	public void printArray(int []arr) {
		for(int num:arr) {
			System.out.print(num + " ");
		}	
	}
	public static void main(String []args) {
		int [] arr = {2,5,4,1,3};
		insertionSort obj = new insertionSort();
		obj.sort(arr);
		obj.printArray(arr);
		
	}
}
