package MethodOverloadingCalculator;
import java.util.Scanner;
public class MethodOverloadingCalculator {

	public static double calculate(double a, double b, char operator)
	{
		double result=0.0;
		switch(operator) {
		case'+':
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'*':
		result=a*b;
		break;
		case'/':
			if(b!=0)
			{
				result=a/b;
				
			}else
			{
				System.out.println("Division by zero is not allowed");
			}
			break;
				default:
					System.out.println("invalid operator");
					break;
					}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1=scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2=scan.nextDouble();
		System.out.println("Enter the operator (+, -, *, /): ");
		char operator=scan.next().charAt(0);
		double result=calculate(num1, num2, operator);
		System.out.println("result: "+result);
		scan.close();
		
	}

}













