package day05;

import java.util.Scanner;
public class ex01 {
	public static int sum(int num) {
		if(num == 0)
			return 0;
		else
			return num + sum(num - 1);
	}
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Total is "+ sum(n));
		input.close();
	}
}