
class MobileApp {

	public static void main(String[] args) 
	{
	
Mobile mobile=new Mobile("Samsung","Purple",125000);

	System.out.println(mobile.brand+" "+mobile.color+" "+mobile.cost);
	mobile.allowToCall();
	mobile.allowToPlay();
	//bellow line is error because compiler did not add default constructor as one user defines constructor is present in class
Mobile mobile2=new Mobile("apple","white",250000);

}

}

