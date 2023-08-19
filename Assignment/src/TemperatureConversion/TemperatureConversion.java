package TemperatureConversion;
import java.util.Scanner;
public class TemperatureConversion
{
	static double CelToFar(double celsius)
	{
		return celsius*9/5+32;
	}
	static double FarToCel(double far)
	{
	return ((far-32)*5)/9;
	}

public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	String ans="y";
	do
	{
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option");
		System.out.println("1. Convert celsius to fahrenheit");
		System.out.println("2. Convert fahrenheit to celsius");
		
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter temperature in celsius : ");
			double celsius=scan.nextDouble();
			System.out.println("----------------");
			System.out.println(celsius+"°c temperature in fahrenheit "+CelToFar(celsius)+"°F");
			System.out.println("----------");
			break;
		case 2:
		    System.out.println("Enter temperature in fahrenheit : ");
		    double fahrenheit=scan.nextDouble();
		    System.out.println("----------------");
		    System.out.println(fahrenheit+"°f temperature in celsius "+FarToCel(fahrenheit)+"°c");
		    System.out.println("----------");
		    break;
		default:
			System.out.println("wrong input");
		}
		System.out.println("do you want to continue?[y/n] : ");
		ans=scan.next();
	}
	while(ans.equals("y"));
	System.out.println("Thanks for using Temperature Conversion Tool!! ;)");	
}
}





