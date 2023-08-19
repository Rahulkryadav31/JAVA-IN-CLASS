
public class Mob
{
String brand;
String color;
int cost;

public Mob(String brand, String color, int cost)
{
	
//Shadowing problem
//brand=brand;
//color=color;
//cost=cost;
	
this.brand=brand;
this.color=color;
this.cost=cost;

}

	void allowToCall()
	{
		
	System.out.println("Calling");
}
	void allowToPlay()
	{
		System.out.println("Start playing BGMI");
	}
	
}

