package Arrays;

public class BubbleSort {
	public static void swapNumber(int []arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void bubbleSort(int []arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) swapNumber(arr, i, j);
			}
		}
	}
	
	public static void printArray(int []arr) {
		for(int x: arr) System.out.print(x + " ");
	}
	public static void main(String []args) {
//		int [] arr = {38,24,15,8};
//		bubbleSort(arr);
//		printArray(arr);
		
		int result = 1 +2;
		System.out.println("result is "  + result);
		
		int original_result = result;
		
		result = result -1;
		System.out.println("original result is" + original_result);
		System.out.println("result is"+ result);
	}
}
