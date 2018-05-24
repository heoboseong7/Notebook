import java.util.Scanner;

public class ExceptionExam1 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		System.out.print("Input dividend:");
		dividend = rd.nextInt();
		System.out.print("Input divisor:");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
		} catch (ArithmeticException e) {
			System.out.println("Exception 1");
		}
	}
}