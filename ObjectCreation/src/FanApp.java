class FanApp {

	public static void main(String[] args) {
		
Fan f1=new Fan();
Fan f2=new Fan();
Fan f3=new Fan();

System.out.println("=========================================");
f1.no_of_Wings=3;
f1.cost=4500;
f1.color="white";
f1.brand="crompton";

System.out.println(f1.no_of_Wings+" "+f1.cost+" "+f1.color+" "+f1.brand);

f1.rotate();
f1.blow_Air();

System.out.println("=========================================");
f2.no_of_Wings=4;
f2.cost=3000;
f2.color="blue";
f2.brand="usha";

System.out.println(f2.no_of_Wings+ " "+f2.cost+" "+f2.color+" "+f2.brand);
f2.rotate();
f2.blow_Air();

System.out.println("=========================================");
f3.no_of_Wings=5;
f3.cost=5000;
f3.color="black";
f3.brand="bajaj";

System.out.println(f3.no_of_Wings+" "+f3.cost+" "+f3.color+" "+f3.brand);

f3.rotate();
f3.blow_Air();

}
}

