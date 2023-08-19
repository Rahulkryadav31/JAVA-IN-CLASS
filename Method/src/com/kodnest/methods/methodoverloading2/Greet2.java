package com.kodnest.methods.methodoverloading2;

import java.util.Scanner;

public class Greet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter your name and year of birth");
String name=scan.nextLine();
int yob=scan.nextInt();
Greet(name);
int res=calculateAge(yob);
System.out.println("you are "+res+" years old..");
	}
	
	public static void Greet(String name)
	{
		System.out.println("hello "+name);
		
	}
	
public static int calculateAge(int yob)
{
	return 2023-yob;
	}
		
}
