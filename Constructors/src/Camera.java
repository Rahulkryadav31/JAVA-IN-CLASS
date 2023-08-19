
public class Camera {
String color;
String brand;
int cost;

void captureImage()

{
	System.out.println("Camera color " +color+ " camera brand " +brand+ " camera cost " +cost+ " caputure image");
	
}
void displayImage()
{
	System.out.println("camera color " +color+ " camera brand " +brand+ " camera cost " +cost+ " display image");
	
}
//Constructor
public Camera(String x, String y, int z)
{
color=x;
brand=y;
cost=z;


}
public Camera() {
	// TODO Auto-generated constructor stub
}
}