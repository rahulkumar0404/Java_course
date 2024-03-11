package Arrays;

public class BarChart {
	public void printArray(int []arr) {
		int maxi = -1;
		for(int num: arr) {
			maxi = Math.max(maxi, num);
		}
		for(int floor = maxi; floor >= 1; floor--) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>= floor) {
					System.out.print("x\t");
				}
				else {
					System.out.print('\t');
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		int [] arr = {2,5,4,1,3};
		BarChart obj = new BarChart();
		obj.printArray(arr);
	}
}
