package lec ;
//public class Odd_or_Even{
//	public static void main (String [] args) {
//		int n = 89;
//		if(n%2 == 0) {
//			System.out.println("Number is Even");
//		}
//		else {
//			System.out.println("Number is ODD");
//		}
//	}
//}
public class Odd_or_Even{
	public static void main (String [] args) {
		check_maximum();
	}
	public static void check_maximum() {
		int a = 5, b = 12, c = 56;
		if(a>b && a>c) {
			System.out.println("a is a maximum number");
		}
		else if (b>a && b>c) {
			System.out.println("b is a maximum number");
		}
		else {
			System.out.println("c is a maximum number");
		}
	}
}
