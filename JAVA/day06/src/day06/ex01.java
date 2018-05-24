package day06;

public class ex01 {
	public static void main(String[] args) {
		int[] n = new int[2];
		n[0] = 1;
		n[1] = 2;
		swap_val(n[0], n[1]);
		System.out.println("n[0] = "+ n[0] + " n[1] = "+n[1]);
		swap_arr(n);
		System.out.println("n[0] = "+ n[0] + " n[1] = "+n[1]);
	}
	
	public static void swap_val(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swap_arr(int[] a) {
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
}