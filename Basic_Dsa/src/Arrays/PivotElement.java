package Arrays;
public class PivotElement {
	
	static int pivotElement(int []arr, int n) {
		int startIndex = 0,endIndex = n-1;
		while(startIndex <endIndex) {
			int mid = (startIndex + endIndex)/2;
			
			if(arr[mid] >=arr[0]) {
				startIndex = mid + 1;
			}
			else {
				endIndex = mid;
			}
		}
		return startIndex;
	}
	
	public static void main (String [] args) {
		int [] arr = new int [] {2,3,5,7,9};
		
		int n = arr.length;
		int pivotElementIndex = pivotElement(arr, n);
		System.out.println(pivotElementIndex);
	}
}
                                                     