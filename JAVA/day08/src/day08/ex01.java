package day08;

public class ex01 {
	public static void main(String[] args) {
		Double doubleObject = Double.valueOf("12.4");
		Integer integerObject = Integer.valueOf("12");
		
		System.out.println(doubleObject);
		System.out.println(integerObject);
		System.out.println(Integer.valueOf("12"));
		System.out.println(Integer.parseInt("10"));
		System.out.println(Integer.parseInt("10", 2)); // 2진수로 읽으라는 의미
		System.out.println(Integer.parseInt("10", 8));
		System.out.println(Integer.parseInt("10", 16));

	}
}
