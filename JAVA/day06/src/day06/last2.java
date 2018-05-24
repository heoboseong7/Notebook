package day06;

import java.util.Scanner;
public class last2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i = 0; i < unit.length; i++) {
			if((money - money % unit[i]) / unit[i] > 0) {
				System.out.println(unit[i]+"won is "+(money - money % unit[i]) / unit[i]);
				money = money % unit [i];
			}
		}
		in.close();
	}
}