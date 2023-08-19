package com.kodnest.methods.methodoverloading;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
		System.out.println("enter your name");
		String name=scan.nextLine();
		greet(name);
		
	}
public static void greet(String name)
{
	System.out.println("hello "+name+" how are you..?");
	
}
}
