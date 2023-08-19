package TheCalculatorDilemma;
import java.util.Scanner;
public class TheCalculatorDilemma{
	public static void main (String[]args){
		Scanner scan=new Scanner(System.in);
		int a,b;
		String ans;
		do{
			System.out.println("Enter your choice..\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			int choice=scan.nextInt();
			System.out.println("Enter 2 integer");
			a=scan.nextInt();
			b=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Addition is "+(a+b));
				break;
				
			case 2:
				System.out.println("Subtraction is "+(a-b));
				break;
				
			case 3:
				System.out.println("Multiplication is "+(a*b));
				break;
				
			case 4:
				System.out.println("Division is "+(double)a/b);
				break;
				
				default:
					System.out.println("Wrong input");
					}
			System.out.println("Do you want to continue[y|n]?");
			ans=scan.next();
			}
		while(ans.equals("y"));
		}
}
