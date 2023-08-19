
public class TableApp {
public static void main (String[] args)
{
Table t1 =new Table();
t1.seatingCapacity=2;
t1.cost=4500;
t1.color="brown";
t1.brand="greenPly";

t1.allowtoSit();
t1.allowtoWrite();

System.out.println(t1.seatingCapacity +" "+ t1.cost +" "+ t1.color +" "+ t1.brand);

System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");


Table t2 =new Table();
t2.seatingCapacity=4;
t2.cost=3000;
t2.color="black";
t2.brand="greenPly";

t2.allowtoSit();
t2.allowtoWrite();


System.out.println(t2.seatingCapacity +" "+ t2.cost +" "+ t2.color +" "+ t2.brand);

}
}
