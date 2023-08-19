package LogicalOperatorValidator;
import java.util.Scanner;
public class LogicalOperatorValidator 
{
	static boolean isValidInput(boolean inputIsValid, boolean meetsCondition)
	{
		return inputIsValid && meetsCondition;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter inputIsValid and meetsCondition");
		
		System.out.println("input is valid(true/false): ");
		boolean inputIsValid=scan.nextBoolean();
		
		System.out.println("meets condition(true/false): ");
		boolean meetsCondition=scan.nextBoolean();
		
		boolean isValidInput=isValidInput(inputIsValid, meetsCondition);
		 
		if (isValidInput)
		{
			System.out.println("Input is valid");
		}
		else
		{
			System.out.println("Input is not valid");
		}
	}
}
