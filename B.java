package AddNumbers;

import java.util.Scanner;

public class B {
	
	public void AddNumberNonStatic() {
		
		double n1 =23.2 ;
		double n2=33.4;
		double s=n1 + n2;
		System.out.println("Sum is "+ s);
	}
	
	public static void AddTwoNumbersStatic() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("The sum of two numbers is  "+ sum);
		scan.close();
	}
	

}
