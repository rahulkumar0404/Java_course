package Arrays;

import java.util.Scanner;

public class SumTwoArray {
	static Scanner sc = new Scanner(System.in);
	public void printArray(int []arr) {
		for(int num:arr) {
			System.out.print(num + " ");
		}	
	}
	public int [] InputArray(int n){
		int [] arr = new int [n];
		for(int i=0; i< n; i++) {
			int val =  sc.nextInt();
			arr[i] = val;
		}
		return arr;
	}
	
	public static int [] resizeArray (int []arr, int carry, int size) {
		int []resizedArray;
		if(carry>0) {
			resizedArray = new int [size+1];
			resizedArray[0] = carry;
			for(int i=0; i<arr.length; i++) {
				resizedArray[i+1] = arr[i];
			}
			return resizedArray;
		}
		
		return arr;
	}
	
	public int [] sumArrays(int []firstArr, int []secondArr) {
		int n1 = firstArr.length;
		int n2 = secondArr.length;
		int size = Math.max(n1, n2);
		int []result = new int[size];
		
		int carry = 0, k = size-1, i = n1-1,j = n2-1;
		
		while(k>=0) {
			int value = carry;
			if(i>=0) {
				value += firstArr[i];
			}
			if(j>=0) {
				value += secondArr[j];
			}
			carry = value / 10;
			result[k] = value % 10;
			i--;
			j--;
			k--;
		}
		
		int []resultArray = resizeArray(result, carry, size);
		return resultArray;
	}
	public static void main(String []args) {
		int n1 = sc.nextInt();
		SumTwoArray obj = new SumTwoArray();
		int []arr = obj.InputArray(n1);
		int n2 = sc.nextInt();
		int []arr2 = obj.InputArray(n2);
		int []result = obj.sumArrays(arr, arr2);
		obj.printArray(result);
	}
}
