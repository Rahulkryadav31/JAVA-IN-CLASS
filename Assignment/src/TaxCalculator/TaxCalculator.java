package TaxCalculator;
import java.util.Scanner;
public class TaxCalculator
{
	static double CalculateTotalWithTax(double Pamt, double Tax)
	{
		return Pamt*(1+Tax);
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Pamt and Tax");
		double Pamt=scan.nextDouble();
		double Tax=scan.nextDouble();
		System.out.println("Total amount after tax calculation : "+CalculateTotalWithTax(Pamt,Tax));
		
		
		
	}

	
	
}
