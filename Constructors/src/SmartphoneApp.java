
public class SmartphoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smartphone smartphone=new Smartphone("samsung","Purple",125000);
System.out.println(smartphone.brand+" "+smartphone.color+" "+smartphone.cost);
System.out.println("+++++++++++++++++++++");

Smartphone smartphone2=new Smartphone("Apple","gold",250000);
System.out.println(smartphone2.brand+" "+smartphone2.color+" "+smartphone2.cost);
System.out.println("+++++++++++++++++++++");

Smartphone smartphone3=new Smartphone("x","Mi",400000);
System.out.println(smartphone3.brand+" "+smartphone3.color+" "+smartphone3.cost);
System.out.println("+++++++++++++++++++++");

Smartphone smartphone4=new Smartphone("gionee","silver",50000);
System.out.println(smartphone4.brand+" "+smartphone4.color+" "+smartphone4.cost);
System.out.println("+++++++++++++++++++++");
	}

}
