package function;
import java.util.*;
import java.lang.Math;
public class armstrong_num {
	public static int calculateLength(int n) {
		int number_len = 0;
		while(n>0) {
			number_len++;
			n/=10;
		}
		return number_len;
	}
	public static int armstrong_num(int num, int len_num) {
		int number = 0;
		while(num>0) {
			number+=(Math.pow((num%10),len_num));
			num/=10;
		}
		return number;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = calculateLength(n);
		int number = armstrong_num(n,len);
		int armstrong_num_len = calculateLength(number);
		if(armstrong_num_len == len) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
