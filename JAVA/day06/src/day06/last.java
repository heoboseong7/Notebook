package day06;

import java.util.Scanner;

public class last {
	public static void main(String[] args)	{
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			if(unit[i] < money)
				System.out.printf("%dwon is %d\n", unit[i], money / unit[i]);
			money = money % unit[i];
		}
		in.close();
	}
}