import java.util.Scanner;

public class ElseifLader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter score");
int score=scan.nextInt();
if(score>=90)
{
	System.out.println("A+ grade");
}
else if(score>=80 && score<90)
{
	System.out.println("A grade");
	}
	else if(score>=70 && score<80)
	{
		System.out.println("B grade");
	}
	else if(score>=60 && score<70)
	{
		System.out.println("C grade");
	}
	else if(score>=50 && score<60)
	{
		System.out.println("D grade");
	}
	else
	{
		System.out.println("Fail... Get Lost...");
	}
	}
}
