import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter age");
int age=scan.nextInt();
if (age>=18)
{
	System.out.println("you are eligible for Voting");
	
}
else
{
	System.out.println("you are not eligible for voting");
}
	}

}
