
public class Smartphone
	{
		
	String brand;
	String color;
	int cost;

	public Smartphone(String a, String b, int c)
	{
		brand=a;
		color=b;
		cost=c;
		
	}
	public Smartphone()
	{
		brand="Apple";
		color="gold";
		cost=250000;
	}
	public Smartphone(String x)
	{
		brand="x";
		cost=40000;
	}
	public Smartphone(int c)
	{
		brand="Gionee";
		color="Silver";
		cost=c;
		
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

