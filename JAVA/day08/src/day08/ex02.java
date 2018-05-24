package day08;

public class ex02 {
	public static void main(String[] args) {
		String[] tokens = "Java#HTML#Perl".split("#");
		for (int i = 0; i < tokens.length; i++) 
		  System.out.println(tokens[i]);
	}
}