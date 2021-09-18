package AddNumbers;
import java.util.Scanner;

public class TypecastUserGivenNumber {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give a number");
		int num1 = sc.nextInt();
		System.out.println("The number is "+ num1);
		
		double dou = num1;
		
		System.out.println("After typecasting "+ dou);
		
	}
	
	
	

}
